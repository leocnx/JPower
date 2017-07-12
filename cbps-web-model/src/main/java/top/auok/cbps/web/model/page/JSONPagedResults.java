package top.auok.cbps.web.model.page;

import java.util.Collection;

public class JSONPagedResults<T> {

	private Long totalNumberOfResults;

	private Integer pageNumber;

	private Integer pageSize;

	private Collection<? extends T> page;

	@SuppressWarnings("unchecked")
	public JSONPagedResults(Long totalNumberOfResults, Integer pageNumber, Integer pageSize, Collection<? super T> page) {
		this.totalNumberOfResults = totalNumberOfResults;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.page = (Collection<? extends T>) page;
	}

	public Long getTotalNumberOfResults() {
		return totalNumberOfResults;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Collection<? extends T> getPage() {
		return page;
	}
}
