package com.cy.cyshopspringboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

/**
 * @author lz - PC
 * @date 2019/11/13 - 12:15
 */
@Controller
public class RegisteredController {

    @RequestMapping("/register")
    public Mono<String> index(Model model) {


        return Mono.create(indexMono->indexMono.success("registered"));
    }


//    @GetMapping(value="/")
//    public String index(){
//        return "redirect:home";
//    }
//    @GetMapping(value="/home")
//    public String home(){
//        return "fore/home";
//    }
//    @GetMapping(value="/register")
//    public String register(){
//        return "fore/register";
//    }
//    @GetMapping(value="/alipay")
//    public String alipay(){
//        return "fore/alipay";
//    }
//    @GetMapping(value="/bought")
//    public String bought(){
//        return "fore/bought";
//    }
//    @GetMapping(value="/buy")
//    public String buy(){
//        return "fore/buy";
//    }
//    @GetMapping(value="/cart")
//    public String cart(){
//        return "fore/cart";
//    }
//    @GetMapping(value="/category")
//    public String category(){
//        return "fore/category";
//    }
//    @GetMapping(value="/confirmPay")
//    public String confirmPay(){
//        return "fore/confirmPay";
//    }
//    @GetMapping(value="/login")
//    public String login(){
//        return "fore/login";
//    }
//    @GetMapping(value="/orderConfirmed")
//    public String orderConfirmed(){
//        return "fore/orderConfirmed";
//    }
//    @GetMapping(value="/payed")
//    public String payed(){
//        return "fore/payed";
//    }
//    @GetMapping(value="/product")
//    public String product(){
//        return "fore/product";
//    }
//    @GetMapping(value="/registerSuccess")
//    public String registerSuccess(){
//        return "fore/registerSuccess";
//    }
//    @GetMapping(value="/review")
//    public String review(){
//        return "fore/review";
//    }
//    @GetMapping(value="/search")
//    public String searchResult(){
//        return "fore/search";
//    }
//    @GetMapping("/forelogout")
//    public String logout( ) {
//        return "redirect:home";
//    }


}
