
package vista;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import modelo.Tablero;


/**
 *
 * @author Gerald Reyes
 */

public class Principal {
 
   private static Tablero t = new Tablero();
   private static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        menu();
       
        
    }
    
 /**Metodo para mostrar menu del juego
 * @
 */
    public static void menu(){
        
        System.out.println("****************************************");
        System.out.println("**BIENVENIDOS AL SISTEMA DE SIMULACIÓN**");
        System.out.println("****************************************");
        System.out.println("1.Jugar");
        System.out.println("2.Reglas del Juego");
        System.out.println("3.Salir");
        System.out.println("------- Ingrese una opción -------");
		int op;
                Scanner sc = new Scanner(System.in);
		while(true) {
			String aux = sc.next();
			try {
				op = Integer.parseInt(aux);
				if(op>3 | op<1) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.err.println("INGRESE UNA OPCIÓN VALIDA!!");
			}
		}
                
                switch (op) {
            case 1:
                juego();
                break;
            case 2:
                instrucciones();
                break;
            case 3:
                System.out.println("Saliendo del juego Muchas Gracias!!");
                break;
            
        }
		
        
     
        
    
    }
 /** Metodo , el cual da a conocer las instrucciones del juego
 * @
 */
    private static void instrucciones(){
    System.out.println("El enfrentamiento táctico se desarrollará en un tablero de 15x15 celdas.\n"+
    "Las fuerzas que defiende al actual Gobierno, se desplegarán aleatoriamente al inicio de cada sesión."+ "\n"+
               "La flota de defensa se compone de:\n"+
               "3 Kromis, 5 Caguanos y 10 Trupallas\n\n"+
            "Ud. comandará a las fuerzas opositoras, autodenominadas como First Line.\n"+ 
               "Por pantalla se ingresarán las coordenadas (x/y), que determinarán donde caerá el Huevo bomba."+"\n"+
                       "Si en las coordenadas especificadas se ubica, algún tipo de vehículo enemigo, "+"\n"+
                       "se asignaran puntajes, según el siguiente detalle de score:\n"
                       + "1.- Kromi = 3pts"+"\n"
                       + "2.- Caguano = 2pts"+"\n"
                       + "3.- Trupalla = 1pts"+"\n"
            +"Esta versión cuenta con lanzamientos ilimitados de huevos.\n"+
                       "Al finalizar el juego se mostrará el puntaje obtenido y la ubicación oculta de los carros de la flota.\n\n");
                        menu();
    
    
    }
    
 /**metodo el cual inicia el juego
 * @
 */
    public static void juego(){
    
      Tablero.mostrarMatriz();
       
       int con =0;
       String seleccion="s";
        do {            
            
        
      System.out.println("Ingrese la coordenada X (entre 0-14 max)");
      int posX  =0;
      while(true) {
			String aux = sc.next();
			try {
				posX = Integer.parseInt(aux);
				if(posX<0 | posX>14) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.err.println("Rango Maximo 0-14!!");
			}
		}
      System.out.println("Ingrese la coordenada Y (entre 0-14 max)");
      
      int posY  =0;
      while(true) {
			String aux = sc.next();
			try {
				posY = Integer.parseInt(aux);
				if(posY<0 | posY>14) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.err.println("Rango Maximo 0-14!!");
			}
		}
      System.out.println("Lanzando Huevoo...");
          try {
              Thread.sleep(1500);
          } catch (InterruptedException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          }
      con++;
      System.out.println(""+Tablero.lanzarHuevo(posX, posY,con)+"");
      Tablero.mostrarMatriz2();
        
      System.out.println("¿DESEA VOLVER A LANZAR? (S/N)");
      seleccion=sc.next();   
            
      
            

    } while (seleccion.equalsIgnoreCase("s"));
        
        
       mostrarPuntaje(con); 
    }
    
 /**Metodo para mostrar el puntaje obtenido al finalizar el juego
 * @param con el parametro con define la cantidad de veces la cual el 
 * jugador lanza los huevos.
 */
    public static void mostrarPuntaje( int con){
    
        System.out.println("****************************************");
        System.out.println("*************PUNTAJE OBTENIDO***********");
        System.out.println("****************************************");
        
        System.out.println("Cantidad de Huevos Lanzados :"+con);
        Tablero.mostrarMatriz2();
        try {
              Thread.sleep(3000);
          } catch (InterruptedException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          }
        System.out.println("Ubicacion de Carros");
        Tablero.MatrizRevelada();
        System.out.println("Puntos Obtenidos :"+Tablero.calcularPuntaje()+"PTS");
        
        try {
              Thread.sleep(3000);
          } catch (InterruptedException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          }
        System.out.println("¿DESEA VOLVER A JUGAR? (1.-Si / 2.-No)");
        int op=0;
        while(true) {
			String aux = sc.next();
			try {
				op = Integer.parseInt(aux);
				if(op<0 | op>2) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.err.println("Ingrese Digito entre 1 y 2");
			}
		}
        if (op==1) {
            menu();
        }else if(op==2){
        System.err.println("********************************************");
        System.err.println("**MUCHAS GRACIAS POR UTILIZAR EL SIMULADOR**");
        System.err.println("********************************************");
        }
    
    }
    
    
    
    
}
