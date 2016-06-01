import java.util.HashMap;
import java.util.Random;

import com.sun.javafx.collections.MappingChange.Map;
//birthday problem

public class birthday {
	public static double calculate(int size, int count){
        boolean check = false;
        double ans = 0.0;
        int count2 = count;
        int size2 = size;
        int counter = 0;
        
        while(count2!=0){
        	HashMap<Integer,Boolean> myMap = new HashMap<Integer,Boolean>();
        	Random rand = new Random();
        	rand.setSeed(count2);
        	while(size2!=0){
                
                
                int birthday = rand.nextInt(365)+0;
                //System.out.println(birthday);
                //System.out.println(check);
                //System.out.println(size);
              // System.out.println(size2);
                if(myMap.containsKey(birthday)){
                    //System.out.println("MIKE");
                   // counter++;
                   // System.out.print(counter);
                	check = true;
                    break;
                }else{
                	Boolean b = true;
                    myMap.put(birthday,b);
                   // System.out.println("devina");
                }
            size2--;
         //System.out.println(size2);
            }//System.out.println("--------------------------");
         if(check == true){
             ans++;
             //System.out.println(ans);
             check = false;
         }
         
        count2--;
        size2 = size;
        //System.out.println(count);
        }
       //System.out.println(ans);
      // System.out.println(count);
        double end = (ans*100.0)/count;
        return end;
        

       
    }

	public static void main(String[] args) {
		double yo = calculate(5, 10000);
		System.out.print("The percentage is ");
		System.out.println(yo);
	}
}

