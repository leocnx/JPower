package top.auok.cbps.persistence.orm.model.factory;

import top.auok.cbps.model.base.BaseMock;
import top.auok.cbps.model.factory.CbpsObjectAdapterFactory;
import top.auok.cbps.persistence.orm.model.PersistentMock;

public class PersistentAdapterFactory implements CbpsObjectAdapterFactory {

	@Override
	public PersistentMock createMock() {
		return new PersistentMock(new BaseMock());
	}

}
