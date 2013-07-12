package playground.restlet.resource;

import org.restlet.resource.Get;

public interface BaseWinenergyServices {

	@Get("txt")
	public String represent();
}
