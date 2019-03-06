package com.teamtreehouse.contactmgr;

import model.Contact;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class Application {
    //private static final SessionFactory sessionFactory = buildSesssionFactory();

    private static SessionFactory buildSesssionFactory() {
        final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static void main(String[] args) {
        Contact contact = new Contact.ContactBuilder("Chris", "Ramacciotti")
                .withEmail("rama@teamtreehouse.com")
                .withPhone(7735556666L)
                .build();
        System.out.println(contact);
    }
}
