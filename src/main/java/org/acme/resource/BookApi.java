package org.acme.resource;

import org.acme.daman.Book;
import org.acme.repository.BookRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Optional;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/12/9 10:35
 * @Version: v1.0
 * @Modified：
 * @Description:
 */
@Path("/books")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class BookApi {

    @Inject
    BookRepository bookRepository;

    @Path("/{id}")
    @GET
    public Response get(@PathParam("id") int id){
        return bookRepository.findById(id)
                .map(Response::ok)
                .orElse(Response.status(NOT_FOUND))
                .build();
    }

    @POST
    @Path("/")
    public Response post(Book book){
        return Optional.of(bookRepository.save(book))
                .map(Response::ok)
                .orElse(Response.status(INTERNAL_SERVER_ERROR))
                .build();
    }
    @PUT
    @Path("/")
    public Response put(Book book){
        return Optional.of(bookRepository.save(book))
                .map(Response::ok)
                .orElse(Response.status(INTERNAL_SERVER_ERROR))
                .build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id){
        return bookRepository.findById(id)
                .map(b -> {
                    bookRepository.delete(b);
                    return Response.ok();
                })
                .orElse(Response.status(NOT_FOUND))
                .build();
    }
    @GET
    @Path("/")
    public Response list(){
        return Response.ok(bookRepository.findAll()).build();
    }
}