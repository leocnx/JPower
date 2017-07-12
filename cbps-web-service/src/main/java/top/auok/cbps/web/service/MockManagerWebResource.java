package top.auok.cbps.web.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import top.auok.cbps.service.mock.exception.InvalidMockException;
import top.auok.cbps.web.model.JSONMock;
import top.auok.cbps.web.model.page.JSONPagedResults;

@Path("")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface MockManagerWebResource {

	@POST
	@Path("mock")
	JSONMock createMock(JSONMock mock) throws InvalidMockException;

	@GET
	@Path("mock/{id}")
	JSONMock getMock(@PathParam("id") Long id);

	@GET
	@Path("mocks")
	JSONPagedResults<JSONMock> list(
			@QueryParam("id") Long id, 
			@QueryParam("outTradeNo") String outTradeNo,
			@QueryParam("tradeNo") String tradeNo, 
			@DefaultValue("0") @QueryParam("pageNumber") int pageNumber,
			@DefaultValue("10") @QueryParam("pageSize") int pageSize);
}
