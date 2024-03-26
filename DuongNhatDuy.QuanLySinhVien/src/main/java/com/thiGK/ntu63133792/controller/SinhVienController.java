package com.thiGK.ntu63133792.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import com.thiGK.ntu63133792.model.SinhVien;
import com.thiGK.ntu63133792.model.SinhVienRepository;

import java.util.List;
@Controller
public class SinhVienController {

    @Autowired
    private SinhVienRepository sinhvienRepository;

    @GetMapping("/123")
    public String getAllSinhViens(Model model) {
        List<SinhVien> sinhviens = sinhvienRepository.findAll();
        model.addAttribute("sinhvien", sinhviens);
        return "sinhvien";
    }

    @PostMapping("/")
    public SinhVien addSinhVien(@RequestBody SinhVien sinhviens) {
        return sinhvienRepository.save(sinhviens);
    }

    @PutMapping("/{id}")
    public SinhVien updateSinhVien(@PathVariable Long mssv, @RequestBody SinhVien SinhVienDetails) {
    	SinhVien sinhvien = SinhVienRepository.findByMssv(mssv)
                .orElseThrow(() -> new RuntimeException("SinhVien không tìm thấy với MSSV: " + mssv));

        sinhvien.setHo(SinhVienDetails.getHo());
        sinhvien.setTen(SinhVienDetails.getTen());
        sinhvien.setLop(SinhVienDetails.getLop());
        sinhvien.setKhoa(SinhVienDetails.getKhoa());
        sinhvien.setTruong(SinhVienDetails.getTruong());
        
        return sinhvienRepository.save(sinhvien);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long mssv) {
    	SinhVienRepository.deleteByMssv(mssv);
    }
}