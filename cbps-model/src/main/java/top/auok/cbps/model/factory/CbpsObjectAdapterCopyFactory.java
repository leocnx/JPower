package top.auok.cbps.model.factory;

import top.auok.cbps.model.CbpsObject;

public interface CbpsObjectAdapterCopyFactory {

	<T extends CbpsObject> T readapt(T adaptee);
}
