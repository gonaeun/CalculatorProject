package projectWithClass;

public class Operation {
    public int add(int a, int b) {
        return a + b;
    }

    public  int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("오류 : 0으로 나눗셈이 불가합니다.");
            return 0;
        }
        return a / b;
    }
}
