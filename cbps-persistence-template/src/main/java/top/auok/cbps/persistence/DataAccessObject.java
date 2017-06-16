package top.auok.cbps.persistence;

import java.util.Collection;
import java.util.Set;

/**
 * persistence template interface
 *
 * @param <T>
 * @param <K>
 */
public interface DataAccessObject<T, K> {

	void create(T entity);

	T findById(K key, String... fetchProfiles);

	<C extends Collection<? super T>> C findByIds(Set<K> keys, C receivingList);

	<C extends Collection<? super T>> C findAll(C receivingList);

	T update(T entity);

	void delete(K key);
	
}
