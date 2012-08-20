package springapp.web;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;


public class HelloControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        Assert.assertEquals("hello.jsp", modelAndView.getViewName());
    }
}