/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.service;

import ac.cr.una.examen.model.Book;
import ac.cr.una.examen.model.BookType;
import java.util.List;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public interface BookService {

    public boolean deleteAll();

    public Book save(Book book);

    public List<Book> findAll();

    public float totalPriceAll();

}
