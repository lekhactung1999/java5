package com.example.demo.controller;

import com.example.demo.dto.ChucVudto;
import com.example.demo.entities.ChucVu;
import com.example.demo.entities.SanPham;
import com.example.demo.repositories.CvRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("chuc-vu")
public class ChucVuController {
    private List<ChucVu> ds;
    @Autowired
    private CvRepo cvRepo;

    @GetMapping("index")
    public String Home(Model model){
        ds=cvRepo.findAll();
        model.addAttribute("item",this.ds);
        return "chuc_vu/index";

    }
    @GetMapping("view-add")
    public String viewAdd(@ModelAttribute("cv") ChucVudto cv){

        return"chuc_vu/add";
    }
    @PostMapping("add")
    public String add(@Valid @ModelAttribute("cv") ChucVudto chucvudto,
                      BindingResult result
                      ){
        if(result.hasErrors()){
            return "chuc_vu/add";
        }
        ChucVu cv=new ChucVu();
        cv.setMa(chucvudto.getMa());
        cv.setTen(chucvudto.getTen());
        this.cvRepo.save(cv);


        return "redirect:/chuc-vu/index";

    }
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma){
     ChucVu cv=this.cvRepo.findByMa(ma);
     cvRepo.delete(cv);
        return "redirect:/chuc-vu/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,
                       Model model

    ){
        ChucVu cv=this.cvRepo.findByMa(ma);
        model.addAttribute("cv",cv);
        return "chuc_vu/update";

    }
    @PostMapping("update/{ma}")
    public String update(
            @PathVariable("ma") String ma,@ModelAttribute("cv")
            ChucVudto chucVudto
    ) {
        ChucVu cv1=this.cvRepo.findByMa(ma);
        ChucVu cv=new ChucVu();
        cv.setId(cv1.getId());
        cv.setMa(chucVudto.getMa());
        cv.setTen(chucVudto.getTen());
        this.cvRepo.save(cv);

        return "redirect:/chuc-vu/index";
    }

}
