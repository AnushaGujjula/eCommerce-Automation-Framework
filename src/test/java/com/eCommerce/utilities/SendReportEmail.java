package com.eCommerce.utilities;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class SendReportEmail {
	private String reportName;
	
	public SendReportEmail(String reportName) {
		this.reportName = reportName;
	}

	public void sendMail() throws EmailException {
	  // Create the attachment
	  EmailAttachment attachment = new EmailAttachment();
	  attachment.setPath("F:/Git Hub Code Clones/eCommerce-Automation-Framework/test-output/"+reportName);
	  attachment.setDisposition(EmailAttachment.ATTACHMENT);
	  attachment.setDescription("eCommerce Automation Test Report");
	  attachment.setName(reportName);

	  // Create the email message
	  MultiPartEmail email = new MultiPartEmail();
	  email.setHostName("smtp.gmail.com");
	  email.setSmtpPort(465);
	  email.setAuthenticator(new DefaultAuthenticator("anushagujjula18@gmail.com", "Sony@1801"));
	  email.setSSLOnConnect(true);
	  email.addTo("21.anu.kra@gmail.com", "Anu");
	  email.setFrom("anushagujjula18@gmail.com", "Anusha Gujjula");
	  email.setSubject("eCommerce Test Report");
	  email.setMsg("Please find atatched test report");

	  // add the attachment
	  email.attach(attachment);

	  // send the email
	  email.send();
	}
	}
