package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testing.base.Base;

public class DropDown extends Base {

	public void selectByVisibleText(WebElement element,String VisibleText) {
		Select s=new Select(element);
		s.selectByVisibleText(VisibleText);
		System.out.println("Select by visible text");
	}
	public void selectByIndex(WebElement element,String Index) {
		Select s=new Select(element);
		s.selectByVisibleText(Index);
		
		System.out.println("Select by Index No");
	}
	public void selectByValue(WebElement element,String Value) {
		Select s=new Select(element);
		s.selectByVisibleText(Value);
		
		System.out.println("Select by Value");
	}
}
