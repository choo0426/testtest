package com.tech.controller.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tech.controller.disp.Controller;

public class FamilyMemberJoinController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("FamilyMemberJoinController");
		response.sendRedirect("joinform.jsp");
	}

}
