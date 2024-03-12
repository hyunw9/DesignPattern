package Adapter;

public class Galaxy implements PayService{

  @Override
  public String pay(String type) {
    return "일반 결제 완료";
  }
}
