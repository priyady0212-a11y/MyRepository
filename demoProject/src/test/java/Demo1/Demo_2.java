package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		act.click();
		}

}
