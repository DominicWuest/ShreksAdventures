import javax.swing.JFrame;
import State.*;
import Constants.*;

class ShreksAdventure {

  // Size of JFrame on start
  private static final int STARTING_SIZE = 400;

  public static void main(String[] args) {

    // The current state of the program
    int state = Constants.MENU;

    // Initialising JFrame
    JFrame frame = new JFrame();
    frame.setSize(STARTING_SIZE, STARTING_SIZE);
    frame.setLocationRelativeTo(null); // Center JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setVisible(true);

    // Runs the program and switches states until state becomes CLOSE
    while ((state = runState(state, frame)) != Constants.CLOSE) {}

    // Close JFrame
    frame.dispose();
  }

  // Runs the correct files for the current state
  private static int runState(int state, JFrame frame) {
    switch( state ) {
      case Constants.MENU: return new Menu(frame).run();
      case Constants.GAME: return new Game(frame).run();
      default: return Constants.CLOSE;
    }
  }

}
