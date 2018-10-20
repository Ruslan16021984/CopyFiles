package com.gmail.carbit3333333;

import java.io.File;
import java.io.FileFilter;

public class FileNameFillter implements FileFilter {
	private String arr;

	public FileNameFillter(String arrs) {
		super();
		this.arr = arrs;
	}

	private boolean check(String ext) {
	
		if (arr.equals(ext)) {
			return true;

		}
		return false;

	}

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return check(ext);
	}

}
