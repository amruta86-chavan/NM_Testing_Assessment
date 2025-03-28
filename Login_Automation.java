
package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Register {

public static void main(String[] args) {
WebDriver wd=new FirefoxDriver();
wd.get("https://testffc.nimapinfotech.com/");



wd.findElement(By.id("mat-input-0")).sendKeys("amrutac1986@gmail.com");

wd.findElement(By.id("mat-input-1")).sendKeys("$Amruta$86");

wd.findElement(By.id("kt_login_signin_submit")).click();
	


}

}