package com.mycompany.Starter;

import com.codename1.ui.Form;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import java.lang.String;

public class Game extends Form {
	private GameWorld gw;

	public Game() {
		gw = new GameWorld();
		gw.init();
		play();

	}

	private void play() {
		Label myLabel = new Label("Press S to create a LadyBug: "); //taken from notes
		this.addComponent(myLabel);
		final TextField myTextField = new TextField();
		this.addComponent(myTextField);
		this.show();

		myTextField.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {

				String sCommand = myTextField.getText().toString();

				myTextField.clear();
				switch (sCommand.charAt(0)) {

				case 's':
					gw.addLadyBug(); // add ladybug
					break;
				case 'z':
					gw.addSpider(); // press z to add spider
					break;
				case 'a':
					gw.increaseSpeed(); // accelerate ladybug
					break;
				case 'b':
					gw.decreaseSpeed(); // brake, slow down ladybug
					break;
				case 'l':
					gw.steerLeft(); // turn left
					break;
				case 'r':
					gw.steerRight(); // turn left
					break;
				case '3':
					gw.hitFlag(); // simulate flag hit
					break;
				case 'f':
					gw.removeFoodStation(); // remove flag
					break;
				case 'g':
					gw.playerHit(); // simulates spider hit player
					break;
				case 't':
					gw.tick(); // game has ticked
					break;
				case 'd':
					gw.displayGame(); // displays game info
					break;
				case 'm':
					gw.Map();// print a map showing current world state
					break;

				case 'q': 
					gw.quit(); 

					final TextField myTextField2 = new TextField(); // will ask the user if they want to quit, then will have to confirm
					addComponent(myTextField2);
					removeComponent(myTextField);
					show(); 
					myTextField2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt2) {
							String sCommand2 = myTextField2.getText().toString();

							myTextField2.clear();

							if (sCommand2.charAt(0) == 'y') { // displays the yes or no for if the user wants to quit
								gw.quit2();
							} else if (sCommand2.charAt(0) == 'n') 
							{
								addComponent(myTextField);
								removeComponent(myTextField2);
								show();
							}

						}
					});
					break;

				}

			}
		});
	}
}