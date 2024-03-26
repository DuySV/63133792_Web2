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
	   private List<SinhVien> sinhViens = new ArrayList<>();

	    // Constructor
	    public SinhVienService() {
	        // Hard-coded list of sinh vien
	        sinhViens.add(new SinhVien(1, "John", 8.5));
	        sinhViens.add(new SinhVien(2, "Alice", 9.2));
	        sinhViens.add(new SinhVien(3, "Bob", 7.8));
	    }
}