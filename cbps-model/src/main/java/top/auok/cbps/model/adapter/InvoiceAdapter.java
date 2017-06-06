package top.auok.cbps.model.adapter;

import java.beans.PropertyChangeEvent;

import top.auok.cbps.model.Invoice;
import top.auok.cbps.model.base.BaseInvoice;

public interface InvoiceAdapter extends Invoice, Adapter<BaseInvoice> {

	@Override
	default String getTradeNo() {
		return unwrap().getTradeNo();
	}

	@Override
	default void setTradeNo(String tradeNo) {
		unwrap().setTradeNo(tradeNo);
	}

	@Override
	default void propertyChange(PropertyChangeEvent evt) {
		switch (evt.getPropertyName()) {
		// TODO
		}
	}

}
