public class Greeting1{
  public static void main(String[] args){
    PrintGreet1 pg1 = new PrintGreet1("おはよう");
    PrintGreet1 pg2 = new PrintGreet1("おやすみ");
    PrintGreet1 pg3 = new PrintGreet1("ありがとう");
    pg1.start();
    pg2.start();
    pg3.start();
  }
}
