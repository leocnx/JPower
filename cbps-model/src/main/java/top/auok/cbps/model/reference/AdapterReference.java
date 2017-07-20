package top.auok.cbps.model.reference;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import top.auok.cbps.model.adapter.Adapter;

public abstract class AdapterReference<H, BT, TT extends Adapter<? extends BT>, O extends DerivedReference<H, BT, TT, O>> extends DerivedReference<H, BT, TT, O> {
	
	protected AdapterReference(Supplier<BT> baseValueGetter, Consumer<BT> baseValueSetter, Function<BT, TT> adapterFactory, BiConsumer<TT, H> backReferenceValueSetter, H holder, boolean withCache) {
		super(baseValueGetter, baseValueSetter, adapterFactory, backReferenceValueSetter, holder, withCache);
	}

	protected AdapterReference(Supplier<BT> baseValueGetter, Consumer<BT> baseValueSetter, Function<BT, TT> adapterFactory, boolean withCache) {
		super(baseValueGetter, baseValueSetter, adapterFactory, withCache);
	}

	@Override
	protected BT getBaseObject(TT adapter) {
		return adapter == null ? null : adapter.unwrap();
	}
}
