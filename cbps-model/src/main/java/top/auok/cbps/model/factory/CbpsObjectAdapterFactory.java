package top.auok.cbps.model.factory;

import top.auok.cbps.model.adapter.InvoiceAdapter;

public interface CbpsObjectAdapterFactory extends CbpsObjectFactory {

	@Override
	InvoiceAdapter createInvoice();

}
