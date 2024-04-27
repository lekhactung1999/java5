package com.example.demo.controller;

import com.example.demo.dto.KhachHangdto;
import com.example.demo.entities.KhachHang;
import com.example.demo.repositories.KhRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("khach-hang")
public class KhachHangController {
    private List<KhachHang> ds;
    @Autowired
    private KhRepo khRepo;

//    public KhachHangController(){
//        this.ds=new ArrayList<>();
////        ds.add(new KhachHang("ph2","c","02-04-1992","0123456","hn","1223"));
////        ds.add(new KhachHang("ph3","b","5-4-1992","0123456","hn","1223"));
//
//    }
    @GetMapping("index")
    public String Home(Model model){
        this.ds=this.khRepo.findAll();
        model.addAttribute("item",this.ds);
        return "khach_hang/index";

    }
    @GetMapping("view-add")
    public String viewAdd(@ModelAttribute("kh") KhachHangdto kh){

        return"khach_hang/add";
    }
    @PostMapping("add")
    public String add(@Valid @ModelAttribute("kh") KhachHangdto khachHangdto,
                      BindingResult result
                      ){
        if(result.hasErrors()){
            return "khach_hang/add";
        }
        KhachHang kh=new KhachHang();
        kh.setMa(khachHangdto.getMa());
        kh.setTen(khachHangdto.getTen());
        kh.setNgaySinh(khachHangdto.getNgaySinh());
        kh.setSdt(khachHangdto.getSdt());
        kh.setDiaChi(khachHangdto.getDiaChi());
        kh.setPassword(khachHangdto.getPassword());
        this.khRepo.save(kh);

        return "redirect:/khach-hang/index";

    }
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String makh){
    KhachHang kh=this.khRepo.findByMa(makh);
    this.khRepo.delete(kh);
        return "redirect:/khach-hang/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,
                       Model model

    ){
        KhachHang kh=this.khRepo.findByMa(ma);
        model.addAttribute("kh",kh);

        return "khach_hang/update";


    }
    @PostMapping("update/{ma}")
    public String update(
           @Valid @PathVariable("ma") String ma,@ModelAttribute("kh")
            KhachHangdto khachHangdto,
           BindingResult result
    ) {
        if(result.hasErrors()){
            return "khach_hang/update";
        }
        KhachHang old =this.khRepo.findByMa(ma);
        KhachHang kh=new KhachHang();
        kh.setId(old.getId());
        kh.setMa(khachHangdto.getMa());
        kh.setTen(khachHangdto.getTen());
        kh.setNgaySinh(khachHangdto.getNgaySinh());
        kh.setSdt(khachHangdto.getSdt());
        kh.setDiaChi(khachHangdto.getDiaChi());
        kh.setPassword(khachHangdto.getPassword());
        this.khRepo.save(kh);


        return "redirect:/khach-hang/index";
    }

}
