package com.co.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.co.entity.Eligibility;
import com.co.entity.Plan;
import com.co.feign.EligibilityFeign;
import com.co.feign.PlanFeign;
import com.lowagie.text.*;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

public class COServiceImpl implements COService{

	@Autowired
	private EligibilityFeign elFeign;

	@Autowired
	private PlanFeign planFeign;
	
	@Override
	public String generateCorrespondence() {
		
		return null;
	}
	
	public void generate(Integer appNumber,HttpServletResponse response) throws DocumentException,IOException{
		
		Eligibility eligibility = elFeign.getEligibilityByAppNumber(appNumber).getBody();
		Integer planId = eligibility.getPlanId();
		String planName = planFeign.getPlanById(planId).getBody().getPlanName();
		
	    // Creating the Object of Document
	    Document document = new Document(PageSize.A4);
	    // Getting instance of PdfWriter
	    PdfWriter.getInstance(document, response.getOutputStream());
	    // Opening the created document to change it
	    document.open();
	    // Creating font
	    // Setting font style and size
	    Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	    fontTiltle.setSize(20);
	    // Creating paragraph
	    Paragraph paragraph1 = new Paragraph("List of the Students", fontTiltle);
	    // Aligning the paragraph in the document
	    paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
	    // Adding the created paragraph in the document
	    document.add(paragraph1);
	    // Creating a table of the 4 columns
	    PdfPTable table = new PdfPTable(4);
	    // Setting width of the table, its columns and spacing
	    table.setWidthPercentage(100f);
	    table.setWidths(new int[] {3,3,3,3});
	    table.setSpacingBefore(5);
	    // Create Table Cells for the table header
	    PdfPCell cell = new PdfPCell();
	    // Setting the background color and padding of the table cell
	    cell.setBackgroundColor(CMYKColor.BLUE);
	    cell.setPadding(5);
	    // Creating font
	    // Setting font style and size
	    Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	    font.setColor(CMYKColor.WHITE);
	    // Adding headings in the created table cell or  header
	    // Adding Cell to table
	    cell.setPhrase(new Phrase("ID", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("Student Name", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("Email", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("Mobile No", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("Mobile No", font));
	    table.addCell(cell);
	    
	    
	    // Iterating the list of students
	      // Adding student id
	      table.addCell(String.valueOf(eligibility.getAppNumber()));
	      // Adding student name
	      table.addCell(planName);
	      // Adding student email
	      table.addCell(eligibility.getEligibilityStatus());
	      // Adding student mobile
	      table.addCell(eligibility.getDenialReason());
	    
	    // Adding the created table to the document
	    document.add(table);
	    // Closing the document
	    document.close();
	  }

}
