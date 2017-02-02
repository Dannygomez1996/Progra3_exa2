/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.service;

import ac.cr.una.examen.dao.BookTypeDAO;
import ac.cr.una.examen.model.BookType;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public class BookTypeServiceImp implements BookTypeService {

    private BookTypeDAO bookTypeDAO;

    /**
     *
     */
    public BookTypeServiceImp() {
    }

    /**
     *
     * @param bookTypeDAO
     */
    public BookTypeServiceImp(BookTypeDAO bookTypeDAO) {
        this.bookTypeDAO = bookTypeDAO;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean deleteAll() {
        return bookTypeDAO.deleteAll();
    }

    /**
     *
     * @param bookType
     * @return
     */
    @Override
    public BookType save(BookType bookType) {
        return bookTypeDAO.save(bookType);
    }

    /**
     *
     * @param name
     * @return
     */
    @Override
    public BookType findByName(String name) {
        return bookTypeDAO.findByName(name);
    }

    /**
     *
     * @return
     */
    public BookTypeDAO getBookTypeDAO() {
        return bookTypeDAO;
    }

    /**
     *
     * @param bookTypeDAO
     */
    public void setBookTypeDAO(BookTypeDAO bookTypeDAO) {
        this.bookTypeDAO = bookTypeDAO;
    }

}
