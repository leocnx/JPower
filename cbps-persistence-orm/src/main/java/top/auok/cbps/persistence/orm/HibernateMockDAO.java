package top.auok.cbps.persistence.orm;

import javax.ejb.Stateless;

import top.auok.cbps.model.Mock;
import top.auok.cbps.persistence.api.MockDAO;
import top.auok.cbps.persistence.orm.jpa.BaseDAO;
import top.auok.cbps.persistence.orm.model.PersistentMock;

@Stateless
public class HibernateMockDAO extends BaseDAO<Mock, PersistentMock, Long> implements MockDAO {

	public HibernateMockDAO() {
		super(PersistentMock.class);
	}
}
