package com.ua.vde.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ua.vde.objects.UserData;

@Component("checkUser")
public class CheckUserInterceptor extends HandlerInterceptorAdapter{

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		if(request.getRequestURI().contains("check-user")){
			UserData user  = (UserData)modelAndView.getModel().get("user");
			if(user == null || !user.isAdmin()){
				response.sendRedirect(request.getContextPath()+"/failed-user");
			}
		}
	}

 
	
	
}
