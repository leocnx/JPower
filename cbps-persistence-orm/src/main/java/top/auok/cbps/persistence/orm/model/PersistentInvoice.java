package top.auok.cbps.persistence.orm.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import top.auok.cbps.model.adapter.InvoiceAdapter;
import top.auok.cbps.model.base.BaseInvoice;
import top.auok.cbps.persistence.orm.adapter.PersistentBaseAdapter;

@Entity
@Table(name = "INVOICE")
public class PersistentInvoice extends PersistentBaseAdapter<BaseInvoice> implements InvoiceAdapter {

	public PersistentInvoice(BaseInvoice delegate) {
		super(delegate);
	}

	PersistentInvoice() {
		super(new BaseInvoice());
	}

	@Override
	public String getTradeNo() {
		return InvoiceAdapter.super.getTradeNo();
	}
	
	@Override
	public String getOutTradeNo() {
		return InvoiceAdapter.super.getOutTradeNo();
	}

}
