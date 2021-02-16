package ru.sapteh.Service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.Dao.Dao;
import ru.sapteh.Model.Manufacturer;

import java.util.List;


public class ManufacturerDao implements Dao<Manufacturer, Integer> {
    private final SessionFactory factory;


    public void add(){
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save();
            session.getTransaction().commit();


        }
    }
    @Override
    public ManufacturerDao(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Manufacturer manufacturer) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.save(manufacturer);
            session.getTransaction().commit();
        }

    }

    @Override
    public Manufacturer read(Integer id) {
        try(Session session = factory.openSession()){
                return session.get(Manufacturer.class, id);
        }


    @Override
    public List<Dao> readByAll(){
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save();
        }
    }
}


