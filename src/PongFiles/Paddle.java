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
      super(10,10);
      speed =5;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y){
       super(x, y);
       speed = 5;
   }
   
   public Paddle(int x, int y, int speed){
       super(x, y);
       this.speed = speed;
   }
   
   public Paddle(int x, int y, int w, int h, int speed){
       super(x, y, w, h);
       this.speed = speed;
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int speed){
       super(x, y, w, h, c);
       this.speed = speed;
   }


   public void moveUpAndDraw(Graphics window)
   {
       draw(window, Color.white);
       setyPos(getyPos()+speed);
       draw(window, Color.red);

   }

   public void moveDownAndDraw(Graphics window)
   {

       draw(window, Color.white);
       setyPos(getyPos()-speed);
       draw(window, Color.red);

   }

   //add get methods
   
   
   //add a toString() method
}