package top.auok.cbps.web.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import top.auok.cbps.model.Mock;
import top.auok.cbps.persistence.api.MockDAO;
import top.auok.cbps.service.mock.MockService;
import top.auok.cbps.service.mock.exception.InvalidMockException;

@RequestScoped
public class MockWebManager implements MockManagerWebResource {

	@Inject
	private MockService mockService;

	@Inject
	private MockDAO mockDAO;

	@Override
	public Mock createMock(Mock mock) throws InvalidMockException {
		return mockService.createMock(mock);
	}

	@Override
	public Mock getMock(Long id) {
		Mock mock = mockDAO.findById(id);
		if (mock == null)
			throw new InvalidMockException.Mock2Exception(id.toString());
		return mock;
	}

}
