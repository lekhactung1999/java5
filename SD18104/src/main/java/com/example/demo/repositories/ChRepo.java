package com.example.demo.repositories;

import com.example.demo.entities.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChRepo extends JpaRepository<CuaHang, UUID> {
    public CuaHang findByMa(String ma);

}
