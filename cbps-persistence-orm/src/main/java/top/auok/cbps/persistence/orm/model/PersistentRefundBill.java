package top.auok.cbps.persistence.orm.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import top.auok.cbps.model.adapter.RefundBillAdapter;
import top.auok.cbps.model.base.BaseRefundBill;
import top.auok.cbps.persistence.orm.adapter.PersistentBaseAdapter;

@Entity
@Table(name = "REFUND_BILL")
public class PersistentRefundBill extends PersistentBaseAdapter<BaseRefundBill> implements RefundBillAdapter {

	PersistentRefundBill(BaseRefundBill delegate) {
		super(delegate);
	}

	PersistentRefundBill() {
		super(new BaseRefundBill());
	}
}
