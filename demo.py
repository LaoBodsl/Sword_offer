import numpy as np
from sklearn.ensemble import AdaBoostClassifier
from sklearn import svm

data = np.loadtxt(open("overWBC.csv","r"),delimiter=",",skiprows=0) #WBC
print(np.shape(data))
train_data = data[0:811,0:9]
train_label = data[0:811,9]
test_data = data[812:,0:9]
test_label = data[812:,9]
print(np.shape(test_data))
print(np.shape(train_data))
print(np.shape(train_data))
print(train_label)

# data = np.loadtxt(open("overliver.csv","r"),delimiter=",",skiprows=0) #liver
# data_num,cols= np.shape(data)
# # print(cols)
# index = np.arange(data_num)
# np.random.shuffle(index)
# train_data = data[index[0:279],0:cols-1]
# train_label = data[index[0:279],cols-1]
# test_data = data[index[280:],0:cols-1]
# test_label = data[index[280:],cols-1]
# print(np.shape(test_data))
# print(np.shape(train_data))

# data = np.loadtxt(open("overheart.csv","r"),delimiter=",",skiprows=0) #heart
# data_num,cols= np.shape(data)
# # print(cols)
# index = np.arange(data_num)
# np.random.shuffle(index)
# train_data = data[index[0:220],0:cols-1]
# train_label = data[index[0:220],cols-1]
# test_data = data[index[221:],0:cols-1]
# test_label = data[index[221:],cols-1]
# print(np.shape(test_data))
# print(np.shape(train_data))

# data = np.loadtxt(open("overpima.csv","r"),delimiter=",",skiprows=0) #pima
# data_num,cols= np.shape(data)
# # print(cols)
# index = np.arange(data_num)
# np.random.shuffle(index)
# train_data = data[index[0:911],0:cols-1]
# train_label = data[index[0:911],cols-1]
# test_data = data[index[912:],0:cols-1]
# test_label = data[index[912:],cols-1]
# print(np.shape(test_data))
# print(np.shape(train_data))

# data = np.loadtxt(open("overParkinson.csv","r"),delimiter=",",skiprows=0) #parkinson
# data_num,cols= np.shape(data)
# # print(cols)
# index = np.arange(data_num)
# np.random.shuffle(index)
# train_data = data[index[0:236],0:cols-1]
# train_label = data[index[0:236],cols-1]
# test_data = data[index[237:],0:cols-1]
# test_label = data[index[237:],cols-1]
# print(np.shape(test_data))
# print(np.shape(train_data))

ada = AdaBoostClassifier(n_estimators=10,base_estimator=svm.SVC(probability=True))
ada.fit(train_data,train_label)
target=ada.predict(test_data)
acc = ada.score(test_data,test_label)
score=ada.predict_proba(test_data)
print(acc)

np.savetxt('WBCtest_label.csv',test_label,fmt='%.e',delimiter=',')
np.savetxt('WBCtarget.csv',target,fmt='%.e',delimiter=',')
np.savetxt('WBCscore.csv',score,fmt='%.e',delimiter=',')

# np.savetxt('livertest_label.csv',test_label,fmt='%.e',delimiter=',')
# np.savetxt('livertarget.csv',target,fmt='%.e',delimiter=',')
# np.savetxt('liverscore.csv',score,fmt='%.e',delimiter=',')

# np.savetxt('hearttest_label.csv',test_label,fmt='%.e',delimiter=',')
# np.savetxt('hearttarget.csv',target,fmt='%.e',delimiter=',')
# np.savetxt('heartscore.csv',score,fmt='%.e',delimiter=',')

# np.savetxt('pimattest_label.csv',test_label,fmt='%.e',delimiter=',')
# np.savetxt('pimattarget.csv',target,fmt='%.e',delimiter=',')
# np.savetxt('pimatscore.csv',score,fmt='%.e',delimiter=',')

# np.savetxt('parkinsonttest_label.csv',test_label,fmt='%.e',delimiter=',')
# np.savetxt('parkinsonttarget.csv',target,fmt='%.e',delimiter=',')
# np.savetxt('parkinsontscore.csv',score,fmt='%.e',delimiter=',')
# print(target)