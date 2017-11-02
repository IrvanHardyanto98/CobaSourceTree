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
public class Bakery {
    private int eggs,flour,cakesSold;
    
    public void buyFlour(int num){
        this.flour += num;
    }
    
    public void buyEgg(int num){
        this.eggs += num;
    }
    
    public void bakeCake(int num){
        try{
            if(this.flour - (num * 3) < 0)throw new NotEnoughFlourException();
            if(this.eggs - (num * 2) < 0)throw new NotEnoughEggException();
            this.flour -= num * 3;
            this.eggs -= num * 2;
            this.cakesSold+= num;
            System.out.printf("Sold %d cake(s)\n",num);
        }catch(NotEnoughEggException nee){
            System.out.println(nee.getMessage());
            this.buyEgg(2 * num);
        }catch(NotEnoughFlourException nef){
            System.out.println(nef.getMessage());
            this.buyFlour(3 * num);
        }
    }
    
    public String toString(){
        return String.format("Flour =  %d\nEggs = %d\nCake(s) sold = %d\n",this.flour,this.eggs,this.cakesSold);
    }
}
