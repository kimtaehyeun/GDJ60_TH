package com.iu.s2.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {


	public String fileSave(MultipartFile multipartFile, String path) throws Exception{
	
		File file = new File(path);

		if(!file.exists()) {
			file.mkdirs();
		}

		String name= UUID.randomUUID().toString();

		name= name+"_"+multipartFile.getOriginalFilename();
		System.out.println(name);
		
		file = new File(file, name);
		FileCopyUtils.copy(multipartFile.getBytes(), file);
		return name;
	}
}
