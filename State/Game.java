package State;
import GUI.*;
import Constants.*;
import javax.swing.JFrame;
import EventListenerImpl.KeyListenerImpl.*;
import EventListenerImpl.MouseListenerImpl.*;
import EventListenerImpl.MouseWheelListenerImpl.*;

public class Game extends State {

  public Game(JFrame frame) {
    super(frame, new GameGUI(frame));
    this.initializeEventListeners();
    this.addEventListeners();
  }

  // Displays the current state and does logic, returns when state terminates. Returns state to be displayed after termiantion
  public int run() {
    return Constants.CLOSE;
  }

  private void initializeEventListeners() {
    keyListener = new GameKeyListener();
    mouseListener = new GameMouseListener();
    mouseWheelListener = new GameMouseWheelListener();
  }

}
