package week1.day2;

public class Browser {
public String launchBrower(String browserName) {
	// TODO Auto-generated method stub
System.out.println("Browser launched successfully");
return browserName;
}
public void loadURL() {
	// TODO Auto-generated method stub
System.out.println("Application url loaded successfully");
}
public static void main(String[] args) {
	Browser b= new Browser();
    b.launchBrower("Safari");
    b.loadURL();
}
}