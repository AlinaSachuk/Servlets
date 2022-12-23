package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Start Listener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("End Listener");
    }
}
