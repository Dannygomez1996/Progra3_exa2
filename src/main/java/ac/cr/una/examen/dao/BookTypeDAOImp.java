/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.dao;

import ac.cr.una.examen.model.BookType;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public class BookTypeDAOImp implements BookTypeDAO {
     private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     *
     * @param name
     * @return
     */
    @Override
    public BookType findByName(String name) {
        BookType author = null;
        Query query = session.createQuery("from BookType where name = :name ");
        query.setParameter("name", name);

        if (query.list().size() > 0) {
            author = (BookType) query.list().get(0);
        }

        return author;
    }

    /**
     *
     * @param author
     * @return
     */
    @Override
    public BookType save(BookType author) {
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
    public boolean deleteAll() {
       boolean isDeleted = false;
       
        List<BookType> bookList = new ArrayList<>();
        bookList = session.createCriteria(BookType.class).list();
        
        session.beginTransaction();
       
        session.delete(bookList);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }

}
