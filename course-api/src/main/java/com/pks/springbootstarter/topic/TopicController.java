package com.pks.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@RestController
@SessionAttributes("employee")
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@Autowired
	EmployeeManager manager;

	@Autowired
	EmployeeValidator validator;

	// output json converted object...bydefault RestController will convert the java
	// object to JSON format
	// Return of the response as below
	// [{"id":"Spring","name":"Spring Framework","description":"Spring Framework
	// Description"},{"id":"Java","name":"Core Java Framework","description":"Core
	// Java Framework Description"},{"id":"JavaScript","name":"JavaScript
	// Framework","description":"javaScript Framework Description"}]
	@RequestMapping("/alltopics")
	public List<Topic> getAllTopics() {

		return topicService.getAllTopics();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		EmployeeVO employeeVO = new EmployeeVO();
		model.addAttribute("employee", employeeVO);
		return "addEmployee";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("employee") EmployeeVO employeeVO, BindingResult result,
			SessionStatus status) {
		// Validation code
		validator.validate(employeeVO, result);

		// Check validation errors
		if (result.hasErrors()) {
			return "addEmployee";
		}

		// Store the employee information in database
		// manager.createNewRecord(employeeVO);

		// Mark Session Complete
		status.setComplete();
		return "redirect:addNew/success";

	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success(Model model) {
		return "addSuccess";
	}

}
