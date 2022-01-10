/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author User
 */
public class Upgrade {

    /**
     *
     * @param nama
     * @param i
     * @param lengthName
     * @return
     */
    public boolean SameString(String nama,int i,int lengthName){
       
        if(nama.charAt(i) != nama.charAt(lengthName))
            return false;
        
        if (i < lengthName+ 1)
            return SameString (nama, i + 1, lengthName - 1);
            
     
        return true;
}
     public int Diagonal(int[][] matriks){
        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int i =0; i<matriks.length;i++){
          if(i == 0){
            diagonal1 += matriks[i][1];
            diagonal2 += matriks[i][2];
          }else if(i == 1){
            diagonal1 += matriks[i][1];
            diagonal2 += matriks[i][1];
          }else if(i == 2){
            diagonal1 += matriks[i][2];
            diagonal2 += matriks[i][0];
          }
        }        
//        int diagonal1 = matriks[0][0]+matriks[1][1]+matriks[2][2];
//        int diagonal2 = matriks[0][2]+matriks[1][1]+matriks[2][0];
        return diagonal1+diagonal2;
        
    }}


