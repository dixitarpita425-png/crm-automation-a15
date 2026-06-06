package ddt_extra;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetDataFromXMLFile {
	
	@Parameters({"un", "pwd"})
	@Test
	public void loginDemo(String username, String password) {
//		String username = "admin";
//		String password = "manager";
		System.out.println(username + " " + password);
	}
	
//	@Parameters({"un", "pwd"})
//	@Test
//	public void fruits(String f1, String f2) {
//		System.out.println(f1 + " " + f2);
//	}
}
