package com.lxit.crmsystem.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lxit.crmsystem.vo.Staffs;

public class LoginInterceptors implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception exc)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		if ("GET".equalsIgnoreCase(request.getMethod())) {
			Staffs user = (Staffs) request.getSession().getAttribute("staff");
			if (user == null) {
				response.sendRedirect("../index.html");
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

}
