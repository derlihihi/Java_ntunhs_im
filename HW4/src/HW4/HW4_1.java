package HW4;
import java.util.Scanner;
public class HW4_1 {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("這是可以陪你聊程式!你可以問我一些問題");
       while(true) {
           System.out.print("你說:");
           String originalString=sc.nextLine();
           if (originalString.equals("0")) {
               System.out.println("離開聊天程序");
               break;
           }
           String resultString=originalString.replace("嗎","");
           resultString=resultString.replace("?","!");
           resultString=resultString.replace("會不會","會");
           resultString=resultString.replace("能不能","能");
           resultString=resultString.replace("你能","我能");
           resultString=resultString.replace("你會","我會");
           System.out.println("我說:"+resultString);
       }
   }
} //已在其他地方編譯過 OK


