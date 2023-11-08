import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
	// put your size call here
    size(600, 600);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    for(float i = 15; i < 600; i += 100){
       moley(i, 10);
    }

  }
  
  /**
   * Draws a moley
   * @param moleyX sets the X value of the moley
   * @param moleyY sets the Y value of the moley
   */
  public void moley(float moleyX, float moleyY){
    stroke(0, 0, 0);
    fill(0, 0, 0);
    rect(32 + moleyX, 6 + moleyY, 6, 20);

    stroke(49, 34, 160);
    fill(49, 34, 160);
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