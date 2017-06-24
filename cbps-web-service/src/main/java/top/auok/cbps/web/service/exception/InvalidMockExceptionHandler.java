package top.auok.cbps.web.service.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import top.auok.cbps.service.mock.exception.InvalidMockException;

@Provider
public class InvalidMockExceptionHandler implements ExceptionMapper<InvalidMockException> {

	@Override
	public Response toResponse(InvalidMockException exception) {
		return Response.serverError().entity(exception.getMessage()).build();
	}

}
