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

    public boolean deleteAll();

    public AuthorContact save(AuthorContact author);

    public List<AuthorContact> findAll();

    public Author findByName(String name);

}
