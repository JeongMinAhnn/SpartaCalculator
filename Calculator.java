package semiProject;

import java.util.ArrayList;

public class Calculator {

  private final ArrayList <Double> result = new ArrayList<Double>();


  public double calculate(int n1, int n2, char sign) {
    if (sign == '+') {
      result.add((double) (n1+n2));
      return n1 + n2;
    } else if (sign == '-') {
      result.add((double) (n1-n2));
      return n1 - n2;
    } else if (sign == '*') {
      result.add((double) (n1*n2));
      return n1 * n2;
    } else if (sign == '/') {
      if (n2 == 0) {
        System.out.println("0으로 나눌 수 없습니다.");

      } else {
        result.add((double) (n1/n2));
        return (double) n1 / n2;
      }
    }
    return 0.0;
  }

  public ArrayList<Double> getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result.add(result);
  }
  public void deleteList() {
    result.remove(0);
  }
}
