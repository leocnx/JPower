package top.auok.cbps.model.factory;

import top.auok.cbps.model.adapter.MockAdapter;
import top.auok.cbps.model.adapter.UnionBankAdapter;

public interface CbpsObjectAdapterFactory extends CbpsObjectFactory {

	@Override
	MockAdapter createMock();

	@Override
	UnionBankAdapter creatUnionBank();

}
