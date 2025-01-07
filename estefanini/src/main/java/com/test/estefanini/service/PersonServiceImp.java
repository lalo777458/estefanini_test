package com.test.estefanini.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.estefanini.entity.Person;
import com.test.estefanini.entity.dto.PersonDto;
import com.test.estefanini.entity.dto.Response;
import com.test.estefanini.repository.IPersonDAO;

@Service
public class PersonServiceImp implements IPersonService {

	@Autowired
	private IPersonDAO iPersonDAO;

	private static final String answer_ok = "successful operation";

	private static final String answer_error = "error in operation";

	@Override
	public Response getPerson() {

		Response response = new Response();
		try {
			List<PersonDto> list = iPersonDAO.findAllByOrderByIdDesc().stream().map(PersonDto::new)
					.collect(Collectors.toList());
			response.setStatus(true);
			response.setObj(list);
			response.setMsg(answer_ok);

		} catch (Exception e) {
			response.setMsg(answer_error);
		}
		return response;
	}

	@Override
	public Response savePerson(PersonDto person) {
		Response response = new Response();
		try {
			PersonDto personSave = new PersonDto(iPersonDAO.save(new Person(person)));
			response.setObj(personSave);
			response.setMsg(answer_ok);
			response.setStatus(true);
		} catch (Exception e) {
			response.setMsg(answer_error);
		}
		return response;
	}

	@Override
	public Response updatePerson(PersonDto person) {
		Response response = new Response();
		try {
			Person personObj = iPersonDAO.findById(person.getId()).get();
			personObj.setNombre(person.getNombre());
			personObj.setApellido(person.getApellido());
			personObj.setFechaNacimiento(person.getFechaNacimiento());
			personObj.setPuesto(person.getPuesto());
			personObj.setSueldo(person.getSueldo());

			iPersonDAO.save(personObj);

			response.setObj(personObj);
			response.setStatus(true);
			response.setMsg(answer_ok);
		} catch (Exception e) {
			response.setMsg(answer_error);
		}
		return response;
	}

	@Override
	public Response deletePerson(Integer id) {
		Response response = new Response();
		try {
			iPersonDAO.deleteById(id);
			response.setMsg(answer_ok);
			response.setStatus(true);
		} catch (Exception e) {
			response.setMsg(answer_error);
		}
		return response;
	}

}
