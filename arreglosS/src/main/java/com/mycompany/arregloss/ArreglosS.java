/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arregloss;

/**
 *
 * @author strdh
 */
public class ArreglosS {
    public static int[] arreglos(int[] nums1, int[] nums2) {
       int[] resultado = new int[nums1.length + nums2.length];
       int i = 0, j = 0, k = 0;
       
    while (i <nums1.length && j < nums2.length){
     if (nums1[i] <= nums2[j]){
         resultado[k++] = nums1[i++];
    }else {
         resultado[k++] = nums2[j++];
    } 
    }
    while (i < nums1.length){
        resultado[k++] = nums1[i++];
    }
    while (j < nums2.length){
        resultado[k++] = nums2[j++];
    }
    return resultado;
    }
        public static void main(String[] args){
      int[] nums1 = {1,4,8};
      int[] nums2 = {6,7,9};
      int[] resultado = arreglos(nums1, nums2);
      System.out.print("Resultado: [");
      for (int i = 0; i < resultado.length; i++){
           System.out.print(resultado[i]);
           if (i < resultado.length - 1){
               System.out.print(", ");
           }
    }
    System.out.println("]");
    }
}    

    
