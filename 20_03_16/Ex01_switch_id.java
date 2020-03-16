package c_control;

public class Ex01_switch_id {

	public static void main(String[] args) {
		
		String id = "010123-1507195";
		char from = id.charAt(8); 
		String home = "";
		
		switch(from) {
		default : home = "한국인"; break;
		case '0' : home = "서울"; break;
		case '1' : home = "인천/부산"; break;
		case '2' : home = "경기도"; break;		
		}
		System.out.println("출신지는 " + home + "입니다");
		
		

	}

}
