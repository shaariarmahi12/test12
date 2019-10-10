import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public void add (int a, int b) { 
		System.out.println(a+b);
	}
	public void Hello(String name) {
		System.out.println("Hi"+name);
		
		
	}
	public void Chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		 
		dr.get("http://www.facebook.com");
		
	}
	}


	


	

