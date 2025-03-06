package projectWithoutCalss;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();

            System.out.print("두번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);

            int result = 0;
            boolean calculateSuccess = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("오류 : 0으로 나눗셈이 불가합니다.");
                        calculateSuccess = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("오류 : 잘못된 연산 기호를 입력하였습니다");
                    calculateSuccess = false;
            }

            if (calculateSuccess) {
                System.out.println("결과 : " + result);
            }

            System.out.println("더 계산하시겠습니까? exit 입력시 종료됩니다.");
            sc.nextLine();  // 버퍼 비우는 역할!
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        sc.close();  // Scanner 객체를 닫는 역할!
    }
}
