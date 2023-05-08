package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.loanapplicationmodel;
import com.example.demo.model.usermodel;
import com.example.demo.service.loanservice;


@RestController
@RequestMapping("/user")
public class loancontroller {
	@Autowired
	public loanservice serve;
	@PostMapping("/")
	public loanapplicationmodel saveinfo(@RequestBody loanapplicationmodel s)
	{
		return serve.save(s);
	}
	@GetMapping("/getProfile")
	public List<loanapplicationmodel> getInfo(int a)
	{
		return serve.getloan(a);
	}
	@GetMapping("/viewLoan/{user}")
	public List<loanapplicationmodel> getInfo1(@PathVariable("user")int user)
	{
		return serve.getloan(user);
	}
	@PutMapping("/put")
	public loanapplicationmodel updtaeinfo(@RequestBody loanapplicationmodel q)
	{
		return serve.update(q);
	}
	@DeleteMapping("/delete")
	public String deleteinfo(int q)
	{
		serve.delete(q);
		return "Deleted";
	}
	@Autowired
	public loanservice serve1;
	@PostMapping("/user")
	public usermodel saveinfo1(@RequestBody usermodel s)
	{
		return serve1.save1(s);
	}
	@GetMapping("/getProfileuser")
	public List<usermodel> getInfo11(int a)
	{
		return serve1.getloan1(a);
	}
	@GetMapping("/viewLoanuser/{user}")
	public List<usermodel> getdetails(@PathVariable("user")int user)
	{
		return serve1.getloan1(user);
	}
	@PutMapping("/putuser")
	public usermodel updtaeinfo1(@RequestBody usermodel q)
	{
		return serve1.update1(q);
	}
	@DeleteMapping("/deleteuser")
	public String deleteinfo1(int q)
	{
		serve.delete1(q);
		return "Deleted";
	}
	
}