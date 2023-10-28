package com.argen.pro.services;

import java.util.List;

import com.argen.pro.models.Editorial;

public interface IEditorialService {
	
public void saveEditorial(Editorial editorial);
	
	public List<Editorial> getAllEditorials();
	
	public Editorial getEditorialById(Integer id);
	
	public void updateEditorial(Editorial editorial);
	
	public void deleteEditorial(Integer id);


}
