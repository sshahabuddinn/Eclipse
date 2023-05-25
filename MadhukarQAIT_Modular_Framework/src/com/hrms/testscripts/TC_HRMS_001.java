package com.hrms.testscripts;

import com.hrms.LIB.General;

public class TC_HRMS_001 {

	public static void main(String[] args) throws InterruptedException {
		//create object for "General" class
				General gl= new General();
				//test case steps
				gl.setUp();
				gl.adminLogin();
				gl.addEmp();
				gl.delEmp();
				gl.adminLogout();
				gl.tearDown();


	}

}
