package com.imooc.demo.entity;

/**
 * 区域信息
 * @author xiangze
 *
 */
public class Area {
	private Integer Id;
	private String nName;
	private String Aname;
	private Integer n_num;
	private Integer a_num;


	public String getnName() {
		return nName;
	}

	public void setnName(String nName) {
		this.nName = nName;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public Integer getN_num() {
		return n_num;
	}

	public void setN_num(Integer n_num) {
		this.n_num = n_num;
	}

	public Integer getA_num() {
		return a_num;
	}

	public void setA_num(Integer a_num) {
		this.a_num = a_num;
	}

}
