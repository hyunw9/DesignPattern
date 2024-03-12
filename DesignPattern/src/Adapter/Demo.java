package Adapter;

public class Demo {

  public static void main(String[] args) {
    IphonePay iphonePay = new IphonePay();

    System.out.println(iphonePay.pay("iphone"));
  }

}
