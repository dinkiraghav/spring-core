package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

            Customer obj = (Customer) context.getBean("customer");
            obj.getId();
            obj.getFirstName();
            obj.getLastName();
            obj.getMobile();
            obj.getEmail();
            obj.getGender();
        }
}
