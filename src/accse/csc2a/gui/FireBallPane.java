package accse.csc2a.gui;
import javafx.scene.layout.Pane;

import java.time.Duration;

import javafx.animation.Timeline;
import javafx.animation.keyFrame;
import javafx.scene.Shape.Circle;
import javafx.scene.paint.Colour;

public class FireBallPane extends Pane{
	private int BallRadius = 50;
	private int BallX = BallRadius;
	private int BallY = BallRadius;
	private int Dx=-1;
	private int Dy=-1;
	
	Circle fireball = new Circle(BallX,BallY,BallRadius);//the fire ball is going to be a circle
	private Timeline time;
	
	public FireBallPane() {
		fireball.setStroke(Colour.Yellow);
		fireball.setFill(Colour.Orange);
		getchildren.add(fireball);              ///adding the fireball to the pane
		time =new Timeline(new KeyFrame(Duration.Millis(50000), e ->MoveFireBall()));
		time.setCycle(TIMELINE.INDEFINATE);
		time.Play();
	}

	public void MoveFireBall()
	{
	  if(BallX < BallRadius || BallX> getweight()-BallRadius)// check the weight in the pane class
	  {
		  Dx *= -1;//changing the directions of the fireball when going side ways
	  }
	  
	  if(BallY < BallRadius || BallY> getHeight()-BallRadius)// check the weight in the pane class
	  {
		  Dy *= -1;//changing the directions of the fireball when going side ways
	  }
	  
	          BallX+=Dx;
			  BallY+=Dy;
			  
	  fireball.centerX(BallX);
	  fireball.centerY(BallY);
	}
	public void PlayGame()
	{
	
	}
	//public void getWeight()
	//{
	
	//}
}
