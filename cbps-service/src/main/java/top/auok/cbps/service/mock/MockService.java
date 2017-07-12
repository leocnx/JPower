package top.auok.cbps.service.mock;

import java.util.List;

import top.auok.cbps.model.Mock;
import top.auok.cbps.service.mock.exception.InvalidMockException;

public interface MockService {

	Mock createMock(Mock mock) throws InvalidMockException;

	Mock findById(Long id);

	Long findByParameters(List<Mock> receivingList, Long id, String outTradeNo, String tradeNo, int startIndex, int resultsNumber);
}
