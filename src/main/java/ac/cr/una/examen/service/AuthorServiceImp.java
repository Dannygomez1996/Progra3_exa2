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

    public AuthorServiceImp() {
    }

    public AuthorServiceImp(AuthorContactDAO authorContDAO) {
        this.authorContDAO = authorContDAO;
    }

    public AuthorServiceImp(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    public AuthorServiceImp(AuthorDAO authorDAO, AuthorContactDAO authorContDAO) {
        this.authorDAO = authorDAO;
        this.authorContDAO = authorContDAO;
    }

    
    @Override
    public boolean deleteAll() {
        return authorContDAO.deleteAll();
    }

    @Override
    public AuthorContact save(AuthorContact author) {
        return authorContDAO.save(author);
    }

    @Override
    public List<AuthorContact> findAll() {
        return authorContDAO.findAll();
    }
    

    @Override
    public Author findByName(String name) {
        return authorDAO.findByName(name);
    }

    public AuthorDAO getAuthorDAO() {
        return authorDAO;
    }

    public void setAuthorDAO(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    public AuthorContactDAO getAuthorContDAO() {
        return authorContDAO;
    }

    public void setAuthorContDAO(AuthorContactDAO authorContDAO) {
        this.authorContDAO = authorContDAO;
    }

   

}
