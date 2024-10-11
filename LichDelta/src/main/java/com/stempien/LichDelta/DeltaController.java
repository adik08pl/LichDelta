package com.stempien.LichDelta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeltaController {
    private final DeltaService deltaService;

    public DeltaController(DeltaService deltaService) {
        this.deltaService = deltaService;
    }

    @GetMapping("/calc")
    public String calculate(Model model) {
        model.addAttribute("delta",new Delta());
        return "newCalc";
    }
    @PostMapping(value="/save")
    public String save(@ModelAttribute("delta") Delta delta) {
        deltaService.save(delta);
        return "index";
    }
}
