package com.example.bookrecordapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Menu：コントローラ
 */

@Controller
@RequestMapping("/")
public class MenuController {
	
	//メニュー画面を表示
	@GetMapping
	public String showMenu() {
		//templatesフォルダ配下のmenu.htmlに遷移
		return "menu";
	}

}
