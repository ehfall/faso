package sn.faso.fall.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * An authentication entry point implementation adapted to a REST approach.
 */
public class RESTAuthenticationEntryPoint implements AuthenticationEntryPoint{

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
		
	}

}
