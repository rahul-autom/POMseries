package seleniumsessions;

public class StringUtils {
	
	//private StringUtils() {}
	public static String getRandomEmail() {
		return "automation"+System.currentTimeMillis()+"@"+"opencart.com";
		//return "automation" + UUID.randomUUID()+"@opencart.com";
		//9999-999988-999888-
	}

}
