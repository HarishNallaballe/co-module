package com.co.rest;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.co.service.COService;
import com.lowagie.text.DocumentException;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CORestController {
	
	@Autowired
	public COService coService;
	
	//private PdfGene
	
	 @GetMapping("/export-to-pdf/{appNumber}")
	  public void generatePdfFile(@PathVariable Integer appNumber, HttpServletResponse response) throws DocumentException, IOException 
	  
	  {
	    response.setContentType("application/pdf");
	    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
	    String currentDateTime = dateFormat.format(new Date());
	    String headerkey = "Content-Disposition";
	    String headervalue = "attachment; filename=student" + currentDateTime + ".pdf";
	    response.setHeader(headerkey, headervalue);
	    coService.generate(appNumber, response);
	    
	    PDFGenerator pdf=new PDFGenerator();
	    //List < Student > listofStudents = studentService.getStudentList();
	    //PdfGenerator generator = new PdfGenerator();
	    //generator.generate(listofStudents, response);
	    
	    
	  } 

}
