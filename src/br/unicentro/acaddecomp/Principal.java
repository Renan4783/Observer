package br.unicentro.acaddecomp; 

public class Principal {
	public static void main (String args[]){
		ConcreteObserver Digital = new ConcreteObserver();
		ConcreteObserver Analogico = new ConcreteObserver();
		ConcreteSubject relogiocentral = ConcreteSubject.getInstancia();
		
		relogiocentral.add(Digital);
		relogiocentral.add(Analogico);
		
		//Seta primeira hora
		relogiocentral.setHora();
		
		System.out.println("Data inicial (Digital): " + Digital.hora());
		System.out.println("Data inicial (Analogico): " + Analogico.hora());
		
		try {
			Thread.sleep(4800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Atualiza a hora
		relogiocentral.setHora();
		
		System.out.println("Data atualizada (Digital): " + Digital.hora());
		System.out.println("Data atualizada (Analogico): " + Analogico.hora());
	}
}
