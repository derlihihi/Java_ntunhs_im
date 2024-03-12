package HW2;
import java.util.Scanner;
import java.util.Random;
public class Number {
public static void main(String args[]) {
Random rand = new Random();
int ans=rand.nextInt(100);
int guess=0;
int min=0;
int max=100;
Scanner SC= new Scanner(System.in);
while(true) {
	
	System.out.print("請輸入一個數字");
	guess=SC.nextInt();
	int validate_num=ans-guess;
	
	if(validate_num>0) {
	System.out.println("你猜的答案太小了");
	System.out.println("範圍"+guess+"~"+max);
	min=guess;
	//System.out.println("範圍")
	}
	else if(validate_num<0){
	System.out.println("你猜的答案太大了");
	System.out.println("範圍"+min+"~"+guess);
	max=guess;
	}
	else {
		System.out.println("你猜對答案了");
		break;
	}
}
}
}
