package com.company;

public class Main {

    public static void main(String[] args) {
        try{
            NullPointer.Error();
        }catch(NullPointerException h){
            System.out.println(h.getMessage());
        }
    }
}
