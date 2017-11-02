/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author i16070
 */
public class ArithmeticOperations {
    public double compute(int num1,int num2,String operator){
        if(operator.equals("+")){
            return num1 + num2;
        }else if(operator.equals("-")){
            return num1 - num2;
        }else if(operator.equals("*")){
            return num1 * num2;
        }else{
            return num1 / num2;
        }
    }
}
