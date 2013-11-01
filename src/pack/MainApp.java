package pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {

      AbstractApplicationContext context = 
                          new ClassPathXmlApplicationContext("applicationContext.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      
      /**Below line of code is responsible for registration so that DESTROY
      method could be called*/
      context.registerShutdownHook();
   }
}
