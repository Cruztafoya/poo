import java.util.Scanner;

public class Practica2{
    
    static Scanner scanner = new Scanner(System.in);
    static Scanner name = new Scanner(System.in);
    
    
    public static void main(String[] args){

      
        int opcion = 0;
       
        do{
            System.out.println("1. captura alumnos");
            System.out.println("2. mostrar alumnos");
            System.out.println("3. cambiar calificaciones ");
            System.out.println("4. salir");
          
                
            System.out.println("elige una opcion: ");
            opcion = scanner.nextInt();
            switch(opcion){
                
                case 1:
                    
                    opcion1();
                    break;
                    
                case 2:
                    opcion2();

                    break;
                case 3:
                    opcion3();

                    break;
                
                case 4:
                    break;
                default:
                    System.out.println("digite un numero del 1 al 4 ");
                }    
                
            }while(opcion!=4);
                System.out.println("fin del programa");
          
        }
        
   
        
    static void opcion1(){

        Alumno al2 = new Alumno(CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce numero de control "), CapturaEntrada.capturarCadena("Introduce materia "),CapturaEntrada.capturarEntero("Introduce calificacion "));
		 
		
	System.out.println("Nombre: jesus cruz tafoya");
	System.out.println("Numero de control: 1254746");
	System.out.println("Materia: POO");
	System.out.println("Calificacion: 60");
	System.out.println("Estado: aprobado");
	System.out.println(); 
	System.out.println(al2.getNombre());
	System.out.println(al2.getNum());
        System.out.println(al2.getMateria());
     	System.out.println(al2.getCa());
        if(al2.getCa()>=60){
     	    System.out.println("aprobado");
     	}
     	else{
     	    System.out.println("reprobado");
        }

	}   

    static void opcion2(){
        
        
	System.out.println("Nombre: jesus cruz tafoya");
	System.out.println("Numero de control: 1254746");
        System.out.println("Materia: POO");
	System.out.println("Calificacion: 60");
	System.out.println("Estado: aprobado");
	System.out.println();
        
        
    }
    static void opcion3(){   
        System.out.println("calificaion 1: ");
        int c1=scanner.nextInt();
        System.out.println("nueva calificacion: ");
        int cal=scanner.nextInt();
        System.out.println("nueva calificacion: ");
        int nc1=scanner.nextInt();

       
        System.out.println("calificaciones anteriores " );
        System.out.println("calificacion alumno 1: " + c1);
	System.out.println("Calificacion: 60");
	System.out.println();
        System.out.println("calificaciones nuevas: ");
        System.out.println("calificacion: " + cal);
        System.out.println("calificacion: " + nc1);
        System.out.println();
        
    }

}
class Alumno{
	//en esta seccion se colocan los datos/campos/variables de clase/atributos 

    
	String nombre;
	int num;
	String materia; 
	int ca;

    
	
	
	//Método constructor
	public Alumno(String nombre, int num, String materia, int ca){
                
         
		setNombre(nombre);
		
		setNum(num);

		setMateria(materia);
 
		setCa(ca);

		


	}
	
	
    //Sección de metodos: setters, getters esto es solamente para mostrar o modificar el valor de un atributo
	
	//Construimos el método set para establecer un valor a el nombre del alumno.
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setNum(int num){
		this.num = num;
	}

	public void setMateria(String materia){
		this.materia = materia;
	}

       
	public void setCa(int ca){
		this.ca = ca;
	}
      
	

	
	public String getNombre(){
		return "Nombre: "+ nombre;
	}
	

	public int getNum(){
		return num;
	}


	public String getMateria(){
		return "Materia: " + materia;
	}


	public int getCa(){
		return ca;
	}


	

	
} //fin de clase Alumno



class CapturaEntrada{
//La clase captura entrada es la clase para poder leer datos de un programa y regresandolo aunque solo es necesario
//para este ejercicio el public static int y public static string

    //aqui lo que va hacer es que lee un valor int introducido por el usuario y regresandolo
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }

    //aqui lo que va hacer es que lee un valor de tipo float introducido por el usuario y regresandolo
    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }

    //aqui lo que va hacer es que lee un valor de tipo double introducido por el usuario y regresandolo
    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }

    //aqui lo que va hacer es que lee un valor de tipo string introducido por el usuario y regresandolo
    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

}

