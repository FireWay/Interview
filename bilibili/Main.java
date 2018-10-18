/*
 * 示例：1 2 3 4 5,10
 * ","前是一个数组，后为整数N
 * 数组中是否有三个数之和为N
 * 如果有，输出"True"
 * 没有，输出"False"
 */

import java.util.*;

public class Main{
	private static int[] nums;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String[] str = in.nextLine().split(",");
            String[] arrChar = str[0].split(" ");
            int[] arrInt = new int[arrChar.length];
            for(int i = 0; i < arrChar.length; i++) {
            	try {
            		arrInt[i] = Integer.parseInt(arrChar[i]);
				} catch (Exception e) {
					// TODO: handle exception
				}
            	
//            	System.out.println("arrInt[" + i +"]: " + arrInt[i]);
            	
            }
            Arrays.sort(arrInt);
            nums = arrInt;
            
//            for(int i = 0; i < arrChar.length; i++) {
//            	System.out.println("Sort: arrInt[" + i +"]: " + arrInt[i]);
//            }
            int N = 0;
            try {
            	N = Integer.parseInt(str[1]);
//            	System.out.println("N:" + N);
			} catch (Exception e) {
				// TODO: handle exception
			}
            
            if(judge(N, 3)){
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            
//            System.out.println("N:" +N);
            
            
//            break;
        }
        in.close();
    }
    public static boolean judge(int n, int times) {
//    	System.out.println("--------n:times  "+n+":"+times+"----------");
    	if(times == 0 && n == 0) {
//    		System.out.println("!!!! 0 true");
    		return true;
    	}
    	if(times == 0) {
//    		System.out.println("0 break");
    		return false;
    	}
    	boolean res;
    	for(int i = nums.length - 1; i >= 0; i--) {
//    		System.out.println("nums[" + i +"]:" + i);
    		if(true) {//不考虑正负数
//    		if(n >= nums[i]) {//只考虑了正数，简化了计算
//    			System.out.println(">: n-nums[" +i+"]:"+n+"-"+nums[i]);
    			res = judge(n - nums[i], times - 1);
    			if(res == true) {
    				return true;
    			}
    		}
    	}

		return false;
	}
    //1 9 99 25 24 3,125
}
