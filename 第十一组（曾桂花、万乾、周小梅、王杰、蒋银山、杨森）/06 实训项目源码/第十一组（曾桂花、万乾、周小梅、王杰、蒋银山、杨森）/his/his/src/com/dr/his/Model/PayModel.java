package com.dr.his.Model;

public class PayModel {

	private int id;//划价id
	private String caseNo;//病历号
	private int totalMoney;//总金额
	private int payState;//支付状态：0未支付，1已支付
	private int payNum;//药品数量
	private int dgPrice;//药品价格
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	public int getPayState() {
		return payState;
	}
	public void setPayState(int payState) {
		this.payState = payState;
	}
	public int getPayNum() {
		return payNum;
	}
	public void setPayNum(int payNum) {
		this.payNum = payNum;
	}
	public int getDgPrice() {
		return dgPrice;
	}
	public void setDgPrice(int dgPrice) {
		this.dgPrice = dgPrice;
	}
	
}
