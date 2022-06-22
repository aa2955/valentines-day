import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame
{
    MyPanel panel;
    MyButtons button, button2;

    public MyFrame()
    {
        panel = new MyPanel();
        button = new MyButtons();
        button2 = new MyButtons();

        button.setText("Yes!");
        button.setBounds(100,100,95,30);
        button2.setText("No!");
        button2.setBounds(200,100,95,30);

        this.add(button);
        this.add(button2);

        final JTextField tf = new JTextField();
        tf.setBounds(100, 200, 200, 30);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Insert Link to wholesome website!");
            }
        });

        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("try again!");
            }
        });
        this.add(tf);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null); //makes the frame in the middle instead of top left corner
        this.setVisible(true);
        this.setLayout(null);

    }


}
