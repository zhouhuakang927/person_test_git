package testgit.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyDataContextLoaderListener implements ServletContextListener{

	private ServletContext context;
	
	public MyDataContextLoaderListener() {
		
	}
	public void contextInitialized(ServletContextEvent event) {
		this.context=event.getServletContext();
		this.context.setAttribute("myData", "this is myData");
	}

	public void contextDestroyed(ServletContextEvent event) {
		this.context=null;
	}

}
