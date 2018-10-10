import java.util.*;
import java.util.Map.Entry;

/*
 * 多项式化简
 */

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
            ArrayList<Integer> v1 = new ArrayList<>();
            ArrayList<Integer> v2 = new ArrayList<>();
            
            String str = in.nextLine();
            if(str.charAt(0) == '-') {
            	
            } else {
		str = "+"+str;
	    }
            String[] k = str.split("X\\^\\d{1,}");
            String[] v = str.split("X\\^|\\+|\\-");
            for(int i=0; i < k.length; i++) {
 //           	System.out.println(k[i]);
            	v1.add(Integer.parseInt(k[i]));
//            	System.out.println(v1.get(i));
            }
            System.out.println();
            for(int i=2; i < v.length; i++) {
            	//System.out.println(v[i]);
            	if(i%2==0) {
 //           		System.out.println("v:" + v[i]);
            		v2.add(Integer.parseInt(v[i]));
            		//System.out.println(v2.get(i));
            	}
            }
            int klength = v1.size();
            int vlength = v2.size();
//            System.out.println(klength +":"+ vlength);
            int temp = 0;


            while(klength > 0 && vlength > 0 && temp < klength) {
            	int tempVal1 = v2.get(temp);
            	int tempVal2 = v1.get(temp);
            	System.out.println(temp);
            	
            	if(tm.containsKey(tempVal1)) {
            		tempVal2 += tm.get(tempVal1);
            		
            	}
            	
            	tm.put(tempVal1, tempVal2);
   //         	System.out.println(v2.get(temp) +" - " + v1.get(temp));
            	temp++;
            }

            NavigableMap<Integer, Integer> trs = tm.descendingMap();
            
            Iterator<Integer> iter = trs.keySet().iterator();
            
            boolean flag = true;
            while(iter.hasNext()) {
            	
            	int key = (int)iter.next();
            	int val = (int)trs.get(key);
            	if(val == 0) {
            		continue;
            	}
            	if(flag) {
            		if(val >= 0) {
                		System.out.print(val+"X^"+key);
                	}else {
                		System.out.print(val+"X^"+key);
    			}
            		flag =false;
            		
            	} else {
            		if(val >= 0) {
            			System.out.print("+" + val+"X^"+key);
            		}else {
            			System.out.print(val+"X^"+key);
			}
            	}
            	
            }
            System.out.println();
            

        }
        
        in.close();
    }
}
