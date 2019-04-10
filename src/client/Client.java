package client;

import beans.Wish;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/resources/applicationContext.xml");

        Wish w = (Wish) context.getBean("wishUser");

        w.wishUser();
    }
}
