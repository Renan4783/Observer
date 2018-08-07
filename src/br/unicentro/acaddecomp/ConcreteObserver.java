package br.unicentro.acaddecomp;

import java.util.*;

public class ConcreteObserver implements Observer{
	
	private ConcreteSubject subject;
	
	@Override
	public void update(ConcreteSubject subject) {
		this.subject=subject;//recebe os dados do sujeito observado
	}

	public Date hora(){
		return this.subject.getHora();
	}
}
