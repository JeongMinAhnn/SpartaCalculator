package semiProject;

import java.util.Scanner;

public class PjLv1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String exit = "";
    int n1;
    int n2;
    char sign;
    double answer = 0.0;

    while (!exit.equals("exit")) {
      System.out.println("첫 번째 양수를 입력하세요:");
      n1 = sc.nextInt();

      System.out.println("두 번째 양수를 입력하세요:");
      n2 = sc.nextInt();

      System.out.println("연산자를 입력하세요 (+, -, *, /)");
      sign = sc.next().charAt(0);
      answer = 0.0;

      if (sign == '+') {
        answer = n1 + n2;
      } else if (sign == '-') {
        answer = n1 - n2;
      } else if (sign == '*') {
        answer = n1 * n2;
      } else if (sign == '/') {
        if (n2 == 0) {
          System.out.println("0으로 나눌 수 없습니다.");
          continue;
        } else {
          answer = (double) n1 / n2;
        }
      } else {
        System.out.println("잘못된 연산자입니다.");
        continue;
      }

      System.out.println("결과: " + answer);

      sc.nextLine();
      System.out.println("종료를 원하면 'exit'를 입력하세요. 계속하려면 아무 키나 누르세요:");
      exit = sc.nextLine();
    }

    System.out.println("프로그램을 종료합니다.");

  }
}
