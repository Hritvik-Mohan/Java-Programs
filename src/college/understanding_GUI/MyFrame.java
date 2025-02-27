/*
    Sample code to show on how to create
    window using java.awt.*  
*/
package src.college.understanding_GUI;
import java.awt.*;
import java.awt.event.*;
class MyFrame {
    public static void main(String[] args) {

        // CREATING FRAME WINDOW DIRECTLY USING THE FRAME CLASS
        Frame f2 = new Frame("");
        f2.setBackground(Color.green);
        f2.setSize(300,300); 
        f2.setVisible(true);

    }
}
// CREATING OWN FRAME CLASS BY INHERITING THE FRAME CLASS
class MyFrame_2 extends Frame {
    MyFrame_2(String str){
        super(str);
    }
    public static void main(String[] args) {
        // CREATING FRAME WINDOW USING MY OWN FRAME CLASS
        MyFrame_2 f1 = new MyFrame_2("Window using Frame_2");
        f1.setBackground(Color.yellow);
        f1.setSize(300,300);
        f1.setVisible(true);
    }
}

class Practice extends Frame implements ActionListener{
    Practice(String str){
        super(str);
    }

    Label l1, l2;
    TextField tf1, tf2;
    Button b1;

    void createWindow(){

        l1 = new Label("Enter num 1");
        tf1= new TextField(12);
        l2 = new Label("Enter num 2");
        tf2 = new TextField(12);

        b1 = new Button("Add");
        b1.addActionListener(this);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(250, 300);
    }

    public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());

        tf1.setText("Result ⬇️");
        tf2.setText(num1+num2+"");
    }

    public static void main(String[] args) {
        Practice p = new Practice("My Window");
        p.createWindow();
    }


}
