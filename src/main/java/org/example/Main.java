package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setFullName("Alisher");
//        person.setAge(30);
//        person.setAddress("Urganch");
//        person.testPersonMethod();

//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Person person = context.getBean(Person.class); // Person class ichidagi deb aytdik
//        System.out.println(person);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("org.example");
//        context.refresh();
////        Person person = (Person) context.getBean("person");
//        Person person = context.getBean(Person.class);
//        System.out.println(person);

        Address address = new Address("Urganch","Bog`izor","25");
        Person person = new Person(address);
        System.out.println(person);



    }
}
