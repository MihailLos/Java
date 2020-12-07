package com.mlos.firstWebsite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/sbconnect")
    public String SBConnectPage(Model model) {
        return "SB-connect";
    }

    @GetMapping("/cssconnect")
    public String CSSConnectPage(Model model) {
        return "CSS-connect";
    }

    @GetMapping("/aboutsb")
    public String AboutPage(Model model) {
        return "about";
    }
}
