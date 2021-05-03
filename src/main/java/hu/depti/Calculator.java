package hu.depti;

import java.math.*;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int substract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public double power(int a, int b) {
    return Math.pow(a, b);
  }

  public int divide(int a, int b) throws IllegalArgumentException {
    if (b == 0) {
      throw new IllegalArgumentException("Nullával való osztás nem értelmezett");
    }
    return a / b;
  }

  public int modulo(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Nullával való osztás nem értelmezett, így nem tudunk létező maradékot visszaadni");
    }
    return a % b;
  }

  public double squareRoot(int a) {
    return Math.sqrt(a);
  }
}
