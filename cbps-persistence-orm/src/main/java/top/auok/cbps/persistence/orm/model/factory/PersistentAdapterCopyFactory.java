package top.auok.cbps.persistence.orm.model.factory;

import java.util.Map;
import java.util.function.Function;

import javax.enterprise.context.Dependent;

import top.auok.cbps.model.adapter.Adapter;
import top.auok.cbps.model.base.BaseMock;
import top.auok.cbps.model.factory.BaseCbpsObjectAdapterCopyFactory;
import top.auok.cbps.persistence.orm.model.PersistentMock;

@Dependent
public class PersistentAdapterCopyFactory extends BaseCbpsObjectAdapterCopyFactory {

	@SuppressWarnings("rawtypes")
	private static final Map FACTORIES = new PersistentAdapterCopyFactory().buildMap();

	@Override
	protected Map factories() {
		return FACTORIES;
	}

	@Override
	protected Function<BaseMock, ? extends Adapter<BaseMock>> mock() {
		return PersistentMock::new;
	}
}
