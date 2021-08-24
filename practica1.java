import java.util.Scanner;

public class practica1{
    
    static Scanner scanner = new Scanner(System.in);
    static Scanner name = new Scanner(System.in);
    
    
    public static void main(String[] args){

      
        int opcion = 0;
       
        do{
            System.out.println("1. captura de nombre y calificaciones");
            System.out.println("2. imprimir calificaciones y promedio de calificaciones");
            System.out.println("3. imprimir calificaciones y calificacion mas baja");
            System.out.println("4. imprimir calificaciones y la calificacion mas alta");
            System.out.println("5. salir");
                
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
                    opcion4();

                    break;
                case 5:
                    break;
                default:
                    System.out.println("digite un numero del 1 al 5 ");
                }    
                
            }while(opcion!=5);
                System.out.println("fin del programa");
          
        }
        
   
        
    static void opcion1(){
        System.out.println("introduce el nombre: ");
        String nombre=name.nextLine();
        System.out.println("introduce la calificacion 1: ");
        int cali1=scanner.nextInt();
        System.out.println("introduce la calificacion 2: ");
        int cali2=scanner.nextInt();
        System.out.println("introduce la calificacion 3: ");
        int cali3=scanner.nextInt();
        System.out.println("introduce la calificacion 4: ");
        int cali4=scanner.nextInt();
        System.out.println("introduce la calificacion 5: ");
        int cali5=scanner.nextInt();
        System.out.println("datos del alumno");
        System.out.println(nombre);
        System.out.println(cali1);
        System.out.println(cali2);
        System.out.println(cali3);
        System.out.println(cali4);
        System.out.println(cali5);
        
        
    }
    static void opcion2(){
        System.out.println("introduce la calificacion 1: ");
        int cal1=scanner.nextInt();
        System.out.println("introduce la calificacion 2: ");
        int cal2=scanner.nextInt();
        System.out.println("introduce la calificacion 3: ");
        int cal3=scanner.nextInt();
        System.out.println("introduce la calificacion 4: ");
        int cal4=scanner.nextInt();
        System.out.println("introduce la calificacion 5: ");
        int cal5=scanner.nextInt();
        float promedio=(cal1+cal2+cal3+cal4+cal5)/5;
        System.out.println("el promedio del alumno es: "+promedio);
        
        
    }
    static void opcion3(){
        System.out.println("introduce la calificacion 1: ");
        int ca1=scanner.nextInt();
        System.out.println("introduce la calificacion 2: ");
        int ca2=scanner.nextInt();
        System.out.println("introduce la calificacion 3: ");
        int ca3=scanner.nextInt();
        System.out.println("introduce la calificacion 4: ");
        int ca4=scanner.nextInt();
        System.out.println("introduce la calificacion 5: ");
        int ca5=scanner.nextInt();
        
        if(ca1<ca2 && ca1<ca3){
            if(ca1<ca4 && ca1<ca5){
                System.out.println("la calificacion menor es: "+ca1);
            }
            
        }if(ca2<ca1 && ca2<ca3){
            if(ca2<ca4 && ca2<ca5){
                System.out.println("la calificacion menor es: "+ca2);
            }
        }if(ca3<ca1 && ca3<ca2){
            if(ca3<ca4 && ca3<ca5){
                System.out.println("la calificacion menor es: "+ca3);
            }
            
        }if(ca4>ca1 && ca4>ca2){
            if(ca4>ca3 && ca4>ca5){
                System.out.println("la calificacion menor es: "+ca4);
            }
        }if(ca5<ca1 && ca5<ca2){
            if(ca5<ca3 && ca5<ca4){
                System.out.println("la calificacion menor es: "+ca5);
            }
        }else{
            System.out.println("no hay una sola calificacion menor ");
    
        }
    }
    static void opcion4(){
        System.out.println("introduce la calificacion 1: ");
        int c1=scanner.nextInt();
        System.out.println("introduce la calificacion 2: ");
        int c2=scanner.nextInt();
        System.out.println("introduce la calificacion 3: ");
        int c3=scanner.nextInt();
        System.out.println("introduce la calificacion 4: ");
        int c4=scanner.nextInt();
        System.out.println("introduce la calificacion 5: ");
        int c5=scanner.nextInt();
        
        if(c1>c2 && c1>c3){
            if(c1>c4 && c1>c5){
                System.out.println("la calificacion mayor es: "+c1);
            }
            
        }if(c2>c1 && c2>c3){
            if(c2>c4 && c2>c5){
                System.out.println("la calificacion mayor es: "+c2);
            }
        }if(c3>c1 && c3>c2){
            if(c3>c4 && c3>c5){
                System.out.println("la calificacion mayor es: "+c3);
            }
            
        }if(c4>c1 && c4>c2){
            if(c4>c3 && c4>c5){
                System.out.println("la calificacion mayor es: "+c4);
            }
        }if(c5>c1 && c5>c2){
            if(c5>c3 && c5>c4){
                System.out.println("la calificacion mayor es: "+c5);
            }
        }else{
            System.out.println("no hay una sola calificacion mayor");
        }
        
    }
        

}


