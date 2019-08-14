import os
filepath = '/Users/laobo/Desktop/demo'
fileName = os.listdir(filepath)
# dict={'d':1}
# dict.setdefault('da','ad')
# print(dict)
ls = []
for filename in fileName:
    temp=filename.split('.')
    ls.append(temp[0])

if '2016 IJCIM 6' not in ls:
    print('2016 IJCIM 6 not in')

if '2016 IJCIM' not in ls:
    print('2016 IJCIM not in')

