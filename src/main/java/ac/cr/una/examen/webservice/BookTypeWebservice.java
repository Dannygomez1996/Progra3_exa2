/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.webservice;


import ac.cr.una.examen.dao.BookDAOImp;
import ac.cr.una.examen.dao.BookTypeDAO;
import ac.cr.una.examen.dao.BookTypeDAOImp;
import ac.cr.una.examen.model.BookType;
import ac.cr.una.examen.service.BookTypeService;
import ac.cr.una.examen.service.BookTypeServiceImp;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
@Path("bookTypes")
public class BookTypeWebservice {
     private BookTypeDAO bookTypeDAO;
    private BookTypeService bookTypeService;

    @Context
    private UriInfo context;

    public BookTypeWebservice() {
    }

    public BookTypeWebservice(BookTypeDAO bookTypeDAO, BookTypeService bookTypeService, UriInfo context) {
        this.bookTypeDAO = bookTypeDAO;
        this.bookTypeService = bookTypeService;
        this.context = context;
    }
  

    @GET
    @Path("/{id}") 
    @Produces(MediaType.APPLICATION_JSON)
        public BookType getByName(@PathParam("name") String name) {
        BookType bookType = null;
        bookTypeDAO = new BookTypeDAOImp();
        bookTypeService = new BookTypeServiceImp(bookTypeDAO);

        bookType = bookTypeService.findByName(name);

        return bookType;
    
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public BookType createBook(BookType bookType) {

        bookTypeDAO = new BookTypeDAOImp();
        bookTypeService = new BookTypeServiceImp(bookTypeDAO);

        bookType = bookTypeService.save(bookType);

        return bookType;
    }

    @DELETE
    @Path("/")
    public boolean deleteAll() {
        boolean result;
        bookTypeDAO = new BookTypeDAOImp();
        bookTypeService = new BookTypeServiceImp(bookTypeDAO);

        result = bookTypeService.deleteAll();

        return result;
    }
}
