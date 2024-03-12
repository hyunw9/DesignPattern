package ModernJavaInAction.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Sorting {

  public static void main(String[] args) {
    PriorityQueue<Apple> pq = new PriorityQueue<>((a1,a2)-> Integer.compare(a1.getWeight(),a2.getWeight()));
  }

}
