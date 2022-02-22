public class Main {
  static void printFigure(Figure figure){
    figure.print();
  }

  public static void main(String[] args){

    Square square = new Square();
    Triangle triangle = new Triangle();
    Circle circle = new Circle();
    printFigure(square);
    printFigure(triangle);
    printFigure(circle);

  }
}