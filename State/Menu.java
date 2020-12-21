package State;
import GUI.*;
import Constants.*;
import javax.swing.JFrame;
import EventListenerImpl.KeyListenerImpl.*;
import EventListenerImpl.MouseListenerImpl.*;
import EventListenerImpl.MouseWheelListenerImpl.*;

public class Menu extends State {

  public Menu(JFrame frame) {
    super(frame, new MenuGUI(frame));
    this.initializeEventListeners();
    this.addEventListeners();
  }

  // Displays the current state and does logic, returns when state terminates. Returns state to be displayed after termiantion
  public int run() {
    return Constants.CLOSE;
  }

  private void initializeEventListeners() {
    keyListener = new MenuKeyListener();
    mouseListener = new MenuMouseListener();
    mouseWheelListener = new MenuMouseWheelListener();
  }

}
