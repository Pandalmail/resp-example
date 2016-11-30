package ua.nure.resp.filter;

import java.io.File;

public class NameFilter extends Filter {

	private String name;

	public NameFilter(String name) {
		this.name = name;
	}

	@Override
	public boolean currentAccept(File file) {
		if (file != null){
			String fileName = file.getName();
			return fileName.startsWith(name);
		}
		return false;
	}
}
