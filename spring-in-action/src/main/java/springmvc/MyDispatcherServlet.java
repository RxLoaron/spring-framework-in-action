package springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lyp3314@gmail.com on 2017/9/7.
 */

public class MyDispatcherServlet extends DispatcherServlet {
    @Override
    protected void initStrategies(ApplicationContext context) {
        super.initStrategies(context);
        System.out.println("-------MyDispatcherServlet--initStrategies()--");

    }

    @Override
    protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
        super.doService(request, response);

    }

}
