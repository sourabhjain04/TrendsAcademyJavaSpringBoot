package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("This is out Conformation Home views");
        model.addAttribute("name", "Vedika Jain");
        return "index";
    }


    @RequestMapping("/about")
    public String about(){
        System.out.println("This is out Conformation about page views");
        return "about";
    }

}
