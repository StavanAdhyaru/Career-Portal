
/*
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.transaction.Transactional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api11")
public class UploadController {
	private static String UPLOADED_FOLDER = "C://Users//stava//eclipse-workspace//YALabs//uploads//";
	@Transactional
	@RequestMapping(method = RequestMethod.POST, value="/upload",headers = "Content-Type= multipart/form-data")
    public void singleFileUpload(@RequestParam("file") MultipartFile file) {


        try {
        	
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

//            redirectAttributes.addFlashAttribute("message",
  //                  "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}*/

package io.yalabs.controller;
	import java.io.ByteArrayOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.InputStream;
	import java.net.URISyntaxException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.security.CodeSource;


	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.http.HttpHeaders;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.MediaType;
	import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.multipart.MultipartFile;
	import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
	import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import io.yalabs.YaLabsApplication;

	@RestController
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/u",headers = "Content-Type= multipart/form-data")
	public class UploadController  {
		@RequestMapping(value = "upload/{id}", method = RequestMethod.POST)
		public String singleFileUpload(@PathVariable("id") Integer id, @RequestParam("file") MultipartFile file,
				RedirectAttributes redirectAttributes) throws Exception {

			if (file.isEmpty()) {
				return "empty file";
			}
			try {

				CodeSource codeSource = YaLabsApplication.class.getProtectionDomain().getCodeSource();
				String path3 = codeSource.getLocation().toURI().getPath().toString() + "upload/";
				path3 = path3.substring(1);
				String strting1 = file.getOriginalFilename();
				String subString1 = strting1.substring(strting1.lastIndexOf("."));
	
				

				byte[] bytes = file.getBytes();
	
				String type = file.getContentType();
				
				System.out.println("type-----" + type);
				System.out.println(file.getOriginalFilename() + "-----------------------");


				String resultString = id + subString1;
				
				System.out.println("-----------------------" + resultString);
				Path path = Paths.get(path3,resultString);
						System.out.println(path);
				Files.write(path, bytes);

			} catch (Exception e) {
					return e.getMessage();
			}

			return "save";
		}

	}
