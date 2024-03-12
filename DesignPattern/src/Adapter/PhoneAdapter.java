package Adapter;

public class PhoneAdapter implements PayService{

  Iphone phone;

  public PhoneAdapter(String type) {
    if(type.equals("iphone")){
      phone = new Iphone();
    }
  }

  @Override
  public String pay(String type) {

    return phone.doFaceId(type)+ "\n" + phone.pay(type);
  }
}
