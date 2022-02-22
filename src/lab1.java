public class lab1 {

  public static void main(String[] args) {
    short age = 33;
    Girl monicaBellucci = new Girl();

    monicaBellucci.receiveFlower(new Rose());
    monicaBellucci.setAge(age);
    monicaBellucci.getFlower();
    monicaBellucci.age();

    System.out.print(monicaBellucci.age());
  }
}