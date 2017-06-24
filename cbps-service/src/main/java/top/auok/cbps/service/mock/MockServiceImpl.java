package top.auok.cbps.service.mock;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import top.auok.cbps.model.Mock;
import top.auok.cbps.persistence.api.MockDAO;
import top.auok.cbps.service.mock.exception.InvalidMockException;
import top.auok.cbps.service.mock.exception.InvalidMockException.Mock1Exception;

@RequestScoped
public class MockServiceImpl implements MockService {

	@Inject
	private MockDAO mockDAO;

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Mock createMock(Mock mock) throws InvalidMockException {
		if (mock == null)
			throw new Mock1Exception();
		mockDAO.create(mock);
		return mockDAO.findById(mock.getId());
	}

}
