package mypoject;

import mypoject.service.service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Student on 5/25/2015.
 */
public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        service service = context.getBean(service.class);

        String country="Ukraine";
       String  conversionRate = service.GetCitiesByCountry(country);

        System.out.println(conversionRate);


    }


}
