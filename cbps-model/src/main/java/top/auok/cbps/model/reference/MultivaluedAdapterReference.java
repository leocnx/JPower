package top.auok.cbps.model.reference;

import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import top.auok.cbps.model.adapter.Adapter;

public abstract class MultivaluedAdapterReference<H, I, BT extends I, TT extends Adapter<? extends BT>, C extends Collection<I>, O extends MultivaluedAdapterReference<H, I, BT, TT, C, O>>
		extends DerivedReference<H, C, C, O> {

	private final Supplier<C> collectionFactory;

	protected MultivaluedAdapterReference(Supplier<C> baseValueGetter, Consumer<C> baseValueSetter,
			Function<BT, TT> adapterFactory, BiConsumer<I, H> backReferenceValueSetter, H holder,
			Supplier<C> collectionFactory, boolean withCache) {
		super(baseValueGetter, baseValueSetter, adapterCollectionFactory(adapterFactory, collectionFactory),
				collectionBackReferenceValueSetter(backReferenceValueSetter), holder, withCache);
		this.collectionFactory = collectionFactory;
	}

	protected MultivaluedAdapterReference(Supplier<C> baseValueGetter, Consumer<C> baseValueSetter,
			Function<BT, TT> adapterFactory, Supplier<C> collectionFactory, boolean withCache) {
		super(baseValueGetter, baseValueSetter, adapterCollectionFactory(adapterFactory, collectionFactory), withCache);
		this.collectionFactory = collectionFactory;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected C getBaseObject(C adapterCollection) {
		if (adapterCollection == null) {
			return null;
		}
		return ((Collection<TT>) (Collection) adapterCollection).stream().map(Adapter::unwrap)
				.collect(Collectors.toCollection(collectionFactory));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static <I, BT, TT extends Adapter<? extends BT>, C extends Collection<I>> Function<C, C> adapterCollectionFactory(
			Function<BT, TT> adapterFactory, Supplier<C> collectionFactory) {
		return c -> c == null ? null
				: ((Collection<BT>) (Collection) c).stream().map(adapterFactory)
						.collect((Collector<? super TT, ?, C>) Collectors.toCollection(collectionFactory));
	}

	private static <H, I, C extends Collection<I>> BiConsumer<C, H> collectionBackReferenceValueSetter(
			BiConsumer<I, H> backReferenceValueSetter) {
		return (c, h) -> c.stream().forEach(e -> backReferenceValueSetter.accept(e, h));
	}
}
