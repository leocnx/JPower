package top.auok.cbps.web.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import top.auok.cbps.model.Mock;
import top.auok.cbps.persistence.api.MockDAO;
import top.auok.cbps.service.mock.MockService;
import top.auok.cbps.service.mock.exception.InvalidMockException;
import top.auok.cbps.web.converter.annotation.JSONized;
import top.auok.cbps.web.model.JSONMock;

@RequestScoped
public class MockWebManager implements MockManagerWebResource {

	@Inject
	@JSONized
	private MockService mockService;

	@Inject
	private MockDAO mockDAO;

	@Override
	public JSONMock createMock(JSONMock mock) throws InvalidMockException {
		return (JSONMock) mockService.createMock(mock);
	}

	@Override
	public JSONMock getMock(Long id) {
		Mock mock = mockDAO.findById(id);
		if (mock == null)
			throw new InvalidMockException.Mock2Exception(id.toString());
		return (JSONMock) mock;
	}
}
