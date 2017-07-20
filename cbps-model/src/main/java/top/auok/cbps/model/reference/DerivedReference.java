package top.auok.cbps.model.reference;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class DerivedReference<H, BT, TT, O extends DerivedReference<H, BT, TT, O>> {

	private TT cache;

	private final boolean withCache;
	protected boolean withConsistency = true;

	private final Supplier<BT> baseValueGetter;
	private final Consumer<BT> baseValueSetter;
	private final BiConsumer<TT, H> backReferenceValueSetter;
	private final H holder;

	protected final Function<BT, TT> adapterFactory;

	protected DerivedReference(Supplier<BT> baseValue, Consumer<BT> baseValueSetter, Function<BT, TT> adapterFactory,
			BiConsumer<TT, H> backReferenceValueSetter, H holder, boolean withCache) {
		this.baseValueGetter = baseValue;
		this.baseValueSetter = baseValueSetter;
		this.adapterFactory = adapterFactory;
		this.backReferenceValueSetter = backReferenceValueSetter;
		this.holder = holder;
		this.withCache = withCache;
	}

	protected DerivedReference(Supplier<BT> baseValue, Consumer<BT> baseValueSetter, Function<BT, TT> adapterFactory,
			boolean withCache) {
		this(baseValue, baseValueSetter, adapterFactory, (a, b) -> {
		}, null, withCache);
	}

	protected abstract BT getBaseObject(TT adapter);

	public void set(Object o) {
		@SuppressWarnings("unchecked")
		TT typedObject = (TT) o;

		if (withConsistency) {
			baseValueSetter.accept(getBaseObject(typedObject));
			if (typedObject != null) {
				backReferenceValueSetter.accept(typedObject, holder);
			}
		}

		cacheIfNecessary(typedObject);
	}

	private TT getFromCache() {
		return this.cache;
	}

	private void cacheIfNecessary(TT value) {
		if (withCache) {
			this.cache = value;
			this.valueSupplier = this::getFromCache;
		}
	}

	private TT getFromUnderlyingObject() {
		final BT baseValue = baseValueGetter.get();
		TT result = baseValue == null ? null : adapterFactory.apply(baseValue);
		cacheIfNecessary(result);
		return result;
	}

	private Supplier<TT> valueSupplier = this::getFromUnderlyingObject;

	public TT get() {
		return valueSupplier.get();
	}

	public void reset() {
		valueSupplier = this::getFromUnderlyingObject;
	}

	public void forceConsistency(Predicate<TT> guard) {
		if (!withConsistency && guard.test(get())) {
			withConsistency = true;
			set(get());
		}
	}

	public void forceConsistency() {
		forceConsistency(o -> true);
	}

	@SuppressWarnings("unchecked")
	public O withConsistency(boolean consistency) {
		withConsistency = consistency;
		return (O) this;
	}
}
