package top.auok.cbps.web.converter.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import top.auok.cbps.model.Mock;
import top.auok.cbps.model.factory.CbpsObjectAdapterCopyFactory;
import top.auok.cbps.service.mock.MockService;
import top.auok.cbps.service.mock.exception.InvalidMockException;
import top.auok.cbps.web.converter.annotation.JSONized;

@RequestScoped
@JSONized
public class JSONMockServiceImpl implements MockService {

	@Inject
	private MockService delegate;

	@Inject
	private CbpsObjectAdapterCopyFactory jsonAdapterCopyFactory;

	@Override
	public Mock createMock(Mock mock) throws InvalidMockException {
		return jsonAdapterCopyFactory.readapt(delegate.createMock(mock));
	}

	@Override
	public Mock findById(Long id) {
		return jsonAdapterCopyFactory.readapt(delegate.findById(id));
	}

	@Override
	public Long findByParameters(List<Mock> receivingList, Long id, String outTradeNo, String tradeNo, int startIndex,
			int resultsNumber) {
		Long count = delegate.findByParameters(receivingList, id, outTradeNo, tradeNo, startIndex, resultsNumber);
		for (int i = 0; i < receivingList.size(); i++) {
			receivingList.set(i, jsonAdapterCopyFactory.readapt(receivingList.get(i)));
		}
		return count;
	}
}
