package com.blyang;
 
public class Dijkstra {
	
	private final int INF = Integer.MAX_VALUE;
	
	int[][] Matrix;
	char[] Nodes;
	
	public Dijkstra(char[] Nodes, int[][] Matrix){
		this.Nodes = Nodes;
		this.Matrix = Matrix;
	}
	
	/**
	 * dijkstra算法
	 * 
	 * 参数说明：
	 * @param node  起点
	 * @param distance 长度数组，distance[i]表示从起点到i点的最短路径
	 */
	public void dijkstra(int node, int[] distance){
		
		boolean[] flag = new boolean[Nodes.length];
		
		//初始化
		for(int i=0; i<Nodes.length; i++){
			flag[i] = false;
			distance[i] = Matrix[node][i];
		}
		
		//对顶点node本身进行初始化
		flag[node] = true;
		distance[node] = 0;
		
		//遍历Nodes.length - 1次，每次找出一个顶点点最短路径
		int k = 0;
		for(int i=1; i<Nodes.length; i++){
			int min = INF;
			
			//寻找最短路径
			for(int j=0; j<Nodes.length; j++){
				if(flag[j] == false && distance[j] < min){
					k = j;
					min = distance[j];
				}
			}
			flag[k] = true;
			
			//更新Matrix点值
			for(int j=0; j<Nodes.length; j++){
				int len = Matrix[k][j] == INF ? INF : min + Matrix[k][j];
				if(flag[j] == false && len < distance[j]){
					distance[j] = len;
				}
			}
		}
		
		System.out.printf("Dijkstra(%c): \n", Nodes[node]);
		
		for (int i=0; i < Nodes.length; i++) 
            System.out.printf("  shortest(%c, %c)=%d\n", Nodes[node], Nodes[i], distance[i]);
		
		
	}
	
 
}