package com.controller;


import com.constant.PROFESSION;
import com.domain.Registration;
import com.repository.RegistrationRepository;
import com.service.RegistrationService;
import com.validator.RegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
public class RegistrationController {

    private RegistrationService registrationService;
    private RegistrationRepository registrationRepository;
    public RegistrationController(RegistrationRepository registrationRepository,RegistrationService registrationService) {
        this.registrationRepository= registrationRepository;
        this.registrationService = registrationService;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    @RequestMapping("/create")
    public String show(Model model) {
        Registration registration = new Registration();
        List<PROFESSION> enums = Arrays.asList(PROFESSION.values());
        model.addAttribute("enums",enums);
        model.addAttribute("registration",registration);
        return "Registration/CreateRegistration";
    }

    @RequestMapping("/submit")
    public String submit(@Valid @ModelAttribute("registration") Registration registration, BindingResult bindingResult)  {
        if (!bindingResult.hasErrors()) {
           registrationService.create(registration);
            return "redirect:/students/list";
        }
        return "Registration/CreateRegistration";

    }

    @RequestMapping("/greet")
    public String greet(Model model) {
        List<PROFESSION> enums = Arrays.asList(PROFESSION.values());
        model.addAttribute("enums",enums);
        System.out.println(enums.size());
        return "Registration/home";
    }
}
