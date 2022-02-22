public class Triangle extends Figure{

  public void print(){
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < i+1; j++){
        System.out.print("o");
      }
      System.out.println("");
    }
  }
}
