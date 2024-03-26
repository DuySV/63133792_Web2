package com.thiGK.ntu63133792.model;

import org.springframework.data.repository.CrudRepository;

public interface SinhVienRepository extends CrudRepository<SinhVien, Long> {
    void deleteAllByMssv(Long mssv);

	SinhVien getSinhVienByMssv(Long mssv);
}
