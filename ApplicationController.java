import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.Dispatch;

public class ApplicationController {
	
	private final Dispatch dispatcher;
	
	public ApplicationController() {
		
		dispatcher = new Dispatch();
		
	}
	
	private boolean isAuthenticUser() {
		
		System.out.println("User is authenticated successfully.");
		return true;
	}
	
	private void trackRequest(String request) {
		
		System.out.println("Page Request: " + request);
		
	}
	
	public void dispatchRequest( String request ) {
		
		trackRequest(request);
		
		if(isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
}
