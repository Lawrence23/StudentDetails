package com.qburst.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.qburst.main.dao.StudentDao;
import com.qburst.main.model.Student;

@RestController

public class RestServiceController {
 
    private StudentDao studentdao=new StudentDao();
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;
	}

     
    @RequestMapping(value="/students", method=RequestMethod.GET)
    public List<Student> students() {
        return studentdao.getStudents();
    }
     
     
    @RequestMapping(value="/student", method=RequestMethod.GET)
    public Student student(HttpServletRequest request) {
        if(request.getParameter("id")!=null)
        {
        return studentdao.getStudent(Integer.parseInt(request.getParameter("id")));
        }
        return null;
    }
}