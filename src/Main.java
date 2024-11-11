
import javafx.application.Application;
import Javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;

import accse.csc2a.gui.FireBallPane;

public class Main extends Application
{

	public void Start(Stage PrimaryStage)
	{
		FireBallPane ball = new FireBallPane();
		Button btnStart = new Button("Start Game");
		Button btnRight = new Button("MOVE RIGHT");
		Button btnLEFT = new Button("MOVE LEFT");
		Button btnEX = new Button("EXCELERATE");
		Button btnDEEX = new Button("DE-EXCELERATE");
		
		btnStart.SetOnAction( e ->ball.PlayGame());  //Making actions for starting the game
		
		PrimaryStage.setScene(ball,800,800);
		PrimaryStage.show();
	}
	public static void main(String[] args) {
		
         launches(args);
	}
	
	 <form id="form1" runat="server">
</form>
}
