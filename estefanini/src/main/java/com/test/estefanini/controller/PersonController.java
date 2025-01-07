package com.test.estefanini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.estefanini.entity.dto.PersonDto;
import com.test.estefanini.entity.dto.Response;
import com.test.estefanini.service.IPersonService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private IPersonService iPersonService;

	@GetMapping("/list")
	public @ResponseBody Response getPerson() {
		return iPersonService.getPerson();
	}

	@PostMapping("/save")
	public @ResponseBody Response savePerson(@RequestBody PersonDto person) {
		return iPersonService.savePerson(person);
	}

	@PutMapping("/update")
	public @ResponseBody Response updatePerson(@RequestBody PersonDto person) {
		return iPersonService.updatePerson(person);
	}

	@DeleteMapping("/remove")
	public Response deletePerson(@RequestParam Integer id) {
		return iPersonService.deletePerson(id);
	}

}
