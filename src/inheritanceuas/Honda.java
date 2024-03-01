/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceuas;

/**
 *
 * @author Acer
 */
  public class Honda extends Motor {
        public void tampilkan() {
         String bahanbakar="Pertamax";
         
         Motor m = new Motor();
         
         m.inputData("Vario","Matic","Hitam");
         m.tampilkandata();
         
         System.out.println("jenis bahan bakar :"+bahanbakar);
        }
} 

