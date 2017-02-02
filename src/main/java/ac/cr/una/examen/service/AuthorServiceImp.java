/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.service;

import ac.cr.una.examen.dao.AuthorContactDAO;
import ac.cr.una.examen.dao.AuthorDAO;
import ac.cr.una.examen.model.Author;
import ac.cr.una.examen.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
public class AuthorServiceImp implements AuthorService {

    private AuthorDAO authorDAO;
    private AuthorContactDAO authorContDAO;

    /**
     *
     */
    public AuthorServiceImp() {
    }

    /**
     *
     * @param authorContDAO
     */
    public AuthorServiceImp(AuthorContactDAO authorContDAO) {
        this.authorContDAO = authorContDAO;
    }

    /**
     *
     * @param authorDAO
     */
    public AuthorServiceImp(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    /**
     *
     * @param authorDAO
     * @param authorContDAO
     */
    public AuthorServiceImp(AuthorDAO authorDAO, AuthorContactDAO authorContDAO) {
        this.authorDAO = authorDAO;
        this.authorContDAO = authorContDAO;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean deleteAll() {
        return authorContDAO.deleteAll();
    }

    /**
     *
     * @param author
     * @return
     */
    @Override
    public AuthorContact save(AuthorContact author) {
        return authorContDAO.save(author);
    }

    /**
     *
     * @return
     */
    @Override
    public List<AuthorContact> findAll() {
        return authorContDAO.findAll();
    }
    
    /**
     *
     * @param name
     * @return
     */
    @Override
    public Author findByName(String name) {
        return authorDAO.findByName(name);
    }

    /**
     *
     * @return
     */
    public AuthorDAO getAuthorDAO() {
        return authorDAO;
    }

    /**
     *
     * @param authorDAO
     */
    public void setAuthorDAO(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    /**
     *
     * @return
     */
    public AuthorContactDAO getAuthorContDAO() {
        return authorContDAO;
    }

    /**
     *
     * @param authorContDAO
     */
    public void setAuthorContDAO(AuthorContactDAO authorContDAO) {
        this.authorContDAO = authorContDAO;
    }

   

}
