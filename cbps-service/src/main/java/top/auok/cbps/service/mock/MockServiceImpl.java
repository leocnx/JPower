package top.auok.cbps.service.mock;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import top.auok.cbps.model.Mock;
import top.auok.cbps.model.factory.CbpsObjectAdapterCopyFactory;
import top.auok.cbps.model.factory.CbpsObjectAdapterFactory;
import top.auok.cbps.persistence.annotation.Persistent;
import top.auok.cbps.persistence.api.MockDAO;
import top.auok.cbps.service.mock.exception.InvalidMockException;
import top.auok.cbps.service.mock.exception.InvalidMockException.Mock1Exception;

@RequestScoped
public class MockServiceImpl implements MockService {

	@Inject
	@Persistent
	// Get a persistent model
	private CbpsObjectAdapterFactory persistentAdapterfactory;

	@Inject
	@Persistent
	// Get a persistent model which convert from JSON model
	private CbpsObjectAdapterCopyFactory persistentAdapterCopyFactory;

	@Inject
	private MockDAO mockDAO;

	private Mock getPersistentAdapter(Mock mock) {
		return persistentAdapterCopyFactory.readapt(mock);
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Mock createMock(Mock mock) throws InvalidMockException {
		if (mock == null)
			throw new Mock1Exception();
		Mock entity = getPersistentAdapter(mock);
		mockDAO.create(entity);
		return entity;
	}

	@Override
	public Mock findById(Long id) {
		return mockDAO.findById(id);
	}

	@Override
	public Long findByParameters(List<Mock> receivingList, Long id, String outTradeNo, String tradeNo, int startIndex, int resultsNumber) {
		return mockDAO.findByParameters(receivingList, id, outTradeNo, tradeNo, startIndex, resultsNumber);
	}
}
