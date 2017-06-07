package top.auok.cbps.model;

public interface Invoice extends CbpsObject {

	String getTradeNo();

	void setTradeNo(String tradeNo);
	
	String getOutTradeNo();

	void setOutTradeNo(String outTradeNo);

}
