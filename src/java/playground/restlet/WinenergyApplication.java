package playground.restlet;

import org.restlet.Application;

public class WinenergyApplication extends Application {

//	private Context context;
//	
//	public WinenergyApplication(Context context) {
//		super();
//		this.context = context;
//	   
//		setName("WINenergy Connection Manager");
//		setDescription("RESTful web services");
//		setOwner("WINenergy");
//		setAuthor("Fuping Ma");	
//	    
//	}
//	
//	/** 
//     * Creates a root Restlet that will receive all incoming calls. 
//     */  
//    @Override  
//    public synchronized Restlet createInboundRoot() {  
//    	//Create a filter, only allowed IP addresses could go through
//        WinenergyBlocker blocker = new WinenergyBlocker(getContext());
//        blocker.getAllowedAddresses().add("0:0:0:0:0:0:0:1");
//    	blocker.setNext(HelloServerResource.class);
//    	
//    	// Create a router Restlet that routes each call to a  
//        // new instance of HelloServerResource.  
//        Router router = new Router(getContext());  
//  
//        // Defines only one route  
////        router.attach("/hello", HelloServerResource.class);  
//        router.attach("/hello/{name}", blocker);  
//        
//        return router;
//    }
//
//	public Context getContext() {
//		return context;
//	}
//
//	public void setContext(Context context) {
//		this.context = context;
//	}
    
}
