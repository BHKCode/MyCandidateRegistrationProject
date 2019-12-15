package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ExamRegistrationDao;
import com.example.demo.dao.RegistrationDao;
import com.example.demo.dto.CandidateDto;
import com.example.demo.dto.ExamDto;
import com.example.demo.model.Candidate;
import com.example.demo.model.Exams;
import com.example.demo.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	Logger logger = Logger.getLogger(RegistrationServiceImpl.class.getName());

	@Autowired
	RegistrationDao regDao;

	@Autowired
	ExamRegistrationDao examRegDao;

	@Override
	public int addCandidate(CandidateDto dto) {

		try {
			Integer flag = 0;
            
			if(dto.getcId()!=null && dto.getcId()!=0) {
				flag = dto.getcId();
			} else {
				Candidate cadidate = new Candidate();
				cadidate.setcName(dto.getcName());
				cadidate.setExpeience(dto.getExpeience());
				cadidate.setOnboardingDate(new Date());
				cadidate.setQualification(dto.getQualification());
				cadidate.setSkills(dto.getSkills());
				Candidate cad1 = regDao.save(cadidate);
				flag = cad1.getcId();
			}
			
			if (flag != 0) {

				Exams exam = new Exams();
				exam.setCustId(flag);
				exam.setPosition(dto.getPosition());
				exam.setDate(dto.getDate());
				examRegDao.save(exam);
			}
			
			//

			return flag;

		} catch (Exception e) {
			logger.info("In method save");
		}
		return 0;
	}

	@Override
	public CandidateDto findById(int cid) {

		try {

			Candidate candidate = regDao.findById(cid).orElse(new Candidate());

			CandidateDto dto = new CandidateDto();
			if (candidate != null) {
				dto.setcName(candidate.getcName());
				dto.setExpeience(candidate.getExpeience());
				dto.setOnboardingDate(candidate.getOnboardingDate());
				dto.setQualification(candidate.getQualification());
				dto.setSkills(candidate.getSkills());

				List<Exams> exams = examRegDao.findByCustId(cid);

				List<ExamDto> examList = new ArrayList<>();
				for (Exams exam : exams) {
					ExamDto examDto = new ExamDto();
					examDto.setId(exam.getId());
					examDto.setDate(exam.getDate());
					examDto.setPosition(exam.getPosition());
					examList.add(examDto);
				}

				dto.setExamDto(examList);

			}

			return dto;

		} catch (Exception e) {
			logger.info("In method findById");
		}
		return null;
	}

}
