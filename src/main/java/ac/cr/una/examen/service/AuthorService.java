/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.service;

import ac.cr.una.examen.model.Author;
import ac.cr.una.examen.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public interface AuthorService {

    /**
     *
     * @return
     */
    public boolean deleteAll();

    /**
     *
     * @param author
     * @return
     */
    public AuthorContact save(AuthorContact author);

    /**
     *
     * @return
     */
    public List<AuthorContact> findAll();

    /**
     *
     * @param name
     * @return
     */
    public Author findByName(String name);

}
