package top.auok.cbps.model.base;

import top.auok.cbps.model.Invoice;

public class BaseInvoice extends BaseCbpsObject implements Invoice {

	public BaseInvoice() {
	}

	private String tradeNo;

	@Override
	public String getTradeNo() {
		return tradeNo;
	}

	@Override
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
