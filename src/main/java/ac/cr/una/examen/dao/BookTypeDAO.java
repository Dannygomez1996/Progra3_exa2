/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.dao;

import ac.cr.una.examen.model.BookType;
import java.util.List;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public interface BookTypeDAO {

    /**
     *
     * @param name
     * @return
     */
    public BookType findByName (String name);

    /**
     *
     * @param book
     * @return
     */
    public BookType save(BookType book);

    /**
     *
     * @return
     */
    public boolean deleteAll(); 
}
