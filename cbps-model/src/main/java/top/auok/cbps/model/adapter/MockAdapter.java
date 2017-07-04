package top.auok.cbps.model.adapter;

import java.beans.PropertyChangeEvent;

import top.auok.cbps.model.Mock;
import top.auok.cbps.model.base.BaseMock;

public interface MockAdapter extends Mock, Adapter<BaseMock> {

	@Override
	default String getTradeNo() {
		return unwrap().getTradeNo();
	}

	@Override
	default void setTradeNo(String tradeNo) {
		unwrap().setTradeNo(tradeNo);
	}

	@Override
	default String getOutTradeNo() {
		return unwrap().getOutTradeNo();
	}

	@Override
	default void setOutTradeNo(String outTradeNo) {
		unwrap().setOutTradeNo(outTradeNo);
	}

	@Override
	default void propertyChange(PropertyChangeEvent evt) {
		switch (evt.getPropertyName()) {
		// TODO
		}
	}
}
