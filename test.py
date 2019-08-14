import random
import numpy as np
x = np.arange(20)
x = x.reshape(4,5)
n = np.arange(4)
random.shuffle(n)
data = x[n[0:4],:]
print(data)