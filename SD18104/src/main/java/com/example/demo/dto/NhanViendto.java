package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NhanViendto {


    @NotBlank(message = "Không được để trống")
    private String ma;
    private Integer id;
    @NotBlank
    private String ho;
    private String tenDem;
    @NotBlank
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String sdt;
    private String matKhau;

}
