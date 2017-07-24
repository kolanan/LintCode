public class Uglynumber {
    /**
     * @param num an integer
     * @return true if num is an ugly number or false
     *
     因数只有2，3，5的数称之为丑数
     /
    public static boolean isUgly(int num) {
    	if(num < 1){
    		return false;
    	}
        while(num >= 2){
        	if(num % 2 == 0){
        		num = num / 2;
        	}else if(num % 3 == 0){
        		num = num / 3;
        	}else if(num % 5 == 0){
        		num = num / 5;
        	}else{
        		return false;
        	}
        }
        return num == 1;
        
    }
}
