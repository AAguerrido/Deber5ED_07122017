package ec.edu.ister.modelo;

import javax.swing.JOptionPane;



/**
 *
 * @author Alfonso
 */
public class Arreglo_max_min_promedio {
    
    public static void maximo(){
        
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero de elementos"));
        
    int[] Arreglo=new int[n];
    
    for (int i=0; i<n; i++){
        
        Arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(i+"  Ingrese el elemento"));
       
    }
    int mayor;
    mayor=Arreglo[0];
    for(int j=1;j<n;j++)
    {
        if(Arreglo[j]>mayor)
        {
            mayor=Arreglo[j];
        }
        
    }
    JOptionPane.showMessageDialog(null,"El elemento mayor es: "+ mayor);
    
    }
    
    public static void minimo(){
        
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero de elementos"));
        
    int[] Arreglo=new int[n];
    
    for (int i=0; i<n; i++){
        
        Arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(i+"  Ingrese el elemento"));
       
    }
    int menor;
    menor=Arreglo[0];
    for(int j=1;j<n;j++)
    {
        if(Arreglo[j]<menor)
        {
            menor=Arreglo[j];
        }
    }
    JOptionPane.showMessageDialog(null,"El elemento menor es: "+ menor);
    
    }
    
    /*suma = suma +num;
            promedio = suma/10;*/
    
     public static void promedio(){
        
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero de elementos"));
        
    int[] Arreglo=new int[n];
    
    for (int i=0; i<n; i++){
        
        Arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(i+"  Ingrese el elemento"));
       
    }
    int suma=0,promedio=0,num;
    num=Arreglo[0];
    for(int j=0;j<n;j++)
    {
    suma = suma+num;
    promedio = suma/n; 
    }
    JOptionPane.showMessageDialog(null,"El promedio es: "+ promedio);
    
    }
    
    public static void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("INGRESE EL NUMERO DE LA OPCION A REALIZAR\n\n"
               + "MENU OPCIONES\n\n"
               + "1) Hallar el Máximo\n"
               + "2) Hallar el Mínimo\n"
               + "3) Hallar el Promedio\n"
               + "4) SALIR--->\n\n"));
       
        
       switch(op){
           
           case 1:
               maximo();
               break;
           case 2:
               minimo();
               break;
           case 3:
               promedio();
               break;
                
       }
    } while (op!=4);
    
    
}
    
}


