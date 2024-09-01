package com.co.service;

import java.io.IOException;

import com.lowagie.text.DocumentException;

import jakarta.servlet.http.HttpServletResponse;

public interface COService {
	
	public String generateCorrespondence();
	
	public void generate(Integer appNumber,HttpServletResponse response) throws DocumentException,IOException;

}
