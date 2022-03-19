package br.com.DesafioDocket.controllers;

import br.com.DesafioDocket.entities.Certidao;
import br.com.DesafioDocket.services.CertidaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CertidaoController {
    @Autowired
    private CertidaoService certidaoService;
    @GetMapping("/certidao")
    public String home(ModelMap model) {
        List<Certidao> certidaoList = this.certidaoService.findById(1L);
        System.out.println(certidaoList);
        model.addAttribute("certidaoList", certidaoList);

        return "home";
    }
}
