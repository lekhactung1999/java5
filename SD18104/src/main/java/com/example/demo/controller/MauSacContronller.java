package com.example.demo.controller;

import com.example.demo.dto.MauSacdto;
import com.example.demo.entities.MauSac;
import com.example.demo.repositories.MauRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("mau-sac")
public class MauSacContronller {
   private List<MauSac> dsMau;
@Autowired
private MauRepo mauRepo;

   @GetMapping("index")
    public String index(Model model){
        dsMau=mauRepo.findAll();
       model.addAttribute("item",this.dsMau);
       return "mau_sac/index";
   }
   @GetMapping("create")
    public String color(){

       return "mau_sac/create";
   }
   @PostMapping("color")
    public String add(@ModelAttribute("m") MauSacdto mau){
        MauSac mauSac=new MauSac();
        mauSac.setMa(mau.getMa());
       mauSac.setTen(mau.getTen());
       mauRepo.save(mauSac);

       return "redirect:/mau-sac/index";
   }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma")String ma){
    MauSac m=mauRepo.findByMa(ma);
    mauRepo.delete(m);


        return "redirect:/mau-sac/index";
    }
    @GetMapping ("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,
                       Model model){
        MauSac m=mauRepo.findByMa(ma);
        model.addAttribute("m",m);


       return "mau_sac/edit";
    }
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma,
                         MauSacdto mauSac){
        MauSac m=mauRepo.findByMa(ma);
        MauSac m1=new MauSac();
        m1.setId(m.getId());
        m1.setMa(mauSac.getMa());
        m1.setTen(mauSac.getTen());
        mauRepo.save(m1);


        return "redirect:/mau-sac/index";

    }



}
