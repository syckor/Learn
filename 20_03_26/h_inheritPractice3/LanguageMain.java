package h_inheritPractice3;

import java.util.Scanner;

public class LanguageMain {

	public static void main(String[] args) {
		Language la = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("언어를 선택하세요 (1.한국어 2.영어 3.일본어)");
		int a = input.nextInt();
		
		System.out.println("메시지를 선택하세요(1.인사말 2.자기소개 3.하고픈말)");
		int b = input.nextInt();
		
		switch(a) {
		case 1 : la = new Kor();break;
		case 2 : la = new Eng();break;
		case 3 : la = new Jan();break;
		}
		
		switch(b) {
		case 1 : la.hello();break;
		case 2 : la.introduce();break;
		case 3 : la.saySomething();break;
		}
		

	}

}
