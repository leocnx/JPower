package top.auok.cbps.web.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import top.auok.cbps.service.mock.exception.InvalidMockException;
import top.auok.cbps.web.model.JSONMock;

@Path("mock")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface MockManagerWebResource {

	@POST
	JSONMock createMock(JSONMock mock) throws InvalidMockException;

	@GET
	@Path("{id}")
	JSONMock getMock(@PathParam("id") Long id);
}
