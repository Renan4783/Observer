package br.unicentro.acaddecomp;

import java.util.*;

public abstract class Subject {
	private List<Observer> listobservadores = new LinkedList<>();
	
	//Adiciona e remove os observadores da lista
	public void add(Observer observador){
		listobservadores.add(observador);
	}
	
	public void remove(Observer observador){
		listobservadores.remove(observador);
	}
	
	//notifica todos os observadores inscritos na lista
	public void notificar(ConcreteSubject Csubject){
		for (int i = 0; i<listobservadores.size(); i++) {
			Observer observ;
			observ = listobservadores.get(i);
			observ.update(Csubject);
		}
	}
}
