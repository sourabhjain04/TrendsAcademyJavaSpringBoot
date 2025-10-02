package com.example.springmethodlevelsecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @GetMapping("/home")
    public String home() {
        String msg ="Welcome to Bank";
        return msg;
    }

    @GetMapping("/balance")
    public String getBalance() {
        String msg ="your current balance is 5000";
        return msg;
    }
    @GetMapping("/statement")
    public String getstmt() {
        String msg ="your Statement is  sent to you email id";
        return msg;
    }
    @GetMapping("/myloan")
    public String getmyloan() {
        String msg ="your loan amount is 50000";
        return msg;
    }
    @GetMapping("/contact")
    public String contact() {
        String msg ="Thank you for contacting me or customer support on +91-9926637944";
        return msg;
    }
}
