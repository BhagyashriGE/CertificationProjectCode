package utilities;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Logging {

	public static Logger getLogger(String className) {
		Logger log=Logger.getLogger(className);
		PropertyConfigurator.configure("log4j.properties");
		return log;
	}

}
