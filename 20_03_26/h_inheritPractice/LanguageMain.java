package h_inheritPractice;

import java.util.Scanner;

public class LanguageMain {

	public static void main(String[] args) {
		String yn = "";
		do {
		Language i = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("언어를 선택하세요 (1.한국어  2.영어 3.일본어)");
		int a = input.nextInt();
		
		
			
		
		switch(a) {
		case 1 : i = new Kor();break;
		case 2 : i = new Eng();break;
		case 3 : i = new Jan();break;
		}
		i.output();
		System.out.println("다시하시겠습니까(y/n)");
		
		yn = input.next();
		}while (yn.equals("y"));

	}

}
