/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.dao;

import ac.cr.una.examen.model.Book;
import java.util.List;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public interface BookDAO {

    /**
     *
     * @param book
     * @return
     */
    public Book save(Book book);

    /**
     *
     * @return
     */
    public List<Book> findAll ();

    /**
     *
     * @return
     */
    public boolean deleteAll(); 
}
