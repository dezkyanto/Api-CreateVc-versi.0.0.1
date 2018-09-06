package id.dezkyanto.javaspring.createcv.service;

import id.dezkyanto.javaspring.createcv.model.PersonalData;

public interface CreateCvService {

	public int insert(PersonalData personalData);

	public int update(PersonalData personalData, String idPersonalData);

	public PersonalData getall();

	public PersonalData getById(String idPersonalData);

	public int removeById(String idPersonalData);

	public int removeAll();

}
