package top.auok.cbps.persistence.orm.adapter;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import top.auok.cbps.model.adapter.AbstractBaseAdapter;
import top.auok.cbps.model.base.BaseCbpsObject;

@MappedSuperclass
public abstract class PersistentBaseAdapter<T extends BaseCbpsObject> extends AbstractBaseAdapter<T> {

	PersistentBaseAdapter() {
	}

	protected PersistentBaseAdapter(T delegate) {
		super(delegate);
	}

	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return unwrap().getId();
	}

	@Override
	public void setId(Long id) {
		unwrap().setId(id);
	}

	@Override
	public Date getCreationDate() {
		return super.getCreationDate();
	}

	@Override
	public void setCreationDate(Date creationDate) {
		super.setCreationDate(creationDate);
	}

	@Override
	@Version
	public Long getVersion() {
		return super.getVersion();
	}

	@Override
	public void setVersion(Long version) {
		super.setVersion(version);
	}

	@Override
	public Date getUpdateDate() {
		return super.getUpdateDate();
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		super.setUpdateDate(updateDate);
	}
}
