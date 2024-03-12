package Adapter;

public class IphonePay implements PayService{

  PhoneAdapter phoneAdapter;

  @Override
  public String pay(String type) {

      phoneAdapter = new PhoneAdapter("iphone");
      return phoneAdapter.pay("iphone");


  }
}
