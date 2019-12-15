package com.example.demo.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CandidateDto;
import com.example.demo.service.RegistrationService;

@RestController
public class RegistrationJpaController {

	Logger logger = Logger.getLogger(RegistrationJpaController.class.getName());

	@Autowired
	RegistrationService regService;

	@PostMapping("/reg")
	public int addCandidate(CandidateDto dto) {
		try {
			return regService.addCandidate(dto);
		} catch (Exception e) {
			logger.info("In method addCandidate");
		}
		return 0;

	}

	@GetMapping("/reg/{cid}")
	public CandidateDto getCandidate(@PathVariable("cid") int cid) {
		try {
			return regService.findById(cid);
		} catch (Exception e) {
			logger.info("In method getCandidate");
		}
		return null;

	}

}
