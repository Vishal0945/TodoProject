package com.listener;
import com.entities.*;
import java.util.List;
import javax.servlet.ServletContext;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class myListener implements ServletContextListener
{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context created...." );
		List<allData> list=new ArrayList<allData>();
		ServletContext context=sce.getServletContext();
		context.setAttribute("list",list);
		}
	

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	

}
}