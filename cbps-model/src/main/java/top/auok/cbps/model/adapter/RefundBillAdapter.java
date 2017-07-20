package top.auok.cbps.model.adapter;

import java.beans.PropertyChangeEvent;

import top.auok.cbps.model.RefundBill;
import top.auok.cbps.model.base.BaseRefundBill;

public interface RefundBillAdapter extends RefundBill, Adapter<BaseRefundBill> {

	@Override
	default void propertyChange(PropertyChangeEvent evt) {
		switch (evt.getPropertyName()) {
		}
	}
}
