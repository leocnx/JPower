package top.auok.cbps.model.base;

import java.util.Set;

import top.auok.cbps.model.Refund;
import top.auok.cbps.model.RefundBill;

public class BaseRefundBill extends BaseCbpsObject implements RefundBill {

	public static final String REFUNDS = "RefundBill.refunds";

	private Set<Refund> refunds;

	@Override
	public Set<Refund> getRefunds() {
		return refunds;
	}

	@Override
	public void setRefunds(Set<Refund> refunds) {
		pcs.firePropertyChange(REFUNDS, this.refunds, this.refunds = refunds);
	}
}
