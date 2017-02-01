/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.webservice;

import ac.cr.una.examen.dao.BookDAO;
import ac.cr.una.examen.dao.BookDAOImp;
import ac.cr.una.examen.model.Book;
import ac.cr.una.examen.service.BookService;
import ac.cr.una.examen.service.BookServiceImp;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
@Path("books")
public class BookWebservice {

    private BookDAO bookDAO;
    private BookService bookService;

    @Context
    private UriInfo context;

    public BookWebservice() {
    }

    public BookWebservice(BookDAO bookDAO, BookService bookService, UriInfo context) {
        this.bookDAO = bookDAO;
        this.bookService = bookService;
        this.context = context;
    }

    @GET
    @Path(value = "/")
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        List<Book> bookList = null;
        bookDAO = new BookDAOImp();
        bookService = new BookServiceImp(bookDAO);

        bookList = bookService.findAll();

        return bookList;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public float getTotalPrice() {
        

        float au = 0;
        bookDAO = new BookDAOImp();
        bookService = new BookServiceImp(bookDAO);
        au = bookService.totalPriceAll();

        return au;
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book createBook(Book book) {

        bookDAO = new BookDAOImp();
        bookService = new BookServiceImp(bookDAO);

        book = bookService.save(book);

        return book;
    }

    @DELETE
    @Path("/")
    public boolean deleteAll() {
        boolean result;
        bookDAO = new BookDAOImp();
        bookService = new BookServiceImp(bookDAO);

        result = bookService.deleteAll();

        return result;
    }
}
