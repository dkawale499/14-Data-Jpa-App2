package com.sts.entity;

//import org.springframework.data.annotation.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class TataMotars {
	@Id
	private Integer mid;
	private String mname;
	private String moname;
	private Double mprice;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMoname() {
		return moname;
	}
	public void setMoname(String moname) {
		this.moname = moname;
	}
	public Double getMprice() {
		return mprice;
	}
	public void setMprice(Double mprice) {
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "TataMotars [mid=" + mid + ", mname=" + mname + ", moname=" + moname + ", mprice=" + mprice + "]";
	}
	
	
	
}
