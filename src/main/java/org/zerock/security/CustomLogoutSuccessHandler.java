package org.zerock.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomLogoutSuccessHandler extends
SimpleUrlLogoutSuccessHandler implements LogoutSuccessHandler {

  @Autowired
  

  @Override
  public void onLogoutSuccess(
    HttpServletRequest request, 
    HttpServletResponse response, 
    Authentication authentication) 
    throws IOException, ServletException {

      String refererUrl = request.getHeader("Referer");
      log.info("Logout from: " + refererUrl);
      response.sendRedirect("/sample/all");
      //super.onLogoutSuccess(request, response, authentication);
  }
}