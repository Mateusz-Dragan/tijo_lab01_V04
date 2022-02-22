import java.lang.Math;
public class Circle extends Figure{

  public void print(){
    float dist;
    int radius = 5;

    // for horizontal movement
    for (int i = 0; i <= 2 * radius; i++) {

      // for vertical movement
      for (int j = 0; j <= 2 * radius; j++) {
        dist = (float) Math.sqrt((i - radius) * (i - radius) +
            (j - radius) * (j - radius));

        // dist should be in the range (radius - 0.5)
        // and (radius + 0.5) to print stars(*)
        if (dist > radius - 0.5 && dist < radius + 0.5)
          System.out.print("o");
        else
          System.out.print(" ");
      }

      System.out.println("");
    }
  }
}
