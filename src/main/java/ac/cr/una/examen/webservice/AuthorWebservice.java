/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.webservice;

import ac.cr.una.examen.dao.AuthorContactDAO;
import ac.cr.una.examen.dao.AuthorContactDAOImp;
import ac.cr.una.examen.dao.AuthorDAO;
import ac.cr.una.examen.dao.AuthorDAOImp;
import ac.cr.una.examen.model.Author;
import ac.cr.una.examen.model.AuthorContact;
import ac.cr.una.examen.service.AuthorService;
import ac.cr.una.examen.service.AuthorServiceImp;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
@Path("authors")
public class AuthorWebservice {

    private AuthorDAO authorDAO;
    private AuthorContactDAO authorContactDAO;
    private AuthorService authorService;

    @Context
    private UriInfo context;

    /**
     *
     * @param authorDAO
     * @param authorContactDAO
     * @param authorService
     * @param context
     */
    public AuthorWebservice(AuthorDAO authorDAO, AuthorContactDAO authorContactDAO, AuthorService authorService, UriInfo context) {
        this.authorDAO = authorDAO;
        this.authorContactDAO = authorContactDAO;
        this.authorService = authorService;
        this.context = context;
    }

    /**
     *
     */
    public AuthorWebservice() {
    }

    /**
     *
     * @return
     */
    @GET
    @Path(value = "/")
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<AuthorContact> getAllAuthors() {
        List<AuthorContact> authorList = null;
        authorDAO = new AuthorDAOImp();
        authorService = new AuthorServiceImp(authorDAO);

        authorList = authorService.findAll();

        return authorList;
    }

    /**
     *
     * @param name
     * @return
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Author getAuthorByName(@PathParam("name") String name) {
        Author au = null;
        authorDAO = new AuthorDAOImp();
        authorService = new AuthorServiceImp(authorDAO);

        au = authorService.findByName(name);

        return au;
    }

    /**
     *
     * @param au
     * @return
     */
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AuthorContact createAuthor(AuthorContact au) {

        authorContactDAO = new AuthorContactDAOImp();
        authorService = new AuthorServiceImp(authorContactDAO);

        au = authorService.save(au);

        return au;
    }

    /**
     *
     * @return
     */
    @DELETE
    @Path("/")
    public boolean deleteAll() {
        boolean result;
        authorDAO = new AuthorDAOImp();
        authorService = new AuthorServiceImp(authorDAO);

        result = authorService.deleteAll();

        return result;
    }
}
