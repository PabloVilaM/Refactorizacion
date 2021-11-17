package boletin12_1b;

import javax.swing.JOptionPane;


public class Garaje {
    private int numeroCoches = 0;
    private String matricula;
    private float precio;
    private float  cartosRecibidos;
    private float cartosDevoltos; 
    private float horas;
    
    public void iniciar(){
        
        for (numeroCoches = 0; numeroCoches <=5 ; numeroCoches ++){
            if(numeroCoches <= 5){
                System.out.println("Plazas disponibles");
                System.out.println("Procede a realizarse la factura cuando salga");
                facturar();
                System.out.println("FACTURA: " + "\nMatricula coche: " + matricula + "\nTempo: " + horas + "\nPrecio: " + precio + "\nCartos recibidos: " + cartosRecibidos + "\nCartos devoltos: " + cartosDevoltos + "\n Gracias por usar o noso aparcamento");
                
            }
            else{
                System.out.println("Aparcamiento completo");
            }
        }
    }
    
    public void facturar(){
        
         int j = 0;
         
         String hor = JOptionPane.showInputDialog("Cuantas horas ah estado dentro?");
         horas = Float.parseFloat(hor);
         if (horas <= 3){
            precio = 1.5f;
         }
         else{
            precio = horas * 0.2f + 1.5f - 0.6f;
            
         }
         String reb = JOptionPane.showInputDialog("Cuantos cartos has recibido?");
         cartosRecibidos = Float.parseFloat(reb);
        
        while (j == 0){
            if (precio > cartosRecibidos){
            System.out.println("Eso no posible es");
            reb = JOptionPane.showInputDialog("Cuantos cartos has recibido?");
            cartosRecibidos = Float.parseFloat(reb);       
            }           
            else{
                j ++;
            }
        }
        
        cartosDevoltos = cartosRecibidos - precio;
    }
}
