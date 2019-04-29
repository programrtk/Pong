package PongFiles;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
      super(10,10, 10, 40);
      speed =5;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y){
       super(x, y, 10, 40);
       speed = 5;
       setColor(Color.BLUE);
   }
   
   public Paddle(int x, int y, int speed){
       super(x, y);
       this.speed = speed;
       setColor(Color.BLUE);
   }
   
   public Paddle(int x, int y, int w, int h, int speed){
       super(x, y, w, h);
       this.speed = speed;
       setColor(Color.BLUE);
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int speed){
       super(x, y, w, h);
       this.speed = speed;
       setColor(c);
   }


   public void moveUpAndDraw(Graphics window)
   {
       draw(window, Color.white);
       setyPos(getyPos()-speed);
       draw(window, Color.blue);

   }

   public void moveDownAndDraw(Graphics window)
   {

       draw(window, Color.white);
       setyPos(getyPos()+speed);
       draw(window, Color.blue);

   }

   //add get methods
   
   
   //add a toString() method
}