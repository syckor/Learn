package h_ingerit2;

import java.awt.Frame;


// is-a : MyFrame2 is a Frame
class MyFrame2 extends Frame{
	
	MyFrame2(){
		
		//super(); 우리가 안해도 자동으로 들어옴
		super("나의 두번재 화면");
		setSize(500,300);
		setVisible(true);
		
	}
}
public class Test2 {	
	public static void main(String[] args) {
		new MyFrame2();
	}

}
