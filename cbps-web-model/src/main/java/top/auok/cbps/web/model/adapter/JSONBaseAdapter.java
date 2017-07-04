package top.auok.cbps.web.model.adapter;

import java.util.Date;

import top.auok.cbps.model.adapter.AbstractBaseAdapter;
import top.auok.cbps.model.base.BaseCbpsObject;

public abstract class JSONBaseAdapter<T extends BaseCbpsObject> extends AbstractBaseAdapter<T> {

	protected JSONBaseAdapter(T delegate) {
		super(delegate);
	}

	@Override
	public Long getId() {
		return super.getId();
	}

	@Override
	public Date getCreationDate() {
		return super.getCreationDate();
	}

	@Override
	public Date getUpdateDate() {
		return super.getUpdateDate();
	}

	@Override
	public Long getVersion() {
		return super.getVersion();
	}
}
