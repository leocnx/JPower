package top.auok.cbps.persistence.orm.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import top.auok.cbps.model.adapter.MockAdapter;
import top.auok.cbps.model.base.BaseMock;
import top.auok.cbps.persistence.orm.adapter.PersistentBaseAdapter;

@Entity
@Table(name = "MOCK")
public class PersistentMock extends PersistentBaseAdapter<BaseMock> implements MockAdapter {

	public PersistentMock(BaseMock delegate) {
		super(delegate);
	}

	PersistentMock() {
		super(new BaseMock());
	}

	@Override
	public String getTradeNo() {
		return MockAdapter.super.getTradeNo();
	}

	@Override
	public String getOutTradeNo() {
		return MockAdapter.super.getOutTradeNo();
	}
}
