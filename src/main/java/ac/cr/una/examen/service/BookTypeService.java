/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.service;

import ac.cr.una.examen.model.BookType;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public interface BookTypeService {

    public boolean deleteAll();

    public BookType save(BookType bookType);

    public BookType findByName(String name);

}
