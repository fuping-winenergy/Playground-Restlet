package playground.restlet;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.routing.Filter;

public class WinenergyBlocker extends Filter {

	private final Set<String> allowedAddresses; 
	
	public WinenergyBlocker() { 
		super();
		this.allowedAddresses = new CopyOnWriteArraySet<String>();
		this.allowedAddresses.add("0:0:0:0:0:0:0:1");
		this.allowedAddresses.add("127.0.0.1");
	}
	
	@Override
	protected int beforeHandle(Request request, Response response) {
		int result = STOP;
		
		if (getAllowedAddresses().contains(request.getClientInfo().getAddress())) {
			result = CONTINUE;
		} else {
			response.setStatus(Status.CLIENT_ERROR_FORBIDDEN, "Your IP address is blocked");
		}
	
		return result;
	}
	
	public Set<String> getAllowedAddresses() {
		return allowedAddresses;
	}
	
}
