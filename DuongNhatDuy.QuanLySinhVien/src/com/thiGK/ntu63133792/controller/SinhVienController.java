package com.thiGK.ntu63133792.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thiGK.ntu63133792.model.*;
import com.thiGK.ntu63133792.service.*;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class SinhVienController {

	@Autowired
	private SinhVienService sinhvienService;


    @GetMapping("/123")
    public String getAllSinhViens(Model model) {
    	List<SinhVien> sinhViens = SinhVienService.findAll();
        model.addAttribute("index", sinhViens);
        return "index";
    }

    @PostMapping("/")
    public SinhVien addSinhVien(@RequestBody SinhVien sinhviens) {
        return SinhVienService.save(sinhviens);
    }

    @PutMapping("/{id}")
    public SinhVien updateSinhVien(@PathVariable Long mssv, @RequestBody SinhVien SinhVienDetails) {
    	SinhVien sinhvien = SinhVienService.getSinhVienByMssv(mssv);
        sinhvien.setHo(SinhVienDetails.getHo());
        sinhvien.setTen(SinhVienDetails.getTen());
        sinhvien.setLop(SinhVienDetails.getLop());
        sinhvien.setKhoa(SinhVienDetails.getKhoa());
        sinhvien.setTruong(SinhVienDetails.getTruong());
        
        return SinhVienService.save(sinhvien);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long mssv) {
    	SinhVienService.deleteByMssv(mssv);
    }
}