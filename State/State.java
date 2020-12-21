package State;
import GUI.*;
import Constants.*;
import javax.swing.JFrame;
import java.awt.event.*;
import EventListenerImpl.KeyListenerImpl.*;
import EventListenerImpl.MouseListenerImpl.*;
import EventListenerImpl.MouseWheelListenerImpl.*;


class State {

  JFrame frame;

  GUI gui;

  KeyListener keyListener;
  MouseListener mouseListener;
  MouseWheelListener mouseWheelListener;

  State(JFrame frame, GUI gui) {
    this.frame = frame;
    this.gui = gui;
  }

  public void draw() {
    this.gui.draw();
  }

  // Removes all frame listeners of the state
  public void destroy() {
    if (this.keyListener != null)
      this.frame.removeKeyListener(this.keyListener);

    if (this.mouseListener != null)
      this.frame.removeMouseListener(this.mouseListener);

    if (this.mouseWheelListener != null)
      this.frame.removeMouseWheelListener(this.mouseWheelListener);
  }

  // Add event listeners to frame
  void addEventListeners() {
    frame.addKeyListener(keyListener);
    frame.addMouseListener(mouseListener);
    frame.addMouseWheelListener(mouseWheelListener);
  }

}
