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
        switch (operator) {
            case '+': result = operation.add(num1, num2); break;
            case '-': result = operation.subtract(num1, num2); break;
            case '*': result = operation.multiply(num1, num2); break;
            case '/': result = operation.divide(num1, num2); break;
            default:
                System.out.println("오류 : 잘못된 연산 기호를 입력하였습니다");
                return 0;
        }
        results.add(result); // 결과 저장하기
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

}
