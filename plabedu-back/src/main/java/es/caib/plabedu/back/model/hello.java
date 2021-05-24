package es.caib.plabedu.back.model;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class hello {

String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}