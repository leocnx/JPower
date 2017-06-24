package top.auok.cbps.model.factory;

import top.auok.cbps.model.Mock;
import top.auok.cbps.model.UnionBank;

public interface CbpsObjectFactory {

	Mock createMock();

	UnionBank creatUnionBank();

}
