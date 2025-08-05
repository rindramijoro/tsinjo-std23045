package com.mikaz.tsinjo.endpoint.rest.controller.tsinjo;

import com.mikaz.tsinjo.model.Donation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TsinjoController {
    @GetMapping("/tsinjo")
    public String getTsinjo(Model model) {
        model.addAttribute("newDonation", new Donation());
        return "tsinjo";
    }
}
