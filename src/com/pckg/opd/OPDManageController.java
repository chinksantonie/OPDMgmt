package com.pckg.opd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OPDManageController 
{
	public OPDManageController() 
	{
		// TODO Auto-generated constructor stub
		OPDManageHibModel hib=new OPDManageHibModel();
		OPDManageBeanPojo opdpojo=new OPDManageBeanPojo();
		String status=hib.check(opdpojo);
		System.out.println("Status"+status);
		String val=opdpojo.action();
		System.out.println(val);
	}
	@RequestMapping(value="#{OPDMngBean.action}")
	public ModelAndView display(@ModelAttribute("opdpojo") OPDManageBeanPojo opdpojo)
	{
		
		System.out.println("OPDManageController"+opdpojo.username);
		ModelAndView model=new ModelAndView(opdpojo.action());
		
		return model;
	}
	

	
}
