package ua.nure.resp.filter;

import java.io.File;

public abstract class Filter {

	public Filter nextFilter;

	public void setNextFilter(Filter nextFilter) {
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
