package com.example.demo.repositories;

import com.example.demo.entities.NhanVien;
import com.example.demo.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpRepo extends JpaRepository<SanPham, UUID> {
    public SanPham findByMa(String ma);

}
