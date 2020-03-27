package e_static_sample;

public class DBconnect {
	
	static DBconnect con;
	
	private DBconnect() {
		System.out.println("실제 DB연결");
	}
	
	public static DBconnect getInstance() {
		if(con == null) con = new DBconnect();
		return con;
	}
	
	
}
