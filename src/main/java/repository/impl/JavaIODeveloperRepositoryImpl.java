package repository.impl;


import model.Developer;
import org.hibernate.Session;
import repository.DeveloperRepository;
import repository.util.HibernateUtil;

import javax.persistence.Query;
import java.io.IOException;
import java.util.List;

import static org.hibernate.hql.internal.antlr.HqlTokenTypes.FROM;
import static org.hibernate.hql.internal.antlr.HqlTokenTypes.SELECT;


public class JavaIODeveloperRepositoryImpl implements DeveloperRepository {

    public JavaIODeveloperRepositoryImpl() {
    }

    public void save(Developer developer) throws IOException {
        Session session = HibernateUtil.getSession();
        session.save(developer);
        session.close();
    }

    public void delete(Long id) throws IOException {
        Session session = HibernateUtil.getSession();
        Developer deleteDeveloper = session.get(Developer.class,id);
        session.delete(deleteDeveloper);
        session.close();
    }

    public void update(Developer developer) throws IOException {
        Session session = HibernateUtil.getSession();
        session.update(developer);
        session.close();
    }

    public Developer getById(Long id) throws IOException {
        Session session = HibernateUtil.getSession();
        Developer developerGetById = session.get(Developer.class,id);
        session.close();
        return developerGetById;
    }

    public List<Developer> getAll() throws IOException {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM Developer");


        return query.getResultList();
    }
}
