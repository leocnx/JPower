package top.auok.cbps.persistence.orm.model.factory;

import javax.enterprise.context.RequestScoped;

import top.auok.cbps.model.base.BaseMock;
import top.auok.cbps.model.base.BaseUnionBank;
import top.auok.cbps.model.factory.CbpsObjectAdapterFactory;
import top.auok.cbps.persistence.orm.model.PersistentMock;
import top.auok.cbps.persistence.orm.model.PersistentUnionBank;

@RequestScoped
public class PersistentAdapterFactory implements CbpsObjectAdapterFactory {

	@Override
	public PersistentMock createMock() {
		return new PersistentMock(new BaseMock());
	}

	@Override
	public PersistentUnionBank creatUnionBank() {
		return new PersistentUnionBank(new BaseUnionBank());
	}
}
