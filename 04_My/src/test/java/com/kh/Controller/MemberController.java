package com.kh.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.model.vo.Member;

@Controller
public class MemberController {
	
@Autowired
private Service service;

@GetMapping ("allMember")
public String allMember(Model model){
List<Member>list = service.

	
}

}
