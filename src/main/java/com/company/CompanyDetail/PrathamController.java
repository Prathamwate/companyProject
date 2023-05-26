package com.company.CompanyDetail;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.company.CompanyDetail.Bean.CompanyEntity;
import com.company.CompanyDetail.Repo.CompanyRepo;


@Controller
@ComponentScan(basePackages = { "com.company.CompanyDetail" })
public class PrathamController {

	@Autowired
	CompanyService companyService;
	
	@Autowired
	ModelAndView mv;
	
	@Autowired
	CompanyRepo cr;

	@RequestMapping("/")
	public String Home() {
		return "index";
	}

	@RequestMapping("/AddUser")
	public String AddUser() {
		return "Ragister";
	}

	
	@PostMapping(path = "/NewUserAdd", produces = "application/json")
	public ModelAndView newAccount(CompanyEntity s) {
		//if(CompanyService.isValid(s.getEmail())) {
		//String str=s.getCompanyname();
	//	List<CompanyEntity> res=cr.findByCompanyname(str);
	//	if(res.isEmpty()) {
		this.mv = companyService.newUserAdd(s);
		return mv;
		}
//		else {
//			String obj = "";
//			mv.addObject("list", obj);
//			mv.setViewName("UserNameAlreadyExit");
//			return mv;
//		}
//		}
//		else {
//			String obj = "";
//			mv.addObject("list", obj);
//			mv.setViewName("emailValidation");
//			return mv;
//		}
		
//	}

	@GetMapping(path = "/UserReport", produces = "application/json")
	public ModelAndView report() {
		this.mv = companyService.userReport();
		return mv;
		
	}

	@RequestMapping("/FindUser")
	public String findUser() {
		return "SerachAccount";
	}

	@PostMapping(path = "/SerachAccount1", produces = "application/json")
	public ModelAndView serachAccount(String category) {
		this.mv = companyService.SerachAccount(category);
		return mv;
	}

	@PostMapping(path="/addAdress")
	@ResponseBody
	public ResponseEntity<String> addAddress(@RequestBody CompanyEntity companyEntity) {
		 ResponseEntity<String> str=companyService.addAdress(companyEntity);
		 return str;
		
	}
	
	
	@RequestMapping("/UpdateUserDetailPage")
	public ModelAndView updateDetail(int companyid) {
		//System.out.print(companyid);
		this.mv=companyService.getDetail(companyid);
		return mv;
	}
		
	

	@PostMapping(path = "/UpdatedAccount", produces = "application/json")
	public ModelAndView UpdatedAccountt(CompanyEntity s) {
		this.mv = companyService.updatedAccount(s);
		return mv;
	}

	@RequestMapping("/DeleteUser")
	public String delete() {
		return "DeleteAccount";
	}

	@RequestMapping("/DeleteAccount1")
	public ModelAndView DeleteAccount1(int companyid) {
	//	System.out.println(company_id);
		this.mv =companyService.deleteAccount(companyid);
		return mv;

	}
	
	@GetMapping("/allList")
	@ResponseBody
	public List<CompanyEntity> allList(){
		return cr.findAll();
	}
}
