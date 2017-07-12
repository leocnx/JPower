package top.auok.cbps.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import top.auok.cbps.model.Mock;
import top.auok.cbps.service.mock.MockService;
import top.auok.cbps.service.mock.exception.InvalidMockException;
import top.auok.cbps.web.converter.annotation.JSONized;
import top.auok.cbps.web.model.JSONMock;
import top.auok.cbps.web.model.page.JSONPagedResults;

@RequestScoped
public class MockWebManager implements MockManagerWebResource {

	@Inject
	@JSONized
	private MockService mockService;

	@Override
	public JSONMock createMock(JSONMock mock) throws InvalidMockException {
		return (JSONMock) mockService.createMock(mock);
	}

	@Override
	public JSONMock getMock(Long id) {
		Mock mock = mockService.findById(id);
		if (mock == null)
			throw new InvalidMockException.Mock2Exception(id.toString());
		return (JSONMock) mock;
	}

	@Override
	public JSONPagedResults<JSONMock> list(Long id, String outTradeNo, String tradeNo, int pageNumber, int pageSize) {
		List<Mock> receivingList = new ArrayList<>();
		Long count = mockService.findByParameters(receivingList, id, outTradeNo, tradeNo, pageNumber * pageSize, pageSize);
		return new JSONPagedResults<>(count, pageNumber, pageSize, receivingList);
	}
}
