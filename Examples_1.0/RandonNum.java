import java.util.*;
public class RandonNum {
    public static void main(String[] args) {
       
            Random num=new Random(20L);   
		System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt()); 
                
            System.out.println("After changing seed");
            num.setSeed(5L);
            System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt()); 
                
                System.out.println("After changing seed");
                num.setSeed(20L);
                
             System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt());
		System.out.println("Random number: "+num.nextInt()); 
                   
    }
}