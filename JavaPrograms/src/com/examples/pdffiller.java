package com.examples;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

public class pdffiller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File f = new File("D:\\demo.pdf");
	        PDDocument pdd = PDDocument.load(f);
	 
	        // step 2.Creating instance of AccessPermission
	        // class
	        AccessPermission ap = new AccessPermission();
	 
	        // step 3. Creating instance of
	        // StandardProtectionPolicy
	        StandardProtectionPolicy stpp
	            = new StandardProtectionPolicy("abcd", "abcd", ap);
	 
	        // step 4. Setting the length of Encryption key
	        stpp.setEncryptionKeyLength(128);
	 
	        // step 5. Setting the permission
	        stpp.setPermissions(ap);
	 
	        // step 6. Protecting the PDF file
	        pdd.protect(stpp);
	 
	        // step 7. Saving and closing the PDF Document
	        pdd.save("D:\\demo.pdf1");
	        pdd.close();
	 
	        System.out.println("PDF Encrypted successfully...");
	    }
	}
	}

}
