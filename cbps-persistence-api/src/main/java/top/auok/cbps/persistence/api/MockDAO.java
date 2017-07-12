package top.auok.cbps.persistence.api;

import java.util.List;

import top.auok.cbps.model.Mock;
import top.auok.cbps.persistence.DataAccessObject;

public interface MockDAO extends DataAccessObject<Mock, Long> {

	Long findByParameters(List<Mock> receivingList, Long id, String outTradeNo, String tradeNo, int startIndex, int resultsNumber);
}
