package top.auok.cbps.model.adapter;

import java.beans.PropertyChangeListener;

public interface Adapter<T> extends PropertyChangeListener {

	void adapt(T adapted);

	T unwrap();
}
