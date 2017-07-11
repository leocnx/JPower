package top.auok.cbps.model.factory;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import top.auok.cbps.model.CbpsObject;
import top.auok.cbps.model.Mock;
import top.auok.cbps.model.adapter.Adapter;
import top.auok.cbps.model.base.BaseMock;

public abstract class BaseCbpsObjectAdapterCopyFactory implements CbpsObjectAdapterCopyFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends CbpsObject> T readapt(T adaptee) {

		for (Map.Entry<Class<?>, Function<Object, T>> entry : (Set<Map.Entry<Class<?>, Function<Object, T>>>) factories()
				.entrySet()) {
			if (entry.getKey().isInstance(adaptee)) {
				if (adaptee instanceof Adapter)
					return entry.getValue().apply(((Adapter<?>) adaptee).unwrap());
				else
					return entry.getValue().apply(adaptee);
			}
		}
		return adaptee;
	}

	@SuppressWarnings("rawtypes")
	protected abstract Map factories();

	protected Map<Class<?>, Function<?, ?>> buildMap() {
		final Map<Class<?>, Function<?, ?>> tmp = new LinkedHashMap<>();
		tmp.put(Mock.class, mock());
		return Collections.unmodifiableMap(tmp);
	}

	protected abstract Function<BaseMock, ? extends Adapter<BaseMock>> mock();
}
