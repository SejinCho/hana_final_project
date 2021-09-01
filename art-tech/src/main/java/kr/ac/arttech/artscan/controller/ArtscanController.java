package kr.ac.arttech.artscan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.arttech.artscan.service.ArtscanService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/artscan")
public class ArtscanController {
	private final ArtscanService service;
	
	@GetMapping("/")
	public String main() {
		
		return "artscan/index";
	}
	
	@GetMapping("/blocks")
	public String blocks() {
		
		return "artscan/blocks";
	}
	@GetMapping("/blockDetail/{hash}")
	public String blockDetail(@PathVariable("hash") String hash) {
		System.out.println("디테일 hash : " + hash);
		return "artscan/blockDetail";
	}
	
	
	@GetMapping("/txns")
	public String txns() {
		
		return "artscan/txns";
	}
	@GetMapping("/txnDetail")
	public String txnDetail() {
		
		return "artscan/txnDetail";
	}
}
