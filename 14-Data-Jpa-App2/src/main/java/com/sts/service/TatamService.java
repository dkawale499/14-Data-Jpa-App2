package com.sts.service;

import org.springframework.stereotype.Service;

import com.sts.entity.TataMotars;
import com.sts.repo.TatamReository;

@Service
public class TatamService {
	private TatamReository tatamrepo;
	public TatamService(TatamReository tatamrepo) {
		this.tatamrepo=tatamrepo;
	}

	public void savedTataMotors()
	{
		TataMotars t =new TataMotars();
		t.setMid(721);	
		t.setMname("Nexon");
		t.setMoname("Dnyaneshwar");
		t.setMprice(12846.80);
		
		tatamrepo.save(t);
		System.out.println("Record Saved..");
	}
}
