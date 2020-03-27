package h_inheritPractice;

import java.util.Scanner;

public class Language {
	
	String hello, introduce, saySomething;
	int b;
	public Language() {
		Scanner in = new Scanner(System.in);
		System.out.println("메세지를 선택하세요(1.인사말 2.자기소개 3.하고픈말)");
		b = in.nextInt();
	
	}
	
	public void output() {
		if(b==1) {
			System.out.println(hello);
		}else if(b==2) {
			System.out.println(introduce);
		}else if(b==3) {
			System.out.println(saySomething);
		}
	}
	
	
	
	
	
	

}
