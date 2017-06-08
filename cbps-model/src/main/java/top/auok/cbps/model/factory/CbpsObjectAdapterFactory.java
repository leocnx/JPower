package top.auok.cbps.model.factory;

import top.auok.cbps.model.adapter.MockAdapter;

public interface CbpsObjectAdapterFactory extends CbpsObjectFactory {

	@Override
	MockAdapter createMock();

}
