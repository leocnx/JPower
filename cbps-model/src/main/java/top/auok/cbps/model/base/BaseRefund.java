package top.auok.cbps.model.base;

import top.auok.cbps.model.Refund;
import top.auok.cbps.model.RefundBill;

public class BaseRefund extends BaseCbpsObject implements Refund {

	public static final String REFUND_BILL = "Refund.refundBill";

	private RefundBill refundBill;

	@Override
	public BaseRefundBill getRefundBill() {
		return (BaseRefundBill) refundBill;
	}

	@Override
	public void setRefundBill(RefundBill refundBill) {
		pcs.firePropertyChange(REFUND_BILL, this.refundBill, this.refundBill = refundBill);
	}
}
