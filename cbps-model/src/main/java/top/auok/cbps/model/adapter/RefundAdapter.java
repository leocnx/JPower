package top.auok.cbps.model.adapter;

import java.beans.PropertyChangeEvent;

import top.auok.cbps.model.Refund;
import top.auok.cbps.model.base.BaseRefund;

public interface RefundAdapter extends Refund, Adapter<BaseRefund> {

	@Override
	default void propertyChange(PropertyChangeEvent evt) {
		switch (evt.getPropertyName()) {
		}
	}
}
