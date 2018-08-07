package br.unicentro.acaddecomp;

import java.util.*;

public class ConcreteSubject extends Subject{
	
	private Date hora;
	private static ConcreteSubject relogiocentral = new ConcreteSubject(); //Singleton
	
	//Retorna o Singleton criado
	public static synchronized ConcreteSubject getInstancia(){
		return relogiocentral;
	}
	
	//getters e setters
	public Date getHora(){
		return hora;
	}
	
	public void setHora(){
		Calendar cal = new GregorianCalendar();
		hora = cal.getTime();
		notificar(this); //notifica os observers da mudança do estado
	}
}
