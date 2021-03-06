/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.service;

import ac.cr.una.examen.dao.AuthorContactDAO;
import ac.cr.una.examen.dao.AuthorDAO;
import ac.cr.una.examen.dao.BookDAO;
import ac.cr.una.examen.model.Book;


import java.util.List;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public class BookServiceImp implements BookService{
    private BookDAO bookDAO;

    /**
     *
     */
    public BookServiceImp() {
    }

    /**
     *
     * @param bookDAO
     */
    public BookServiceImp(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
  
    /**
     *
     * @return
     */
    @Override
    public boolean deleteAll() {
        return bookDAO.deleteAll();
    }

    /**
     *
     * @param book
     * @return
     */
    @Override
    public Book save(Book book) {
        return bookDAO.save(book);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    /**
     *
     * @return
     */
    @Override
    public float totalPriceAll() {
       return 0;
    }

    /**
     *
     * @return
     */
    public BookDAO getBookDAO() {
        return bookDAO;
    }

    /**
     *
     * @param bookDAO
     */
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    
}
