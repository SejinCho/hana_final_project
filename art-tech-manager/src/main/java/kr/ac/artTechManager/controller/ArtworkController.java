package kr.ac.artTechManager.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.ac.artTechManager.service.ArtworkService;
import kr.ac.artTechManager.service.WriterInfoService;
import kr.ac.artTechManager.vo.ArtworkInfoVO;
import kr.ac.artTechManager.vo.WriterInfoVO;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/manage")
@RequiredArgsConstructor
public class ArtworkController {
	private final ArtworkService service;
	private final WriterInfoService writerSerivce;
	
	@GetMapping("/goodsRegister")
	public String addArtworkInfoGet(Model model) {
		List<WriterInfoVO> writerInfoList = writerSerivce.getWriterInfoList();
		model.addAttribute("writerInfoList", writerInfoList);
		return "manage/goodsRegister";
	}
	
	//작품등록
	@PostMapping("/goodsRegister")
	public String addArtworkInfoPost(ArtworkInfoVO artworkInfo, @RequestParam("file")List<MultipartFile> multipartFile) throws Exception{
		service.addArtworkInfo(artworkInfo, multipartFile);
		
		return "redirect:/manage/goods"; 
	}
	
	
	//작품리스트
	@GetMapping("/goods")
	public String goodsList(Model model) {
		List<ArtworkInfoVO> artworkInfoList = service.getArtworkInfoList();
		model.addAttribute("artworkInfoList", artworkInfoList);
		return "manage/goods";
	}
	
	//작품 디테일
	@GetMapping("/goodsDetail/{artworkInfoId}")
	public String goodsDetail(@PathVariable String artworkInfoId, Model model) {
		ArtworkInfoVO artworkInfo = (ArtworkInfoVO) service.getArtworkInfo(artworkInfoId).get("artworkInfo");
		
		if(! artworkInfo.getState().equals("0") || ! artworkInfo.getState().equals("1")) {
			//투표 정보 가져오기
			model.addAttribute("voteInfo", service.getVoteInfo(artworkInfoId));
		}
		model.addAttribute("artworkInfo", artworkInfo);
		return "manage/goodsDetail";
	}
	
	//투표중(3) -> 투표종료(4)
	//현재날짜 = 투표종료 날짜
	@Scheduled(cron="59 59 23 * * * ")
	public void updateStateVote() {
		int result = service.modifyStateVote();
		System.out.println("총 " + result + "개의 상태가 update");
	}
}