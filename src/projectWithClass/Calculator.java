package projectWithClass;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private Operation operation;
    private List<Integer> results; // 결과저장리스트

    public Calculator() {
        this.operation = new Operation();
        this.results = new ArrayList<>(); // 리스트 초기화
    }

    public int calculate(int num1, int num2, char operator) {
        int result = 0;
        boolean calculateSuccess = true;

        switch (operator) {
            case '+': result = operation.add(num1, num2); break;
            case '-': result = operation.subtract(num1, num2); break;
            case '*': result = operation.multiply(num1, num2); break;
            case '/':
                if (num2 == 0) {
                    System.out.println("오류: 0으로 나눗셈이 불가합니다.");
                    calculateSuccess = false; // 연산 실패 처리
                } else {
                    result = operation.divide(num1, num2);
                }
                break;
            default:
                System.out.println("오류 : 잘못된 연산 기호를 입력하였습니다");
                return 0;
        }

        if (calculateSuccess) {
            results.add(result); // 연산이 성공했을 때만 값 저장하도록
        }

        return calculateSuccess ? result : Integer.MIN_VALUE; // 연산 실패 시 Integer.MIN_VALUE 반환
    }

    public List<Integer> getResults() {
        return results;
    }

}
