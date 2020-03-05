package com.company;

public class Xndir59 {
    private int number;
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    private int fourthNumber;

    public Xndir59(){

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public int getFourthNumber() {
        return fourthNumber;
    }

    public int[] lucum(){
        int[] x = new int[3];
        firstNumber = number % 10;
        secondNumber = (number - firstNumber) / 10 % 10;
        thirdNumber = ((number - firstNumber) - 10 * secondNumber) / 100 % 10;


        if (secondNumber > firstNumber && firstNumber > thirdNumber){
            x[0]=thirdNumber;
            x[1]=firstNumber;
            x[2]=secondNumber;
        }

        if (secondNumber > thirdNumber && thirdNumber > firstNumber ){

            x[0]=firstNumber;
            x[1]=thirdNumber;
            x[2]=secondNumber;
        }

        if (firstNumber > secondNumber && secondNumber > thirdNumber){

            x[0]=thirdNumber;
            x[1]=secondNumber;
            x[2]=firstNumber;
        }
        if (firstNumber > thirdNumber && thirdNumber > secondNumber){

            x[0]=secondNumber;
            x[1]=thirdNumber;
            x[2]=firstNumber;
        }
        if (thirdNumber > firstNumber && firstNumber > secondNumber){

            x[0]=secondNumber;
            x[1]=firstNumber;
            x[2]=thirdNumber;
        }
        if (thirdNumber > secondNumber && secondNumber > firstNumber){

            x[0]=firstNumber;
            x[1]=secondNumber;
            x[2]=thirdNumber;
        }
        return x;
    }
}
