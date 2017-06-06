package top.auok.cbps.persistence.orm.model.factory;

import top.auok.cbps.model.base.BaseInvoice;
import top.auok.cbps.model.factory.CbpsObjectAdapterFactory;
import top.auok.cbps.persistence.orm.model.PersistentInvoice;

public class PersistentAdapterFactory implements CbpsObjectAdapterFactory {

	@Override
	public PersistentInvoice createInvoice() {
		return new PersistentInvoice(new BaseInvoice());
	}

}
