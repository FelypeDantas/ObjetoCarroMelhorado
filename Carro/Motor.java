package Carro;

public class Motor {

	String tipo;
	int potencia;
	
	Motor(){
		this("", 0);
	}

	public Motor(String string, int i) {
		tipo = string;
		potencia = i;
	}
}
