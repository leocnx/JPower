package top.auok.cbps.web.model.factory;

import top.auok.cbps.model.factory.CbpsObjectAdapterFactory;
import top.auok.cbps.web.model.JSONMock;

public class JSONAdapterFactory implements CbpsObjectAdapterFactory {

	@Override
	public JSONMock createMock() {
		return new JSONMock();
	}
}
