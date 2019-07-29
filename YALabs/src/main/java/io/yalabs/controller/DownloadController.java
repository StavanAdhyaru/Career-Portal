package io.yalabs.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.security.CodeSource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.yalabs.YaLabsApplication;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/download")
public class DownloadController {
	private static final String EXTERNAL_FILE_PATH = "C://Users//stava//eclipse-workspace//YALabs//uploads//";
	
	@RequestMapping("/file/{fileName:.+}")
	public void downloadPDFResource(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("fileName") String fileName) throws IOException {
		CodeSource codeSource = YaLabsApplication.class.getProtectionDomain().getCodeSource();
		try {
		String path = codeSource.getLocation().toURI().getPath();
		path = path.substring(1) + "/upload/";
		File file = new File(path + fileName+".doc");
		File filePdf = new File(path + fileName+".pdf");
		if (file.exists()) {

			//get the mimetype
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				mimeType = "application/octet-stream";
			}

			response.setContentType(mimeType);
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));

			response.setContentLength((int) file.length());

			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

			FileCopyUtils.copy(inputStream, response.getOutputStream());

		}
		else if(filePdf.exists()) {
			String mimeType = URLConnection.guessContentTypeFromName(filePdf.getName());
			if (mimeType == null) {
				mimeType = "application/octet-stream";
			}

			response.setContentType(mimeType);
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + filePdf.getName() + "\""));

			response.setContentLength((int) filePdf.length());

			InputStream inputStream = new BufferedInputStream(new FileInputStream(filePdf));

			FileCopyUtils.copy(inputStream, response.getOutputStream());
		}

		}
		catch(Exception e) {
			
		}
		
			}
}
