package top.auok.cbps.persistence.orm.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import top.auok.cbps.model.adapter.RefundAdapter;
import top.auok.cbps.model.base.BaseRefund;
import top.auok.cbps.persistence.orm.adapter.PersistentBaseAdapter;

@Entity
@Table(name = "REFUND")
public class PersistentRefund extends PersistentBaseAdapter<BaseRefund> implements RefundAdapter {

	PersistentRefund(BaseRefund delegate) {
		super(delegate);
	}

	PersistentRefund() {
		super(new BaseRefund());
	}
}
