package projectWithClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parser {
    private Scanner sc;

    public Parser() {
        this.sc = new Scanner(System.in);
    }

    public int getNumber(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("오류 : 숫자를 입력해주세요");
                sc.nextLine();
            }
        }
    }

    public char getOperator() {
        while (true) {
            System.out.println("사칙연산 기호를 입력하세요");
            String input = sc.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println("오류 : 올바른 연산 기호를 입력하세요");
            }
        }
    }

    // Scanner 객체를 외부에서 사용할 수 있도록
    public String getNextLine() {
        return sc.nextLine();
    }
}
