package playground;

import org.restlet.Component;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Play {
	public static void main(String... args) throws Exception {
		// load the Spring application context
		ApplicationContext springContext =
				new FileSystemXmlApplicationContext(
						"src/conf/spring-restlet.xml");

		// obtain the Restlet component from the Spring context and start it
		((Component) springContext.getBean("component")).start();
	}
}
