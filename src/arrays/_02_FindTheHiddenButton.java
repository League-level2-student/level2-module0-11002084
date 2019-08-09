/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.

	JButton[] buttons;

	// 2 create an int variable called hiddenButton

	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int

		String inputValue = JOptionPane.showInputDialog(
				"Enter a positive number. ONLY POSITIVE. If you enter something else, there will be lots of crying and sadness.");
		int intInputValue = Integer.parseInt(inputValue);
		if (intInputValue < 0) {
			JOptionPane.showMessageDialog(null,
					"You dummy, you numbskull, you absolute buffoon. You had one job. ONE JOB.");
		}

		// 4. Initialize the array of JButtons to be the size of the int created in step

		buttons = new JButton[intInputValue];

		// 5. Make a for loop to iterate through the JButton array

		for (int i = 0; i < buttons.length - 1; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}

		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel

		// 9 add the panel to the window

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

		// 11. set the JFrame to visible.

		// 12. Give the user the instructions for the game.

		JOptionPane.showMessageDialog(null,
				"Oh boy. A game. A button will show the word 'E'. Then the program will pause and you will have to click the correct button after it unpauses. Have fun.");

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		Random rand = new Random();

		hiddenButton = rand.nextInt(intInputValue);

		// 14. Set the text of the JButton located at hiddenButton to "ME"

		buttons[hiddenButton].setText("E");

		// 15. Use Thread.sleep(1000); to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 16. Set the text of the JButton located at hiddenButton to be blank.

		buttons[hiddenButton].setText("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.

		if (buttonClicked == buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "Oh boy. You won. Good for you.");
		} else {
			JOptionPane.showMessageDialog(null, "*Visible Disappointment* Try again.");
		}

		// 18. else tell them to try again
	}
}
