package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * 1. Create new member variables for the width and height of Polymorph.
 * 
 * 2. Encapsulate the member variables of the Polymorph class. 
 * 
 * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
 * class with the width and height variables.
 * 
 * 4. Create a new sub-class of the Polymorph class called RedPolymorph.
 * 
 * 5. Make RedPolymorph draw a red rectangle when its draw method is called.
 * 
 * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
 * it by drawing it like the BluePolymorph.
 * 
 * 7. Create a new sub-class of the Polymorph class called MovingMorph.
 * 
 * 8. Add code to its update method to make MovingMorph objects move around
 * the screen.
 * 
 * 9. Create a MovingMorph object in your PolymorphWindow class and test it
 * by calling its draw and update methods.
 * 
 * 10. Now, delete all references to Polymorphs subclasses inside your
 * PolymorphWindow class.
 * 
 * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class.
 * 
 * 12. Initialize the ArrayList and add a bunch of different types of
 * Polymorph subclass objects to the ArrayList.
 * 
 * 13. Use loops to call the draw and update method for all the Polymorphs in 
 * the list.
 * 
 * 14. Create even more Polymorph subclasses and add them to your ArrayList!
 * 
 *  a) Create a Polymorph that follows your mouse. Hint: MouseMotionListener
 *  interface.
 * 
 *  b) Create a Polymorph that displays an image. Hint: BufferedImage.
 * 
 *  c) Create a Polymorph that displays a JOptionPane Message Dialog when
 *  clicked. Hint: MouseListener interface.
 */

public class PolymorphWindow extends JPanel implements ActionListener {

    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    private JFrame window;
    private Timer timer;

    ArrayList<Polymorph> polymorphs;

    public static void main(String[] args) {
        new PolymorphWindow().buildWindow();
    }

    public void buildWindow() {
    	polymorphs = new ArrayList<Polymorph>();
        window = new JFrame("IT'S MORPHIN' TIME!");
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(500, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);

        polymorphs.add(new BluePolymorph(200, 500, 70, 83));
        polymorphs.add(new BluePolymorph(100, 5, 23, 53));
        polymorphs.add(new RedPolymorph(300, 450, 11, 63));
        polymorphs.add(new MovingMorph(526, 230, 23, 101, WIDTH));
        timer = new Timer(1000 / 30, this);
        timer.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        // draw background
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);

        // draw polymorph
      
        polymorphs.forEach(polymorph -> polymorph.draw(g));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        polymorphs.forEach(polymorph -> polymorph.update());
    }
}
