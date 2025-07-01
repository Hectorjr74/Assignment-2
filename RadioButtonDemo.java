import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo extends JFrame {
    private JRadioButton bird, cat, dog, rabbit, pig;
    private ButtonGroup group;

    public RadioButtonDemo() {
        // Set up frame
        setTitle("RadioButtonDemo");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create button group
        group = new ButtonGroup();
        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");
        pig.setSelected(true); // Default

        // Add to group
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        // Add to frame
        add(bird);
        add(cat);
        add(dog);
        add(rabbit);
        add(pig);

        // Show selection button
        JButton show = new JButton("Show");
        show.addActionListener(e -> {
            String pet = pig.isSelected() ? "Pig" : 
                         rabbit.isSelected() ? "Rabbit" : 
                         dog.isSelected() ? "Dog" : 
                         cat.isSelected() ? "Cat" : "Bird";
            JOptionPane.showMessageDialog(this, "You selected: " + pet);
        });
        add(show);

        // Display frame
        setSize(200, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}