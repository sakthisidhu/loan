
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.loanapplicationmodel;
import com.example.demo.model.usermodel;
import com.example.demo.repository.loanapplicationrepo;
import com.example.demo.repository.userrepo;

@Service
public class loanservice {
	@Autowired
	public loanapplicationrepo ls;
	public loanapplicationmodel save(loanapplicationmodel m)
	{
		return ls.save(m);
	}
	public List<loanapplicationmodel> getloan(int a)
	{
		return ls.findAll();
	}
	public loanapplicationmodel update(loanapplicationmodel m)
	{
		return ls.saveAndFlush(m);
	}
	public void delete(int m)
	{
		ls.deleteById(m);
	}
	@Autowired
	public userrepo lr;
	public usermodel save1(usermodel m)
	{
		return lr.save(m);
	}
	public List<usermodel> getloan1(int a)
	{
		return lr.findAll();
	}
	public usermodel update1(usermodel m)
	{
		return lr.saveAndFlush(m);
	}
	public void delete1(int c)
	{
		ls.deleteById(c);
	}

}