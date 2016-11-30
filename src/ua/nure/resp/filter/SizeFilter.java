package ua.nure.resp.filter;

import java.io.File;

public class SizeFilter extends Filter {

	private long size;

	public SizeFilter(long size) {
		this.size = size;
	}

	@Override
	public boolean currentAccept(File file) {
		if (file != null) {
			long fileSize = file.length();
			return fileSize < size;
		}
		return false;
	}
}
