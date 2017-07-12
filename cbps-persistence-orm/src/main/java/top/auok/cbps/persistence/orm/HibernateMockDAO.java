package top.auok.cbps.persistence.orm;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.criteria.Predicate;

import top.auok.cbps.model.Mock;
import top.auok.cbps.persistence.api.MockDAO;
import top.auok.cbps.persistence.orm.jpa.BaseDAO;
import top.auok.cbps.persistence.orm.model.PersistentMock;

@Stateless
public class HibernateMockDAO extends BaseDAO<Mock, PersistentMock, Long> implements MockDAO {

	public HibernateMockDAO() {
		super(PersistentMock.class);
	}

	@Override
	public Long findByParameters(List<Mock> receivingList, Long id, String outTradeNo, String tradeNo, int startIndex,
			int resultsNumber) {

		return super.findAllWhere(
				receivingList, 
				
				(criteriabuilder, root) -> {
					List<Predicate> predicates = new ArrayList<>();
					if (id != null && !"".equals(id)) {
						predicates.add(criteriabuilder.equal(root.get("id"), id));
					}
					if (outTradeNo != null && !"".equals(outTradeNo)) {
						predicates.add(criteriabuilder.equal(root.get("outTradeNo"), outTradeNo));
					}
					if (tradeNo != null && !"".equals(tradeNo)) {
						predicates.add(criteriabuilder.equal(root.get("tradeNo"), tradeNo));
					}
					return criteriabuilder.and(predicates.toArray(new Predicate[predicates.size()]));
				}, 
				
				(criteriabuilder, root) -> criteriabuilder.desc(root.get("id")),
				
				startIndex, resultsNumber);
	}
}
