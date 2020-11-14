package bahor.test.controller;

import bahor.test.service.BLService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

    private final BLService blService;

    public Main(BLService blService) {
        this.blService = blService;
    }

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("all",blService.getAll());
        return "main";
    }


}
