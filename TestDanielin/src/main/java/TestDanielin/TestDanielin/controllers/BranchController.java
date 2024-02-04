package TestDanielin.TestDanielin.controllers;

import TestDanielin.TestDanielin.Services.BranchService;

import TestDanielin.TestDanielin.models.Branch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "api/v1/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    //    public EcommerceController(EcommerceService ecommerceService){
//        this.ecommerceService = ecommerceService;
//    }
    @GetMapping
    public List<Branch> getBranch() {
        return branchService.getBranch();
    }
}
