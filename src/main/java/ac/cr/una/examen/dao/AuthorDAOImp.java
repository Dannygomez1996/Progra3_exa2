/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.dao;

import ac.cr.una.examen.model.Author;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public class AuthorDAOImp implements AuthorDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     *
     * @param name
     * @return
     */
    @Override
    public Author findByName(String name) {
        Author author = null;
        Query query = session.createQuery("from Author where name = :name ");
        query.setParameter("name", name);

        if (query.list().size() > 0) {
            author = (Author) query.list().get(0);
        }

        return author;
    }

    
}
