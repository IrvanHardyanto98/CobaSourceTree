/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author: Irvan Hardyanto
 * NPM: 2016730070
 * tanggal: 8 September 2017
 */
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTestCase = sc.nextInt();
        
        Bakery bkr = new Bakery();
        for (int i = 0; i <  numOfTestCase; i++) {
            int kode = sc.nextInt();
            int x = sc.nextInt();
            
            if(kode == 1){
                bkr.buyFlour(x);
            }else if(kode == 2){
                bkr.buyEgg(x);
            }else{
                bkr.bakeCake(x);
            }
        }
        System.out.println(bkr.toString());
        sc.close();
    }
}
