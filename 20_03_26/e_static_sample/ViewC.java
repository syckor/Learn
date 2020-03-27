package e_static_sample;

public class ViewC {
	
	DBconnect db;
	
	public ViewC() {
		db = DBconnect.getInstance();
	}
	
	
	public void use() {
		System.out.println("DB 작업중");
	}

}
