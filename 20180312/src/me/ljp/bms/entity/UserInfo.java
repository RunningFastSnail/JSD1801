package me.ljp.bms.entity;

import java.util.LinkedList;
import java.util.List;

public class UserInfo {
	private Integer uid;// ѧ��
	private String name;// ����
	private String password; // ����
	private String idCard;// ����
	private List<Integer> rentBooks = new LinkedList();// ����Ŀ���
	private Integer status; // ����״̬

	public UserInfo() {
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public List<Integer> getRentBooks() {
		return rentBooks;
	}

	public void setRentBooks(List<Integer> rentBooks) {
		this.rentBooks = rentBooks;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Userinfo [uid=" + uid + ", name=" + name + ", idCard=" + idCard + ", rentBooks=" + rentBooks
				+ ", status=" + status + "]";
	}

}
