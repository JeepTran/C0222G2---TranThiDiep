package com.jeep.furama.controller;

import com.jeep.furama.model.customer.Customer;
import com.jeep.furama.model.facility.Facility;
import com.jeep.furama.repository.facility.IRentTypeRepository;
import com.jeep.furama.service.customer.ICustomerService;
import com.jeep.furama.service.facility.IFacilityService;
import com.jeep.furama.service.facility.IFacilityTypeService;
import com.jeep.furama.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/facility")
public class FacilityController {

//    @GetMapping
//    public ModelAndView displayFacilityList() {
//        ModelAndView modelAndView = new ModelAndView("facility/facility-list");
//        return modelAndView;
//    }
//
//    @GetMapping("/create")
//    public ModelAndView displayCreateFacilityForm() {
//        ModelAndView modelAndView = new ModelAndView("facility/facility-create");
//        return modelAndView;
//    }
//
//    @GetMapping("/edit")
//    public ModelAndView displayEditFacilityForm() {
//        ModelAndView modelAndView = new ModelAndView("facility/facility-edit");
//        return modelAndView;
//    }


    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IRentTypeService rentTypeService;
    @Autowired
    private IFacilityTypeService facilityTypeService;

    @GetMapping
    public ModelAndView displayFacilityList(@PageableDefault(value = 5) Pageable pageable,
                                            @RequestParam Optional<String> search) {
        String keyword = search.orElse("");
        Page<Facility> facilityPage = this.facilityService.findAllFacilityByKeyword("%" + keyword + "%", pageable);
        ModelAndView modelAndView = new ModelAndView("facility/facility-list");
        modelAndView.addObject("facilityList", facilityPage);
        modelAndView.addObject("keyword", keyword);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView displayCreateFacilityForm(Facility facility) {
        ModelAndView modelAndView = new ModelAndView("facility/facility-create");
        modelAndView.addObject("facility", facility);
        modelAndView.addObject("rentTypeList", this.rentTypeService.findAllRentType());
        modelAndView.addObject("facilityTypeList", this.facilityTypeService.findAllFacilityType());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createFacility(@ModelAttribute Facility facility, RedirectAttributes redirectAttributes) {
        this.facilityService.save(facility);
        redirectAttributes.addFlashAttribute("msg", "Add new facility <strong>" + facility.getFacilityName() + "</strong> successfully!");
        return "redirect:/facility";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView displayEditFacilityForm(@PathVariable int id) {
        Optional<Facility> facilityOptional = this.facilityService.findFacilityById(id);
        ModelAndView modelAndView = new ModelAndView("facility/facility-edit");
        modelAndView.addObject("facility", facilityOptional.get());
        modelAndView.addObject("rentTypeList", this.rentTypeService.findAllRentType());
        modelAndView.addObject("facilityTypeList", this.facilityTypeService.findAllFacilityType());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editFacility(@ModelAttribute Facility facility, RedirectAttributes redirectAttributes) {
        this.facilityService.save(facility);
        redirectAttributes.addFlashAttribute("msg",
                "Update facility <strong>" + facility.getFacilityName() + "</strong> successfully!");
        return "redirect:/facility";
    }

    @GetMapping("/delete/{id}")
    public String deleteFacility(@PathVariable int id, RedirectAttributes redirectAttributes) {
        Optional<Facility> facilityOptional = this.facilityService.findFacilityById(id);
        String facilityName = facilityOptional.get().getFacilityName();
        this.facilityService.deleteFacilityById(id);
        redirectAttributes.addFlashAttribute("msgDelete",
                "Remove facility <strong>" + facilityName + "</strong> successfully!");
        return "redirect:/facility";
    }


}
