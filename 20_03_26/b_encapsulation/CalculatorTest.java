package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		CalculatorExpr expr = new CalculatorExpr();
		String yn = "";
		do {	
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력");
		
		//입력값을 멤버변수에 저장 
		
		expr.setNum1(input.nextInt()); //first에 궂이 값저장을 할 필요없이 한번에 해결
		expr.setNum2(input.nextInt());
		
		System.out.println(expr.getNum1() + "," + expr.getNum2() );
		System.out.println("덧셈 : " + expr.getAddition());
		System.out.println("뺄셈 : " + expr.getSubtraction());
		System.out.println("곱셈 : " + expr.getMultiplication());
		System.out.println("나눗셈 : " + expr.getDivision());
		System.out.println("더할까(y/n)");
		yn = input.next();  // String yn 을 여기서 선언하면 do문의 지역변수가 됨 
		} while (yn.equals("y")); // String 비교할땐 equals를 써준다 
	
	}

}
