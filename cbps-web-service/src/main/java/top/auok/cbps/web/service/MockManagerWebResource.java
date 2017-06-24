package top.auok.cbps.web.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import top.auok.cbps.model.Mock;
import top.auok.cbps.service.mock.exception.InvalidMockException;

@Path("mock")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface MockManagerWebResource {

	@POST
	Mock createMock(Mock mock) throws InvalidMockException;

	@GET
	@Path("{id}")
	Mock getMock(@PathParam("id") Long id);

}
