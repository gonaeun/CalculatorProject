package projectWithClass;

public class App {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Calculator calculator = new Calculator();

        while (true) {
            int num1 = parser.getNumber("첫번째 숫자를 입력하세요 : ");
            int num2 = parser.getNumber("두번째 숫자를 입력하세요 : ");
            char operator = parser.getOperator();

            int result = calculator.calculate(num1, num2, operator);

            // 연산이 성공한 경우에만 결과 출력되도록
            if (result != Integer.MIN_VALUE) {
                System.out.println("결과: " + result);
            }

            System.out.println("계속 계산하시겠습니까? exit 입력시 종료됩니다.");
            parser.getNextLine();  // 버퍼 비우기 // parser.sc.nextLine(); 이라고 직접 호출하지 않고 getNextLine 메서드 사용
            String input = parser.getNextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
