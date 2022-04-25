package com.company;

 class start {
    public static void dep(int temp){
        int arr[]=new int[5];
        try{
            if(temp==0){
                int x=3/temp;
            }else if (temp==1){
                arr[6]=6;
            }else{
                return;
            }
        }
            catch (ArrayIndexOutOfBoundsException h){
                System.out.println("index is unacceptable");
        }catch(ArithmeticException h){
            System.out.println("divide by zero");
            return;
        }finally{
            System.out.println("acceptable");
        }
    }
}
 public class sectask {
     public static void main(String[] args){
         for (int i=0; i<3;i++)
         {
             start.dep(i);
             System.out.println();
         }
     }
 }