package semiProject;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    double result1 = calculator.calculate(5,10,'+');
    double result2 = calculator.calculate(320,133,'-');
    double result3 = calculator.calculate(1280,8,'/');
    double result4 = calculator.calculate(67,3,'*');

    ArrayList <Double> resultList = calculator.getResult();

    for(Double resultR : resultList){
      System.out.println(resultR);
    }




  }
}
