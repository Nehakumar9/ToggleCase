package togglecase;

import java.util.Scanner;

public class ToggleCase {

	public static char [] toggleCase(String s){
        char array[]=s.toCharArray();
        for(int i=0;i<array.length;i++){
            array[i] ^= 32;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =scanner.nextLine();
        char array[]=toggleCase(s);
        //String result=new String(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
	}

}
