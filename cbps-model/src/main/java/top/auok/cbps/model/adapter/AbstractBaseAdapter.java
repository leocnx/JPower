package top.auok.cbps.model.adapter;

import top.auok.cbps.model.base.BaseCbpsObject;

public abstract class AbstractBaseAdapter<T extends BaseCbpsObject> implements CbpsObjectAdapter<T> {

	protected AbstractBaseAdapter() {
	};

	protected AbstractBaseAdapter(T delegate) {
		adapt(delegate);
	}

	private T delegate;

	@Override
	public void adapt(T adapted) {
		if (this.delegate != null) {
			this.delegate.removePropertyChangeListener(this);
		}
		this.delegate = adapted;
		this.delegate.addPropertyChangeListener(this);
	}

	@Override
	public T unwrap() {
		return delegate;
	}

	@Override
	public boolean equals(Object obj) {
		if (delegate == null) {
			return super.equals(obj);
		}
		return delegate.equals(obj);
	}

	@Override
	public int hashCode() {
		if (delegate == null) {
			return super.hashCode();
		}
		return delegate.hashCode();
	}

}
