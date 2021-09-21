
import java.util.Date;

public class prac5poo{

 public static void main(String args[]){
	Pajaro1 pj1 = new Pajaro1();
	Pajaro2 pj2 = new Pajaro2();
	Pajaro3 pj3 = new Pajaro3();
	
	pj1.setNombre("Bomb");
	pj1.setColor("Negro");
	pj1.setForma("Redonda");
	pj1.setTipo("Cuervo");
	pj1.setEspecialidad("Fuerte vs piedra");
	pj1.setAlcance("Medio");
	pj1.setTamano("Grande");
	pj1.setExplosion("Explota al minimo contacato");
	pj1.setExplosion2("Crea una onda electrica expansiva");
	pj1.setHabilidad("Levantar objetos o cerdos y usarlos de escudo");
	pj2.setNombre("Jake, Jay,Jim");
	pj2.setColor("Azul");
	pj2.setForma("Redonda");
	pj2.setTipo("Azulejos");
	pj2.setEspecialidad("Romper el cristal");
	pj2.setAlcance("Corto");
	pj2.setTamano("Pequeno");
	pj2.setDividirse("Se puede dividir en 3");
	pj3.setNombre("Chuck");
	pj3.setColor("Amarillo");
	pj3.setForma("Triangular");
	pj3.setTipo("Canario");
	pj3.setEspecialidad("Destruccion de madera");
	pj3.setAlcance("Normal");
	pj3.setTamano("Mediano");
	pj3.setAceleracion("Se vuelve mas veloz");
	pj3.setDisparo("Dispara un  rayo lacer");
	
	System.out.println("Caracteristicas del primer pajaro:");
	System.out.println("Name: " + pj1.getNombre());
	System.out.println("Color: " + pj1.getColor());
	System.out.println("forma: " + pj1.getForma());
	System.out.println("Raza: " + pj1.getTipo());
	System.out.println("Especialidad: " + pj1.getEspecialidad());
	System.out.println("alcance: " + pj1.getAlcance());
	System.out.println("tamano: " + pj1.getTamano());
	System.out.println("Power: " + pj1.getExplosion());
	System.out.println("power2: " + pj1.getExplosion2());
	System.out.println("Habildad: " + pj1.getHabilidad());
	System.out.println();
	System.out.println("Caracteristicas del segundo pajaro:");
	System.out.println("Nomnbre: " + pj2.getNombre());
	System.out.println("Color: " + pj2.getColor());
	System.out.println("Forma: " + pj2.getForma());
	System.out.println("Raza: " + pj2.getTipo());
	System.out.println("Especialidad: " + pj2.getEspecialidad());
	System.out.println("Alcance: " + pj2.getAlcance());
	System.out.println("Tamano: " + pj2.getTamano());
	System.out.println("Especial: " + pj2.getDividirse());
    System.out.println();
	System.out.println("Caracteristicas del tercer pajaro:");
	System.out.println("Nomnbre: " + pj3.getNombre());
	System.out.println("Color: " + pj3.getColor());
	System.out.println("Forma: " + pj3.getForma());
	System.out.println("Raza: " + pj3.getTipo());
	System.out.println("Especialidad: " + pj3.getEspecialidad());
	System.out.println("Alcance: " + pj3.getAlcance());
	System.out.println("Tamano: " + pj3.getTamano());
	System.out.println("Toca: " + pj3.getAceleracion());
	System.out.println("Shot: " + pj3.getDisparo());

 }
 
}

class Pajaro{
	String nombre;
	String color;
	String forma;
	String tipo;
	String especialidad;
    String alcance;
    String tamano;
    
	//Poner los contructores
	//Poner setters y getters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setColor(String color){
		this.color = color;
	}
	
	public void setForma(String forma){
		this.forma = forma;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public void setEspecialidad(String especialidad){
		this.especialidad = especialidad;
	}
	
	public void setAlcance(String alcance){
		this.alcance = alcance;
	}
	
	public void setTamano(String tamano){
		this.tamano = tamano;
	}
	
	//...
	
	public String getNombre(){
		return nombre;
	}
	public String getColor(){
		return color;
	}
	public String getForma(){
		return forma;
	}
	public String getTipo(){
		return tipo;
	}
	public String getEspecialidad(){
		return especialidad;
	}
	public String getAlcance(){
		return alcance;
	}
	public String getTamano(){
		return tamano;
	}
}

class Pajaro1 extends Pajaro{ // C++-> class Profesor: Persona
		String explosion; 
		String explosion2; 
		String habilidad;
		
		//Agragar un método Constructor que reciba parámetross correspondientes a los atritubos

		//Agregar setter y getters
	

		
		public void setExplosion(String explosion){
			this.explosion = explosion;
		}
		
		public void setExplosion2(String explosion2){
			this.explosion2 = explosion2;
		}
		
		public void setHabilidad(String habilidad){
			this.habilidad = habilidad;
		}
	
		public String getExplosion(){
			return explosion;
		}
		
		public String getExplosion2(){
			return explosion2;
		}
		
		public String getHabilidad(){
			return habilidad;
		}

}


class Pajaro2 extends Pajaro{

	//sección de datos/campos/variables de clase/atributos
	String dividirse;
	
		
	//Agragar un método Constructor que reciba parámetross correspondientes a los atritubos	
		
	//Sección de metodos: setters, getters
	
	public void setDividirse(String dividirse){
		this.dividirse = dividirse;
	}

		
	
	public String getDividirse(){
		return dividirse;
	}

} 

class Pajaro3 extends Pajaro{
    
    String aceleracion;
    String disparo;
    
    public void setAceleracion(String aceleracin){
		this.aceleracion = aceleracion;
	}

		
	
	public String getAceleracion(){
		return aceleracion;
	}
	
    public void setDisparo(String disparo){
		this.disparo = disparo;
	}

		
	
	public String getDisparo(){
		return disparo;
	}
    
    
    
    
    
    
    
    
}
    
