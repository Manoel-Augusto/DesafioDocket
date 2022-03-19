package br.com.DesafioDocket.controllers;

import br.com.DesafioDocket.entities.Cartorio;
import br.com.DesafioDocket.entities.Certidao;
import br.com.DesafioDocket.entities.Endereco;
import br.com.DesafioDocket.services.CartorioService;
import br.com.DesafioDocket.services.CertidaoService;
import br.com.DesafioDocket.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class CartorioController {
    @Autowired
    private CartorioService service;
    @Autowired
    private CertidaoService certidaoService;

    @GetMapping("/")
    public ModelAndView getList(){
        List<Cartorio> cartorioList = this.service.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("cartorioList", cartorioList);
        return mv;

    }

    @PostMapping("/form/save")
    public String saveCartorio(@Valid Cartorio cartorio, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            redirect.addFlashAttribute("mensagem", "Verifique os campos obrigatórios");
            return "redirect:/form/add";
        }
        this.service.save(cartorio);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public ModelAndView getEdit(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView("formEdit");
       /* List<Certidao> certidaoList = this.certidaoService.findById(id).stream().collect(Collectors.toList());
        mv.addObject("certidaoList", certidaoList);*/
        Cartorio cartorio = this.service.findById(id);
        mv.addObject("cartorio", cartorio);
        return mv;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        this.service.delete(id);
        return "redirect:/";
    }
    @GetMapping("/teste")
    public String home(ModelMap model) {
        List<Certidao> certidaoList = this.certidaoService.findById(1L);
        System.out.println(certidaoList);
        model.addAttribute("certidaoList", certidaoList);

        return "home";
    }


    @GetMapping(value = "/teste2")
    public ResponseEntity<List<Cartorio>> findAll() {


        List<Cartorio> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }
}
