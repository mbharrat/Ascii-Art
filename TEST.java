

public class TEST{
	public static void process(int size) {
		int count = 0;
		Boolean check = false;
		Boolean mid = false;
		for(int i =0; i<2*size+1;i++){
			check = false;
			for(int j = 0; j<2*size+2;j++){
			//frame check
			     if(i == 0 || i == 2*size){//create frame
	                    if(j==0 || j==2*size+1){
	                        System.out.print("+");

	                    }else{
	                        System.out.print("-");
	                    }
	             }else if(j==0 ||j==2*size+1){
	            	 System.out.print("|");
	            	 count++;
	             }else if(mid == false && i!=size){
	            	 int r = size - i;//algo for checking where to start
                     r = r+1;
                     if(j == r){
                         System.out.print("/");
                         count++;
                         check = true;
                     }
                     int q = (r+(2*i-2));
                     if(j == q){
                         System.out.print("\\");
                         count++;
                         check = false;
                     }else{
                    	 if(check == true){
                    		 if(i%2==0){
    	            			 System.out.print("-");
    	            			 count++;
    	            		 }else{
    	            			 System.out.print("=");
    	            			 count++;
    	            		 }
                    	 }else{
                    		 if(count<2*size+1){
                    			 System.out.print(" ");
                    			 count++;
                    		 }
                    	 }
                     }
	             }else if(i==size){
	            	 mid = true;
	            	 if(j==1){
	            		 System.out.print("<");
	            	 }else if(j==2*size){
	            		 System.out.print(">");
	            	 }else{
	            		 if(i%2==0){
	            			 System.out.print("-");
	            		 }else{
	            			 System.out.print("=");
	            		 }
	            	 }
	             }else if(mid == true){
	            	 int g = i - size;
                     int y = size - g;
                     int r = size - y;
                     r = r+1;
                     if(j == r){
                         System.out.print("\\");
                         count++;
                         check = true;
                     }
                     int q = (r+(2*y-2));
                     if(j == q){
                         System.out.print("/");
                         count++;
                         check = false;
                     }else{
                    	 if(check == true){
                    		 if(i%2==0){
    	            			 System.out.print("-");
    	            			 count++;
    	            		 }else{
    	            			 System.out.print("=");
    	            			 count++;
    	            		 }
                    	 }else{
                    		 if(count<2*size+1){
                    			 System.out.print(" ");
                    			 count++;
                    		 }
                    	 }
                     }
	             }
			}
			System.out.println();
			count = 0;
		}
	}
	public static void main(String[] args) {
		process(4);
	}
}