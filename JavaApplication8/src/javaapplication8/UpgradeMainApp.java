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
public class UpgradeMainApp {

    /**
     * @param args the command line arguments
     */
    public boolean SameString(String nama){
        int i = 0;
        int lengthName = nama.length()-1;
        
        while(i < lengthName/2){
            if(nama.charAt(i) != nama.charAt(lengthName)){
                return false;
            }
            lengthName --;
            i ++;
        }
        return true;
    }
   
    public int Diagonal(int[][] matriks){
        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int i =0; i<matriks.length;i++){
            for(int j =0; j<matriks[0].length;j++){
                if(i == j){
                    diagonal1 += matriks[i][j];
                    if(i == 1 && j == 1){
                        diagonal2 += matriks[i][j];
                    }
                }
                else if(i==0 && j == 2){
                    diagonal2 += matriks[i][j];
                    System.out.println(matriks[i][j]);
                }
                else if(i == 2 && j ==0){
                    diagonal2 += matriks[i][j];
                    System.out.println(matriks[i][j]);
                }
            }
        }
//        int diagonal1 = matriks[0][0]+matriks[1][1]+matriks[2][2];
//        int diagonal2 = matriks[0][2]+matriks[1][1]+matriks[2][0];
        return diagonal1+diagonal2;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        UpgradeMainApp  myc = new UpgradeMainApp();
        boolean result1 = myc.SameString("katak");
        System.out.println(result1);
        boolean result2 = myc.SameString("basi");
        System.out.println(result2);
        boolean result3 =myc.SameString("isi");
        System.out.println(result3);
        int [][] a = {{11,2,4},{4,5,6},{10,8,12}};
        int result = myc.Diagonal(a);
        System.out.println("result diagonal 3X3: "+ result);
        
        
        Upgrade  upg = new Upgrade();
        int j = "katak".length()-1;
        boolean result_1 = upg.SameString("katak",0,j);
        System.out.println(result1);
        int k = "basi".length()-1;
        boolean result_2 = upg.SameString("basi", 0 , k);
        int l = "isi".length()-1;
        System.out.println(result2);
        boolean result_3 =upg.SameString("isi", 0, l);
        System.out.println(result3);
        int [][] matrix = {{11,2,4},{4,5,6},{10,8,12}};
        int res = upg.Diagonal(matrix);
        System.out.println("result diagonal 3X3: "+ result);
        
        
        
    }
    
}
