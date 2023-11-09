import processing.core.PApplet;
import java.util.Random; 

public class Sketch extends PApplet {

  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    for(float yValue = 120; yValue < 600; yValue += 120){
      for(float xValue = 85; xValue < 500; xValue += 100){
        smile(xValue, yValue);
      }
    }


    for(float yValue = 20; yValue < 600; yValue += 120){
      for(float xValue = 15; xValue < 600; xValue += 100){
        Random randomColour1 = new Random();
        int intRandomColour1 = randomColour1.nextInt(256);

        Random randomColour2 = new Random();
        int intRandomColour2 = randomColour2.nextInt(256);

        Random randomColour3 = new Random();
        int intRandomColour3 = randomColour3.nextInt(256);
        moley(xValue, yValue, intRandomColour1, intRandomColour2, intRandomColour3);
      }
    }

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  

  // Level 2

  /**
   * 
   * @param smileX
   * @param smileY
   */
  public void smile(float smileX, float smileY){
    stroke(0, 0, 0);
    fill(0, 0, 0);
    ellipse(smileX, smileY, 15, 15);
    ellipse(smileX + 30, smileY, 15, 15);
    arc(smileX + 15, smileY + 15, 60, 50, 0, ((float) 3.14));
  }


  // Level 3

  /**
   * Draws a moley
   * @param moleyX sets the X value of the moley
   * @param moleyY sets the Y value of the moley
   * @param colourR gets a random value for colour
   * 
   */
  public void moley(float moleyX, float moleyY, float colourR, float colourG, float colourB){
    stroke(0, 0, 0);
    fill(0, 0, 0);
    rect(32 + moleyX, 6 + moleyY, 6, 20);

    stroke(49, 34, 160);
    fill(colourR, colourG, colourB);
    ellipse(35 + moleyX, 46 + moleyY, 70, 60);

    stroke(255, 230, 66);
    fill(255, 230, 66);
    ellipse(35 + moleyX, 51 + moleyY, 20, 10);
    ellipse(35 + moleyX, 4 + moleyY, 8, 8);

    stroke(0, 0, 0);
    fill(0, 0, 0);
    ellipse(15 + moleyX, 46 + moleyY, 15, 5);
    ellipse(55 + moleyX, 46 + moleyY, 15, 5); 
  }
}