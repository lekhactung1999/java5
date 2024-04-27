package com.example.demo.repositories;

import com.example.demo.entities.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface KhRepo extends JpaRepository<KhachHang, UUID> {
    public KhachHang findByMa(String ma);
}
