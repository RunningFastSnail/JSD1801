package com.entor.springdemo.account.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entor.springdemo.account.dao.AccountDAO;

public class AccountDAOImpl implements AccountDAO{
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void in(Integer id, double money) {
		this.jdbcTemplate.update("update Account set money = money + ? where id = ?",money,id);
	}


	@Override
	public void out(Integer id, double money) {
		this.jdbcTemplate.update("update Account set money = money - ? where id = ?",money,id);
		
		
	}

}
