package top.auok.cbps.model.base;

import top.auok.cbps.model.Mock;

public class BaseMock extends BaseCbpsObject implements Mock {

	public BaseMock() {
	}

	private String tradeNo;
	private String outTradeNo;

	@Override
	public String getTradeNo() {
		return tradeNo;
	}

	@Override
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Override
	public String getOutTradeNo() {
		return outTradeNo;
	}

	@Override
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

}
