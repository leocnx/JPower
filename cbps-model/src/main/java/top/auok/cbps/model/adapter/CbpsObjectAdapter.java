package top.auok.cbps.model.adapter;

import java.util.Date;

import top.auok.cbps.model.CbpsObject;
import top.auok.cbps.model.base.BaseCbpsObject;

public interface CbpsObjectAdapter<T extends BaseCbpsObject> extends CbpsObject, Adapter<T> {

	@Override
	default Long getId() {
		return unwrap().getId();
	}

	@Override
	default void setId(Long id) {
		unwrap().setId(id);
	}

	@Override
	default Date getCreationDate() {
		return unwrap().getCreationDate();
	}

	@Override
	default void setCreationDate(Date creationDate) {
		unwrap().setCreationDate(creationDate);
	}

	@Override
	default Long getVersion() {
		return unwrap().getVersion();
	}

	@Override
	default void setVersion(Long version) {
		unwrap().setVersion(version);
	}

	@Override
	default Date getUpdateDate() {
		return unwrap().getUpdateDate();
	}

	@Override
	default void setUpdateDate(Date updateDate) {
		unwrap().setUpdateDate(updateDate);
	}
}
