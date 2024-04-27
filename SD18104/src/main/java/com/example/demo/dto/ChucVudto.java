package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChucVudto {
    @NotBlank(message = "không được để chống mã")
    private String ma;
    @NotBlank(message = "không được để chống tên")
    private String ten;
}
