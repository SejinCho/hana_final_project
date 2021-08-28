package kr.ac.artTechManager.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.artTechManager.service.ArtworkService;
import kr.ac.artTechManager.vo.VoteVO;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manage")
public class ArtworkAPIController {
	private final ArtworkService service;
	//매각투표 진행하기
		@PostMapping("/vote")
		public String vote(VoteVO vote) {
			return service.startVote(vote);
		}
}
