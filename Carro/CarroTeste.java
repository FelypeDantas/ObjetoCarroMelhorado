package Carro;

public class CarroTeste {
  public static void main(String[] args) {
	  
	  Carro ferrari = new Carro();
	  ferrari.modelo = "Ferrari Enzo";
	  ferrari.VelocidadeMaxima = 349;
	  ferrari.SegundosZeroacem = 3.2;
	  Motor v12 = new Motor();
	  v12.tipo = "V12";
	  v12.potencia = 660;
	  ferrari.motor = v12;
	  
	  System.out.println(ferrari.modelo);
	  System.out.println(ferrari.motor.potencia);
  }
}
