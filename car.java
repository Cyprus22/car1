package car;
import java.util.Scanner;
//import java.util.regex.Pattern;
public class car {
  public void run()
  {
	  System.out.print("������������ʻ");
  }
  public void oil()
  {
	  System.out.println("���������Լ���");
  }
public static void main(String[] args)
{
	car car1=new car();
	System.out.println("���Ǳ�֤���ǵ���������������Ϊ:");
    car1.run();
    car1.oil();
	String[]info=new String[3];
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	System.out.print("���������������ӣ�");
    info[0]=input.next();
    System.out.print("���������䴢�����Ĵ�С��");
    info[1]=input.next();
    System.out.print("�������������ͺļ�Ϊƽ��ÿ���Ϳ����߶�Զ��");
    info[2]=input.next(); 
    System.out.print("������ĵ������������£���ȷ���Ƿ�����������");
    System.out.print("���������ӣ�"+info[0]+"   ");
    System.out.print("���������䴢����"+info[1]+"L"+"   ");
    System.out.print("�������ͺģ�"+info[2]+"4km/L"+"   ");
} 
}
