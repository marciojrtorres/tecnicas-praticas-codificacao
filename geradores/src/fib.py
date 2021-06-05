def fib(max = 2^16-1):
  fib = 0
  res = 1
  while fib < max:
    print 'info: gerando'
    temp = res
    res = res + fib
    fib = temp
    yield fib
    
for n in fib(100):
  print 'info: percorrendo'
  print n