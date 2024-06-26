package com.javaex.vo;

public class CartVo {

	private String p_name;
	private int p_price;
	private int c_p_amount;
	private String c_size;
	private String saveName;
	private int user_no;
	private int c_no;
	private int p_no;
	private String p_explanation;
	
	private int o_no;

	public CartVo() {
		super();
	}

	public CartVo(String p_name, int p_price, int c_p_amount, String c_size, String saveName, int user_no, int c_no,
			int p_no, String p_explanation) {
		super();
		this.p_name = p_name;
		this.p_price = p_price;
		this.c_p_amount = c_p_amount;
		this.c_size = c_size;
		this.saveName = saveName;
		this.user_no = user_no;
		this.c_no = c_no;
		this.p_no = p_no;
		this.p_explanation = p_explanation;
	}
	
	

	public CartVo(String p_name, int p_price, int c_p_amount, String c_size, String saveName, int user_no, int c_no,
			int p_no, String p_explanation, int o_no) {
		super();
		this.p_name = p_name;
		this.p_price = p_price;
		this.c_p_amount = c_p_amount;
		this.c_size = c_size;
		this.saveName = saveName;
		this.user_no = user_no;
		this.c_no = c_no;
		this.p_no = p_no;
		this.p_explanation = p_explanation;
		this.o_no = o_no;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public int getC_p_amount() {
		return c_p_amount;
	}

	public void setC_p_amount(int c_p_amount) {
		this.c_p_amount = c_p_amount;
	}

	public String getC_size() {
		return c_size;
	}

	public void setC_size(String c_size) {
		this.c_size = c_size;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public String getP_explanation() {
		return p_explanation;
	}

	public void setP_explanation(String p_explanation) {
		this.p_explanation = p_explanation;
	}
	
	

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	@Override
	public String toString() {
		return "CartVo [p_name=" + p_name + ", p_price=" + p_price + ", c_p_amount=" + c_p_amount + ", c_size=" + c_size
				+ ", saveName=" + saveName + ", user_no=" + user_no + ", c_no=" + c_no + ", p_no=" + p_no
				+ ", p_explanation=" + p_explanation + "]";
	}

}
