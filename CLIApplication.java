package server.main;


import java.util.Arrays;

import library.domain.*;

public class CLIApplication {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

// A paired tag in xml is a cotainer, it has a closing tag, has value, content. A single tag 
		// doesn't have any closing tags, so it isn't a container and doesn't have any
		// content

		Missile m = (Missile) new DomainFactory().get("library.domain.Missile");
		m.setDamage(100);
		System.out.println(m.getClass() + ":  "+ Arrays.toString(m.getClass().getDeclaredFields()) + " = " + m.getDamage());

		Ship s = (Ship) new DomainFactory().get("library.domain.Ship");
		s.setHealth(100);
		System.out.println(s.getClass() + ":  "+ Arrays.toString(s.getClass().getDeclaredFields()) + " = " + s.getHealth());

		
		
		
		

	}

}
