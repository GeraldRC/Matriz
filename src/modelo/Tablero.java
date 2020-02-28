package modelo;

import java.util.ArrayList;
import vista.Principal;

/**
 *
 * @author Edgardo
 */

public class Tablero {
	
	private static ArrayList<Carro> listaCarro = new ArrayList<>(); 
	private static ArrayList<Huevo> listaHuevos = new ArrayList<>();
	static  int numFilas = 15;
	static  int numColumnas = 15;
	static	 String[][] tablero = new String[numFilas][numColumnas];
        static String letra ="" ;
        static int x1 = 0;
	static int y1 =0;
	static int con =0;
	static int con2=0;
	static int con3=0;
	

	
	

	
	public static ArrayList<Carro> getListaCarro() {
		return listaCarro;
	}

	public static void setListaCarro(ArrayList<Carro> listaCarro) {
		Tablero.listaCarro = listaCarro;
	}

	public static ArrayList<Huevo> getListaHuevos() {
		return listaHuevos;
	}

	public static void setListaHuevos(ArrayList<Huevo> listaHuevos) {
		Tablero.listaHuevos = listaHuevos;
	}

 /**
 * Metodo para crear  instancias de la clase carro y llenar una lista de 
 * tipo carro.
 * @
 */
	public static void crearCarro() {
		Kromi kromi1 = new Kromi(6,"12/08/2019",0,0,1992,"Volvo");
		listaCarro.add(kromi1);
		Kromi kromi2 = new Kromi(6,"12/08/2019",0,0,1991,"Mercedes");
		listaCarro.add(kromi2);
		Kromi kromi3 = new Kromi(6,"12/08/2019",0,0,1990,"Ford");
		listaCarro.add(kromi3);
		
		Caguano caguano1 = new Caguano();
		listaCarro.add(caguano1);
		Caguano caguano2 = new Caguano();
		listaCarro.add(caguano2);
		Caguano caguano3 = new Caguano();
		listaCarro.add(caguano3);
		Caguano caguano4 = new Caguano();
		listaCarro.add(caguano4);
		Caguano caguano5 = new Caguano();
		listaCarro.add(caguano5);
		
		Trupalla trupalla1 = new Trupalla();
		listaCarro.add(trupalla1);
		Trupalla trupalla2 = new Trupalla();
		listaCarro.add(trupalla2);
		Trupalla trupalla3 = new Trupalla();
		listaCarro.add(trupalla3);
		Trupalla trupalla4 = new Trupalla();
		listaCarro.add(trupalla4);
		Trupalla trupalla5 = new Trupalla();
		listaCarro.add(trupalla5);
		Trupalla trupalla6 = new Trupalla();
		listaCarro.add(trupalla6);
		Trupalla trupalla7 = new Trupalla();
		listaCarro.add(trupalla7);
		Trupalla trupalla8 = new Trupalla();
		listaCarro.add(trupalla8);
		Trupalla trupalla9 = new Trupalla();
		listaCarro.add(trupalla9);
		Trupalla trupalla10 = new Trupalla();
		listaCarro.add(trupalla10);
	}
 /**
 * Metodo para lanzar los huevos, cuando el usuario ingrese las posiciones
 * @param posX parametro el cual contiene la posicion X de la matriz
 * @param posY parametro el cual contiene la posicion Y de la matriz
 * @param con parametro el cual contiene la cantidad de huevos lanzados
 * @return Golpe parametro el cual retorna un String
 */
	public static String lanzarHuevo(int posX ,int posY, int con) {
            
            String Golpe ="";
            int celdas =0;
            
            for (int i = 0; i < tablero.length; i++) {
                
                for (int j = 0; j < tablero.length; j++) {
                    if (tablero[i][j] =="H") {
                      celdas ++; 
                    }
                }
            }
            
            if (celdas == 225) {
                Principal.mostrarPuntaje(con);
            }
		
            if (tablero[posX][posY] =="K") {
                listaHuevos.add(new Huevo(posX,posY,3));
                tablero[posX][posY]="H";
                Golpe="HAS GOLPEADO UNA KROMI (3PTS)";
                
                
       
            }else if(tablero[posX][posY] =="C"){
                listaHuevos.add(new Huevo(posX,posY,2));
                tablero[posX][posY]="H";
                Golpe="HAS GOLPEADO UN CAGUANO (2PTS)";
                
            }else if(tablero[posX][posY] =="T"){
                listaHuevos.add(new Huevo(posX,posY,1));
                tablero[posX][posY]="H";
                Golpe="HAS GOLPEADO UNA TRUPALLA (1PTS)";
                
            }else if(tablero[posX][posY] =="H"){
                listaHuevos.add(new Huevo(posX,posY,0));
                Golpe="GOLPEASTE EN UN LUGAR YA ACERTADO ANTERIORMENTE (0PTS)";
            }else{
                listaHuevos.add(new Huevo(posX,posY,0));
                tablero[posX][posY]="H";
                Golpe="NO GOLPEASTE NADA (0PTS)";
            }
		
	return Golpe;	
	}
	
