package com.Helper;

public class File_ReaderManager {
	
	private File_ReaderManager(){
		
	}
	
	public static File_ReaderManager getInstanceFRM(){
		
		File_ReaderManager frm = new File_ReaderManager();
		return frm ;
		
	}

	public Configuration_Reader getInstanceCR() {

		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
}
