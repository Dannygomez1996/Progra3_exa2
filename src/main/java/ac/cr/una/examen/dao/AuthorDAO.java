/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.dao;

import ac.cr.una.examen.model.Author;
import java.util.List;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public interface AuthorDAO {

    /**
     *
     * @param name
     * @return
     */
    public Author findByName (String name);
    
}
