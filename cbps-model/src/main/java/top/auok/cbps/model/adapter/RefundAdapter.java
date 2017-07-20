package top.auok.cbps.model.adapter;

import java.beans.PropertyChangeEvent;
import java.util.function.BiConsumer;
import java.util.function.Function;

import top.auok.cbps.model.Refund;
import top.auok.cbps.model.RefundBill;
import top.auok.cbps.model.base.BaseRefund;
import top.auok.cbps.model.base.BaseRefundBill;
import top.auok.cbps.model.reference.AdapterReference;

public interface RefundAdapter extends Refund, Adapter<BaseRefund> {

	@Override
	default void propertyChange(PropertyChangeEvent evt) {
		switch (evt.getPropertyName()) {
		case BaseRefund.REFUND_BILL:
			refundBill().reset();
			break;
		default:
			break;
		}
	}
	
	class RefundBillReference<H extends RefundAdapter, T extends RefundBillAdapter> extends AdapterReference<H, BaseRefundBill, T, RefundBillReference<H, T>> {
		public RefundBillReference(H holder, Function<BaseRefundBill, T> adapterFactory, BiConsumer<T, H> backReferenceValueSetter, boolean withCache) {
			super(holder.unwrap()::getRefundBill, holder.unwrap()::setRefundBill, adapterFactory, backReferenceValueSetter, holder, withCache);
		}
		
		public RefundBillReference(H holder, Function<BaseRefundBill, T> adapterFactory, boolean withCache) {
			super(holder.unwrap()::getRefundBill, holder.unwrap()::setRefundBill, adapterFactory, withCache);
		}
	}

	RefundBillReference<? extends RefundAdapter, ? extends RefundBillAdapter> refundBill();
	
	@Override
	default RefundBill getRefundBill() {
		return refundBill().get();
	}

	@Override
	default void setRefundBill(RefundBill refundBill) {
		refundBill().set(refundBill);
	}
}
