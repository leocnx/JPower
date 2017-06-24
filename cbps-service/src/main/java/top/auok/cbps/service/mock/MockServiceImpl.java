package top.auok.cbps.service.mock;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import top.auok.cbps.model.Mock;
import top.auok.cbps.persistence.api.MockDAO;

@RequestScoped
public class MockServiceImpl implements MockService {

	@Inject
	private MockDAO mockDAO;

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Mock createMock(Mock mock) {
		// TODO Auto-generated method stub
		return null;
	}

}
