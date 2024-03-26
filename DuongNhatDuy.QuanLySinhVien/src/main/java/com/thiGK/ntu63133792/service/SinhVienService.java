package com.thiGK.ntu63133792.service;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.thiGK.ntu63133792.model.SinhVien;
import com.thiGK.ntu63133792.model.SinhVienRepository;

public class SinhVienService  {
	  private static SinhVienRepository sinhVienRepository;

	    public static void deleteByMssv(Long mssv) {
	        sinhVienRepository.deleteAllByMssv(mssv);
	    }
	   public static SinhVien save(SinhVien sinhVien) {
		   return sinhVienRepository.save(sinhVien);
	    }
	   public static List<SinhVien> findAll() {
	        return (List<SinhVien>) sinhVienRepository.findAll();
	    }
	   public static SinhVien getSinhVienByMssv(Long mssv) {
	        return sinhVienRepository.getSinhVienByMssv(mssv);
	    }
	  
}