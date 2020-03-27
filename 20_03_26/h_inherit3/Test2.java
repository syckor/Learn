package h_inherit3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
			
		  Item i = null;
		
		  Scanner input = new Scanner(System.in);
		  System.out.println("상품선택(1. Book  2.Dvd   3.Cd");
		  int sel = input.nextInt();
		  switch(sel) {
		  //부모변수에 자식생성 가능함
		  case 1: i = new Book("0001","자바","홍길동","코스모"); break;
		  case 2: i = new Dvd("002","킹덤","주지훈","김은희"); break;
		  case 3: i = new Cd("00001","아는노래","지코"); break;//Item i = new Cd();
		  }
		  // 출력*****
		  i.output();
		  //다형성 경우에 따라서 다양하게 불러준다
		  // 1.부모변수에 자식객체 생성 가능해야함
		  // 2.overriding이 돼있어야함

	}

}
