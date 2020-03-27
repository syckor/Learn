package h_ingerit2;

import java.awt.*;

public class Test {

	public static void main(String[] args) {
		new MyFrame1();			
	}

}
//has-a : MyFrame1 has a Frame
class MyFrame1{
	Frame f;
	
	MyFrame1(){
		f = new Frame("나의 첫 화면");
		f.setSize(500,300);
		f.setVisible(true);
	}
}
