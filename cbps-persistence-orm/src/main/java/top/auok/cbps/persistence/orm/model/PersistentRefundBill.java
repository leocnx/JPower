package top.auok.cbps.persistence.orm.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.Table;

import org.hibernate.Hibernate;

import top.auok.cbps.model.Refund;
import top.auok.cbps.model.adapter.RefundAdapter;
import top.auok.cbps.model.adapter.RefundBillAdapter;
import top.auok.cbps.model.base.BaseRefundBill;
import top.auok.cbps.persistence.orm.adapter.PersistentBaseAdapter;

@Entity
@Table(name = "REFUND_BILL")
public class PersistentRefundBill extends PersistentBaseAdapter<BaseRefundBill> implements RefundBillAdapter {

	private final RefundsReference<PersistentRefundBill, PersistentRefund> refunds;

	PersistentRefundBill(BaseRefundBill delegate) {
		super(delegate);
		refunds = new RefundsReference<>(this, PersistentRefund::new, true);
	}

	PersistentRefundBill() {
		super(new BaseRefundBill());
		refunds = new RefundsReference<>(this, PersistentRefund::new, true).withConsistency(false);
	}

	@Override
	public RefundsReference<? extends RefundBillAdapter, ? extends RefundAdapter> refunds() {
		return refunds;
	}

	@PostLoad
	void updateBase() {
		this.refunds.forceConsistency(Hibernate::isInitialized);
	}

	@Override
	@OneToMany(targetEntity = PersistentRefund.class, mappedBy = "refundBill", fetch = FetchType.LAZY)
	public Set<Refund> getRefunds() {
		return refunds.get();
	}
}
