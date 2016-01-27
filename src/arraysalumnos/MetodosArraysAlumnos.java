/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysalumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class MetodosArraysAlumnos {
    private int numElementos = pedirElementos();
    String [] nomes = new String [numElementos];
    int [] notas = new int [numElementos];
    
    public int pedirElementos(){
        return Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de elementos :"));
    }
   public int pedirNotas(){
       return  Integer.parseInt(JOptionPane.showInputDialog("Introduce as notas :"));
   }
   public String pedirNomes(){
       return JOptionPane.showInputDialog("Introduce nome dos alumnos :");
   }
   public void cargarArray(){
       for (int i=0;i<nomes.length;i++){
           nomes[i]=pedirNomes();
           notas[i]=pedirNotas();
       }
   }
   public void visualizar(){
       for(int i=0;i<nomes.length;i++){
           JOptionPane.showMessageDialog(null, nomes[i] + " " + notas[i]);
       }
       
   }

       public void ordenacion (){
           int aux;
           String aux2;
       for (int i=0;i<numElementos-1;i++){
            for (int j =i + 1;j<numElementos;j++){
                if(notas[i]>notas[j]){
                   aux = notas[i];
                   notas[i] = notas[j];
                   notas[j] = aux;
                   aux2 = nomes[i];
                   nomes[i] = nomes[j];
                   nomes[j] = aux2;
                   
                }
           }
   
       
}
}
}
