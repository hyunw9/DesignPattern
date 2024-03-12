package Adapter;

public class Iphone implements IphonePayService{

  @Override
  public String pay(String type) {
    return type +" 결제 완료.";
  }

  @Override
  public String doFaceId(String type) {

    return type +" 님 face Id 완료";
  }
}
