package org.testing.utilities;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class LogsCapture {

	public static void takelog(String className,String message) {
		DOMConfigurator.configure("../YTFramework2_ManageableForm/layout.xml");
		Logger Log=Logger.getLogger(className);
		Log.info(message);
	}
}
