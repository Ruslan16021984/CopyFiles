package com.gmail.carbit3333333;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) {
		FileNameFillter fillter = new FileNameFillter("doc");
		File folderOne = new File("E:\\Работа\\Увви");
		File folderTwo = new File("E:\\Работа\\копи");
		File[] fileList = folderOne.listFiles(fillter);
		for (File file : fileList) {
			System.out.println(file.getName());
			//FileOperations.copy(folderTwo, file);
		}
		for (File f : fileList) {
		    try {
				Files.copy(f.toPath(), new File("E:\\Работа\\копи" + File.separator + f.getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub

	}

}
