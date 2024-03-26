package com.thiGK.ntu63133792.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mssv;
    private String ho;
    private String ten;
    private String lop;
    private String khoa;
    private String truong;
	public Long getMssv() {
		return mssv;
	}
	public void setMssv(Long mssv) {
		this.mssv = mssv;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getTruong() {
		return truong;
	}
	public void setTruong(String truong) {
		this.truong = truong;
	}
	public SinhVien(Long mssv, String ho, String ten, String lop, String khoa, String truong) {
		super();
		this.mssv = mssv;
		this.ho = ho;
		this.ten = ten;
		this.lop = lop;
		this.khoa = khoa;
		this.truong = truong;
	}
	@Override
	public String toString() {
		return "SinhVien [MSSV=" + mssv + ", ho=" + ho + ", ten=" + ten + ", lop=" + lop + ", khoa=" + khoa
				+ ", truong=" + truong + "]";
	}
	
    
	}
}