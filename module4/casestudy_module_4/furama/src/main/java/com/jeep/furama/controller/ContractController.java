package com.jeep.furama.controller;

import com.jeep.furama.model.contract.Contract;
import com.jeep.furama.model.customer.Customer;
import com.jeep.furama.service.contract.IContractService;
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
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private IContractService contractService;

    @GetMapping
    public ModelAndView displayContractList() {
        ModelAndView modelAndView = new ModelAndView("contract/contract-list");
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView displayCreateContractForm() {
        ModelAndView modelAndView = new ModelAndView("contract/contract-create");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createContract() {
        ModelAndView modelAndView = new ModelAndView("contract/contract-create");

        return modelAndView;
    }

////

    @GetMapping
    public ModelAndView displayContractList(@PageableDefault(value = 5) Pageable pageable) {
        Page<Contract> contractPage = this.contractService.findAllContract(pageable);
        ModelAndView modelAndView = new ModelAndView("contract/contract-list", "contractList", contractPage);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView displayCreateContractForm(Contract contract) {
        ModelAndView modelAndView = new ModelAndView("contract/contract-create");
        modelAndView.addObject("contract", contract);
        modelAndView.addObject("contractTypeList", this.contractService.findAllContractType());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createContract(@ModelAttribute Contract contract, RedirectAttributes redirectAttributes) {
        this.contractService.save(contract);
        redirectAttributes.addFlashAttribute("msg", "Add new contract <strong>" + contract.getcontractName() + "</strong> successfully!");
        return "redirect:/contract";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView displayEditContractForm(@PathVariable int id) {
        Optional<Contract> contractOptional = this.contractService.findContractById(id);
        ModelAndView modelAndView = new ModelAndView("contract/contract-edit");
        modelAndView.addObject("contract", contractOptional.get());
        modelAndView.addObject("contractTypeList", this.contractService.findAllContractType());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editcontract(@ModelAttribute Contract contract, RedirectAttributes redirectAttributes) {
        this.contractService.save(contract);
        redirectAttributes.addFlashAttribute("msg",
                "Update contract <strong>" + contract.getContractName() + "</strong> successfully!");
        return "redirect:/contract";
    }

    @GetMapping("/delete/{id}")
    public String deleteContract(@PathVariable int id, RedirectAttributes redirectAttributes) {
        Optional<Contract> contractOptional = this.contractService.findContractById(id);
        String contractName = contractOptional.get().getContractName();
        this.contractService.deleteContractById(id);
        redirectAttributes.addFlashAttribute("msgDelete",
                "Remove contract <strong>" + contractName + "</strong> successfully!");
        return "redirect:/contract";
    }


}