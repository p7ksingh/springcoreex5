package springcore_beanscopex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
  public static void main(String[] args) {
    // start IOC containet
    ApplicationContext context = new ClassPathXmlApplicationContext("springcore_beanscopex.xml");
    System.out.println("*".repeat(40));
  Greeting g1 =context.getBean("greeting", Greeting.class);
  Greeting g2 =context.getBean("greeting", Greeting.class);
  Greeting g3 =context.getBean("greeting", Greeting.class);
  System.out.println(g1 );
  System.out.println(g2 );
  System.out.println(g3 );

  }
}
