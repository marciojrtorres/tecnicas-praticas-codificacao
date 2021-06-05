package geradores;

import java.util.Iterator;

public class Fib implements Iterable<Integer> {
  
  private final int max;

  public Fib(int max) {
    this.max = max;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new FibIterator();
  }
  
  private class FibIterator implements Iterator<Integer> {
    
    private int fib = 0;
    private int res = 1;

    @Override
    public boolean hasNext() {
      return fib < max;
    }

    @Override
    public Integer next() {
      int temp = res;
      res = res + fib;
      fib = temp;
      return fib;
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
  
  public static void main(String[] args) {
    for (int n : new Fib(100)) {
      System.out.println(n);
    }
  }
}