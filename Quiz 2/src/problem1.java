import java.util.ArrayList;
import java.util.Scanner;


public class problem1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Black");
        arrayList.add("White");
        arrayList.add("Pink");
        System.out.println("Before swap: ");
        System.out.println(arrayList);
        String temp1,temp2;
        System.out.print("Enter what you want to swap: ");
        temp1 = in.next();
        System.out.print("Enter what you want to swap: ");
        temp2 =  in.next();
        if(arrayList.contains(temp1) && arrayList.contains(temp2)){

            swap(arrayList,temp1,temp2);
            System.out.println("After swap: ");
            System.out.println(arrayList);
        }
        else{
            System.out.println("Elements not found\n");
        }

    }
    public static void swap(ArrayList<String> arr,String temp1,String temp2){
        int index1,index2;
        for(int i=0;i< arr.size();i++){
            if(arr.get(i) == temp1) {
                arr.set(i, temp2);
                continue;
            }
            if(arr.get(i)==temp2){
                arr.set(i,temp1);
            }
        }

    }
}
