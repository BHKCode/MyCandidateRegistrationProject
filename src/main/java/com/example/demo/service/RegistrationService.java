package com.example.demo.service;

import com.example.demo.dto.CandidateDto;

public interface RegistrationService {

	public int addCandidate(CandidateDto dto);

	public CandidateDto findById(int cid);

}
