package car;
import java.util.Scanner;
//import java.util.regex.Pattern;
public class car {
  public void run()
  {
	  System.out.print("这辆车可以行驶");
  }
  public void oil()
  {
	  System.out.println("这辆车可以加油");
  }
public static void main(String[] args)
{
	car car1=new car();
	System.out.println("我们保证我们的汽车具有如下行为:");
    car1.run();
    car1.oil();
	String[]info=new String[3];
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	System.out.print("请输入汽车的牌子：");
    info[0]=input.next();
    System.out.print("请输入油箱储存量的大小：");
    info[1]=input.next();
    System.out.print("请输入汽车的油耗即为平均每升油可以走多远：");
    info[2]=input.next(); 
    System.out.print("您需求的的汽车条件如下，请确认是否符合你的需求！");
    System.out.print("汽车的牌子："+info[0]+"   ");
    System.out.print("汽车的油箱储量："+info[1]+"L"+"   ");
    System.out.print("汽车的油耗："+info[2]+"4km/L"+"   ");
} 
}
