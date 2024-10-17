package semiProject;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner sc = new Scanner(System.in);
    String exit = "";
    int n1;
    int n2;
    char sign;

    while (!exit.equals("exit")) {
      System.out.println("첫 번째 양수를 입력하세요:");
      n1 = sc.nextInt();

      System.out.println("두 번째 양수를 입력하세요:");
      n2 = sc.nextInt();

      System.out.println("연산자를 입력하세요 (+, -, *, /)");
      sign = sc.next().charAt(0);

      double result = calculator.calculate(n1, n2, sign);


      System.out.println("결과: " + result);

      sc.nextLine();
      System.out.println("종료를 원하면 'exit'를 입력하세요. 계속하려면 아무 키나 누르세요:");
      exit = sc.nextLine();
    }

    System.out.println("프로그램을 종료합니다.");
    calculator.deleteList();
    ArrayList<Double> resultList = calculator.getResult();
    for (Double result : resultList) {
      System.out.println(result);
    }

  }
}
