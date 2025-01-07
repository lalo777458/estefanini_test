package com.test.estefanini.service;

import com.test.estefanini.entity.dto.PersonDto;
import com.test.estefanini.entity.dto.Response;

public interface IPersonService {
	
	public Response getPerson();
	
	public Response savePerson(PersonDto person);
	
	public Response updatePerson(PersonDto person);
	
	public Response deletePerson(Integer id);

}
