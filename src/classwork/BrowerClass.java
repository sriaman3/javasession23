package classwork;

public class BrowerClass {
	
	

	public static void main(String[] args) {
		
		BrowerClass browser = new BrowerClass();
		browser.getBrowser("Chrome");

	}
	
	public void getBrowser(String browser) {
		
		if(browser.isBlank()) {
			System.out.println("Please share the correct browser" + browser + "name");
		}else if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Chrome is launched");
		}else if(browser.trim().equalsIgnoreCase("firefox")) {
			System.out.println("Firefox is launched");
		}else {
			System.out.println("Please share the correct browser" + browser + "name");
		}
	}

}
