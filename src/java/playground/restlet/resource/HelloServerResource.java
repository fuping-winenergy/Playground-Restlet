package playground.restlet.resource;

import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class HelloServerResource extends ServerResource implements
		BaseWinenergyServices {

	private String name;

	public HelloServerResource() {
	}

	@Override
	protected void doInit() throws ResourceException {
		this.name = (String) getRequestAttributes().get("name");

		System.out.println("The server resource was initialized.\n");
	}

	@Override
	protected void doCatch(Throwable throwable) {
		System.out.println("An exception was thrown in the server resource.");
	}

	@Override
	protected void doRelease() throws ResourceException {
		System.out.println("The server resource was released.\n");
	}

	@Override
	public String represent() {
		if (name != null)
			return "Hello " + name + "! Welcome to WINenergy";
		return "hello, WINenergy";
	}

}