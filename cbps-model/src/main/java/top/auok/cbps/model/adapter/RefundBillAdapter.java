package top.auok.cbps.model.adapter;

import java.beans.PropertyChangeEvent;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

import top.auok.cbps.model.Refund;
import top.auok.cbps.model.RefundBill;
import top.auok.cbps.model.base.BaseRefund;
import top.auok.cbps.model.base.BaseRefundBill;
import top.auok.cbps.model.reference.MultivaluedAdapterReference;

public interface RefundBillAdapter extends RefundBill, Adapter<BaseRefundBill> {

	@Override
	default void propertyChange(PropertyChangeEvent evt) {
		switch (evt.getPropertyName()) {
		case BaseRefundBill.REFUNDS:
			refunds().reset();
			break;
		default:
			break;
		}
	}
	
	class RefundsReference<H extends RefundBillAdapter, T extends RefundAdapter> extends MultivaluedAdapterReference<H, Refund, BaseRefund, T, Set<Refund>, RefundsReference<H, T>> {
		public RefundsReference(H holder, Function<BaseRefund, T> adapterFactory, BiConsumer<Refund, H> backReferenceValueSetter, boolean withCache) {
			super(holder.unwrap()::getRefunds, holder.unwrap()::setRefunds, adapterFactory, backReferenceValueSetter, holder, HashSet::new, withCache);
		}
		
		public RefundsReference(H holder, Function<BaseRefund, T> adapterFactory, boolean withCache) {
			super(holder.unwrap()::getRefunds, holder.unwrap()::setRefunds, adapterFactory, HashSet::new, withCache);
		}
	}
	
	RefundsReference<? extends RefundBillAdapter, ? extends RefundAdapter> refunds();

	@Override
	default Set<Refund> getRefunds() {
		return refunds().get();
	}

	@Override
	default void setRefunds(Set<Refund> refunds) {
		refunds().set(refunds);
	}
}
