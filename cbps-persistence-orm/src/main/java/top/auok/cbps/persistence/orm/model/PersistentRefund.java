package top.auok.cbps.persistence.orm.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.Table;

import org.hibernate.Hibernate;

import top.auok.cbps.model.adapter.RefundAdapter;
import top.auok.cbps.model.adapter.RefundBillAdapter;
import top.auok.cbps.model.base.BaseRefund;
import top.auok.cbps.persistence.orm.adapter.PersistentBaseAdapter;

@Entity
@Table(name = "REFUND")
public class PersistentRefund extends PersistentBaseAdapter<BaseRefund> implements RefundAdapter {

	private final RefundBillReference<PersistentRefund, PersistentRefundBill> refundBill;

	PersistentRefund(BaseRefund delegate) {
		super(delegate);
		refundBill = new RefundBillReference<>(this, PersistentRefundBill::new, true);
	}

	PersistentRefund() {
		super(new BaseRefund());
		refundBill = new RefundBillReference<>(this, PersistentRefundBill::new, true).withConsistency(false);
	}

	@Override
	public RefundBillReference<? extends RefundAdapter, ? extends RefundBillAdapter> refundBill() {
		return refundBill;
	}

	@PostLoad
	void onPostLoad() {
		this.refundBill.forceConsistency(Hibernate::isInitialized);
	}

	@Override
	@ManyToOne
	public PersistentRefundBill getRefundBill() {
		return refundBill.get();
	}
}
