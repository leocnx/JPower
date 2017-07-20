package top.auok.cbps.model;

public interface Refund extends CbpsObject {

	RefundBill getRefundBill();

	void setRefundBill(RefundBill refundBill);
}
