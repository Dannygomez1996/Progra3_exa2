/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.dao;

import ac.cr.una.examen.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public class BookDAOImp implements BookDAO{
     private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     *
     * @param author
     * @return
     */
    @Override
    public Book save(Book author) {
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();

        return author;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Book> findAll() {
        List<Book> authorList = new ArrayList<>();

        authorList = session.createCriteria(Book.class).list();

        return authorList;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;
        List<Book> b = null;

        session.beginTransaction();
        b= findAll();
        session.delete(b);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }

}