 /**
 *Metodo el cual muestra llena la matriz con los carros correspondientes
 * 
 */
	public static void mostrarMatriz() {
		for (int i = 0; i < 17; i++) {
            
            
	         
            if (i<3) {
                letra = "K";
            }else{
                if (i>=3 && i<=7) {
                    letra ="C";
                }else{
                    if (i>=8 && i<=17) {
                        letra="T";
                    }
                }
            
            }
            
            if (letra == "K") {
                while (con<3) {
                    x1 = crearNumero();
                    y1 = crearNumero();
                    
                    if (tablero[x1][y1] == null && tablero[x1+1][y1] == null && tablero[x1+2][y1] == null) {
                        tablero[x1][y1] ="K";
                        tablero[x1+1][y1] ="K";
                        tablero[x1+2][y1] ="K";
                        con= con +1;
                    }
                    
                }
                
                
         }else if(letra == "C"){
            while (con2<=4) {
                    x1 = crearNumero2();
                    y1 = crearNumero2();
                    
                    if (tablero[x1][y1] == null && tablero[x1][y1+1] == null ) {
                        tablero[x1][y1] ="C";
                        tablero[x1][y1+1] ="C";
                       
                        con2= con2 +1;
                    }
                    
                }
            
            
            }else if(letra == "T"){
               while (con3<=9) {
                    x1 = crearNumero3();
                    y1 = crearNumero3();
                    
                    if (tablero[x1][y1] == null  ) {
                        tablero[x1][y1] ="T";
                        con3= con3 +1;
                    }
                    
                }
            
            
            }
            
            
            
            
        }
        
        mostrarMatriz3();
	       
	
 }

/**
 *
 * Metodo el cual revela la matriz al jugador con los carros visibles
 */        
	public static void MatrizRevelada(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                
                if (tablero[i][j] == null) {
                    tablero[i][j] =" ";
                    
                }
                if (tablero[i][j] == "H") {
                    tablero[i][j] =" ";
                    
                }
                System.out.print("["+tablero[i][j]+"]"); 
            }
            System.out.println("");
        
        
        }
	    
	    }	
        
  /**
 *
 * Metodo el cual revela la matriz al jugador con los aciertos 
 */ 
	
	public static void mostrarMatriz2(){
        
		for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                
                if (tablero[i][j] == "H") {
                     System.out.print("["+tablero[i][j]+"]"); 
                    
                }else{
                    
                System.out.print("[ ]");
                }
                
            }
            System.out.println("");
        
        
        }
	    }
        
        /**
 *
 * Metodo el cual revela la matriz al jugador con las celdas vacias
 */ 
        
        public static void mostrarMatriz3(){
        
		for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                
                if (tablero[i][j] == null) {
                    tablero[i][j] =" ";
                    
                }
                System.out.print("[ ]"); 
            }
            System.out.println("");
        
        
        }
	    }
        
 /**
 *
 * Metodo el cual calcula el puntaje del jugador
 * @return puntaje retorna el puntaje obtenido por el metodo
 */ 

	public static int calcularPuntaje() {
	    int puntaje =0;
            for (int i = 0; i < listaHuevos.size(); i++) {
                Huevo h = listaHuevos.get(i);
                
                puntaje = h.getPuntaje();
                
            }
		
		
		return puntaje;
	}
	
 /**
 *
 * Metodo el cual calcula un numero aleatorio entre 0 y 12
 * 
 */ 
	 public static int  crearNumero() { 
			int num =  (int) Math.floor(Math.random()*(12-0)+0);
			
			return num;
		}
 /**
 *
 * Metodo el cual calcula un numero aleatorio entre 0 y 13
 * 
 */
		public static int  crearNumero2() {
			int num =  (int) Math.floor(Math.random()*(13-0)+0);
			
			return num;
		}
    /**
 *
 * Metodo el cual calcula un numero aleatorio entre 0 y 14
 * 
 */       
		public static int  crearNumero3() {
			int num =  (int) Math.floor(Math.random()*(14-0)+0);
			
			return num;
		}
	
}

