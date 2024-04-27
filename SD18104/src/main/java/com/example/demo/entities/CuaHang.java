package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "CuaHang")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuaHang {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "DiaChi")

    private String diaChi;
    @Column(name = "ThanhPho")

    private String thanhPho;
    @Column(name = "QuocGia")

    private String quocGia;


}
