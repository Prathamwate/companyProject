package com.company.CompanyDetail;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.company.CompanyDetail.Bean.CompanyEntity;
import com.company.CompanyDetail.Repo.CompanyRepo;
import com.company.CompanyDetail.Repo.IAddressRepository;

@Service
public class CompanyService {

	@Autowired
	CompanyRepo CR;
	
	@Autowired
	ModelAndView mv;

	@Autowired
	IAddressRepository iaddress;
	public ModelAndView SerachAccount(String category) {
	
		try {
			List<CompanyEntity> lst = CR.findByCategory(category);
			this.mv.addObject("list", lst);
			this.mv.setViewName("reportacc");
			return mv;
		} catch (Exception e) {
			String obj = "Type Not Found";
			mv.addObject("list", obj);
			mv.setViewName("Error");
			return mv;
		}

	}

	public ModelAndView updatedAccount(CompanyEntity s) {
	    try {
			CompanyEntity obj = CR.findById(s.getCompanyid()).get();
			obj.setCategory(s.getCategory());
			obj.setCompanyname(s.getCompanyname());
			obj.setEmail(s.getEmail());
			obj.setFounded(s.getFounded());
			obj.setCountry(s.getCountry());
			obj.setNumber_of_employees(s.getNumber_of_employees());
			CR.save(obj);

			mv.setViewName("Update");
			return mv;
		} catch (Exception e) {
			String obj = "";
			mv.addObject("list", obj);
			mv.setViewName("Error");
			return mv;
		}
	}

	public ModelAndView newUserAdd(CompanyEntity s) {
	    String email=s.getEmail();
	    Boolean ans=isValid(email);
	    if(ans==true) {
		try {
			CR.save(s);
			mv.setViewName("Success");
			return mv;
		 } catch (Exception e) {
			String obj = "Please Enter Proper Information";
			mv.addObject("list", obj);
			mv.setViewName("error");
			return mv;
		 }
	    }
		else {
			String obj = "";
			mv.addObject("list", obj);
			mv.setViewName("emailValidation");
			return mv;
		}
	}

	static Boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
		                "[a-zA-Z0-9_+&*-]+)*@" +
		                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
		                "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		return pat.matcher(email).matches();
	}

	public ModelAndView userReport() {
	
		List<CompanyEntity> lst = CR.findAll();
		mv.addObject("list", lst);
		mv.setViewName("reportacc");
		return mv;

	}

	public ModelAndView deleteAccount(int companyid) {
		try {
			CR.deleteById(companyid);
			mv.setViewName("Deleted");
			return mv;
		} catch (Exception e) {
			String obj = "Company Not Found";
			mv.addObject("list", obj);
			mv.setViewName("Error");
			return mv;
		}
	}

	public ModelAndView getDetail(int companyid) {
		try {
			CompanyEntity companyEntity=CR.findById(companyid).get();
			mv.setViewName("UpdateAccount");
			mv.addObject("list", companyEntity);
			return mv;
		} catch (Exception e) {
			String obj = "Company Not Found";
			mv.addObject("list", obj);
			mv.setViewName("Error");
			return mv;
		}
	}

	@ResponseBody
	public ResponseEntity<String> addAdress(CompanyEntity companyentity) {
		try {
		
			CompanyEntity ad=CR.save(companyentity);
			return new ResponseEntity<>(ad.toString(),HttpStatus.CREATED);
	    	}
	    	catch(Exception e) {
			return new ResponseEntity<>(e.getMessage().toString(),HttpStatus.CREATED);
		    }
		
	}

}
