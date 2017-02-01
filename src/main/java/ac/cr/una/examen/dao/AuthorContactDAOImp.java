/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.dao;

import ac.cr.una.examen.model.AuthorContact;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public class AuthorContactDAOImp implements AuthorContactDAO{
     private final Session session = HibernateUtil.getSessionFactory().openSession();

  

    @Override
    public AuthorContact save(AuthorContact author) {
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();

        return author;
    }

   
    @Override
    public List<AuthorContact> findAll() {
        List<AuthorContact> authorList = new ArrayList<>();

        authorList = session.createCriteria(AuthorContact.class).list();

        return authorList;
    }

    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;
        List<AuthorContact> au = null;

        session.beginTransaction();
        au= findAll();
        session.delete(au);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }

}
