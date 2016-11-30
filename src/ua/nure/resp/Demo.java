package ua.nure.resp;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ua.nure.resp.filter.Filter;
import ua.nure.resp.filter.NameFilter;
import ua.nure.resp.filter.SizeFilter;

public class Demo {

	private static final String FILE_NAME = "filename_template";
	private static final long MAX_FILE_SIZE = 100_500L;
	private static final Filter FILE_FILTER;

	static {
		Filter nextFilter = new NameFilter(FILE_NAME);

		FILE_FILTER = new SizeFilter(MAX_FILE_SIZE);
		FILE_FILTER.setNextFilter(nextFilter);
	}

	public static void main(String[] args) {
		List<File> files = getFilesSomewhere();
		
		files.forEach(file -> {
			if(FILE_FILTER.isValid(file)) {
				System.out.println(file);
			}
		});
	}

	private static List<File> getFilesSomewhere() {
		// stub
		return Collections.emptyList();
	}
}