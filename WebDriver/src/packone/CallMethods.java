package packone;

public class CallMethods {

	public static void main(String[] args) throws Exception{
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com", "C:\\Users\\DELL\\Desktop\\10WD\\FB.png");
		m.elementPresent("email", true);
		m.elementPresent("pass", false);
		m.elementPresent("day", true);
		m.elementPresent("month", false);
		m.elementsCount("a", 50);
		m.elementsCount("select", 3);
		m.closeApp();
		m.launchApp("http://bharatmatrimony.com", "C:\\Users\\DELL\\Desktop\\10WD\\BM.png");
		m.elementPresent("NAME", true);
		m.elementsCount("img", 40);
		m.closeApp();
		

	}

}
