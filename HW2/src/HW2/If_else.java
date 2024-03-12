package HW2;
import java.util.Scanner;
public class If_else {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("歡迎使用醫療診斷系統,請依序回答問題");
		System.out.println("====================================");
		System.out.println("請問您最近是否發燒(y/n)");
		String ans;
		String ans1;
		String ans2;
		String ans3;
		String ans4;
		String ans5;
		ans=sc.next();
		if(ans.equals("y")){
			System.out.println("請問您最近是否咳嗽(y/n)");
			ans1=sc.next();
		    if(ans1.equals("y")) {
		    	System.out.println("請問您最近是否感覺疲倦(y/n)");
		    	ans2=sc.next();
		    	if(ans2.equals("y")) {
		    		System.out.println("感冒");
		    	}
		    	else {
		    		System.out.println("其他系統");
		    	}
		    }
		    else{
		    	System.out.println("請問您是否血壓升高(y/n)");
		    	ans3=sc.next();
		    	if(ans3.equals("y")) {
		    		System.out.println("請問您最近是否口乾(y/n)");
		    		ans4=sc.next();
		    		if(ans4.equals("y")) {
		    			System.out.println("先生/小姐您可能得肝病!!!");
		    		}
		    		else {
		    			System.out.println("其他系統");
		    		}
		    			
		    	}
		    	else {
		    		System.out.println("請問您最近是否盜汗(y/n)");
		    		ans5=sc.next();
		    		if(ans5.equals("y")) {
		    			System.out.println("先生/小姐您可能得肺病!!!");
		    		}
		    		else {
		    			System.out.println("其他系統");
		    		}
		    	}
		    }
		}
		else{
			System.out.println("正常");
		}
	}
}
