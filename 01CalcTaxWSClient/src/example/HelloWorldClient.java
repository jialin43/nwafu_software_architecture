package example;

import johnny.HelloWS;
import johnny.HelloＷSServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      HelloWS service = new HelloＷSServiceLocator().getHelloＷSPort();
      Scanner sc  = new Scanner(System.in);
      System.out.println("请输入你的工资：");
      double income = sc.nextDouble();
      double result = service.calcTax(income);
      System.out.println("需缴税"+result);
    } catch (ServiceException e) {
      e.printStackTrace();
    } catch (RemoteException e) {
      e.printStackTrace();
    }

  }
}
