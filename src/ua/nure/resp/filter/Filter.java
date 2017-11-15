package ua.nure.resp.filter;

import java.io.File;

public abstract class Filter {

	private Filter nextFilter;

	public Filter(Filter nextFilter) {
		this.nextFilter = nextFilter;
	}

	public boolean isValid(File file) {
		boolean result = currentAccept(file);

		if (nextFilter != null && result) {
			return nextFilter.isValid(file);
		}
		return result;
	}

	public abstract boolean currentAccept(File file);

}
