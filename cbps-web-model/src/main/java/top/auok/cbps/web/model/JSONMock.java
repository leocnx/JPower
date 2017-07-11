package top.auok.cbps.web.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import top.auok.cbps.model.adapter.MockAdapter;
import top.auok.cbps.model.base.BaseMock;
import top.auok.cbps.web.model.adapter.JSONBaseAdapter;

@JsonInclude(Include.NON_EMPTY)
public class JSONMock extends JSONBaseAdapter<BaseMock> implements MockAdapter {

	public JSONMock(BaseMock delegate) {
		super(delegate);
	}

	public JSONMock() {
		this(new BaseMock());
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
