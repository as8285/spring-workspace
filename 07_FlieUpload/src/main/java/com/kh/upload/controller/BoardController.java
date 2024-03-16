package com.kh.upload.controller;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.kh.upload.model.vo.Board;
import com.kh.upload.service.BoardService;
@Controller
public class BoardController {
	
	private String path = "D:\\upload\\";
	
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/write")
	public void write() {}
	
	
	// 글 등록 
	@PostMapping("/write")
	public String wirte(Board b) throws IllegalStateException, IOException {
		if(!b.getFile().isEmpty()) {
		// 1.파일 업로드 처리 로직 
		String url = fileUpload(b.getFile());
		b.setUrl(url);
		// Board에 url <-- 업로드 된 경로 set으로 넣고
		service.insert(b);
		
		}
		// 비즈니스 로직 처리 - > service.writeBoard()
		return "redirect:/list";
	}
	
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list",service.selectAll());
		
	}
	
	
	@GetMapping("/view")
	public void view(String no,Model model) {
		// int inNo = Integer.pareInt(no);
		// Board board = service.select(inNo);
		// model.addAttribute("vo",board);
		model.addAttribute("vo",service.select(Integer.parseInt(no)));
		
		
	}
	

	
	@PostMapping("/upload")
	public String upload(MultipartFile file) throws IllegalStateException, IOException {
		System.out.println("파일 사이즈 : " + file.getSize());
		System.out.println("파일 이름 : " + file.getOriginalFilename());
		System.out.println("파일 파라미터명 : " + file.getName());
		
		fileUpload(file);
		
		return "redirect:/";
	}
	
	@PostMapping("/multiUpload")
	public String multiUpload(List<MultipartFile> files) throws IllegalStateException, IOException {
		
		for(MultipartFile file : files) {
			fileUpload(file);
			
		}
		return "redirect:/";
	}
	
	// 파일 업로드 기능
	public String fileUpload(MultipartFile file) throws IllegalStateException, IOException {
	
		UUID uuid = UUID.randomUUID();
		String filename = uuid.toString() + "_" +  file.getOriginalFilename();
		
		File copyFile = new File(path + filename);
		file.transferTo(copyFile);	// 업로드한 파일이 지정한 path 위치로 저장
	
		
		
		return filename;

}
}
	













