
package todo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener
{
    Label l,l2,l3,l4,l5,l6;
    TextField tf,tf2,tf3,tf4,tf5,tf7; 
    Checkbox c1,c2,c3,c4,c5;
    Button b;
     Menu file,sub;
    MenuItem New,open,save,close,closeall;
    MyFrame()
    {
      super(" TO DO LIST");
      file = new Menu("File");
      New=new MenuItem("New");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("Close All");
        file = new Menu("File");
        sub = new Menu("Close");
      file.add(New);
          file.add(open);
      file.add(save);
        file.add(sub);
         MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf7 = new TextField(20);
      l=new Label("1st task");
      tf=new TextField(15);
      c1=new Checkbox("");
      l2=new Label("2nd task");
      tf2=new TextField(15);
       c2=new Checkbox("");
       l3=new Label("3rd task");
      tf3=new TextField(15);
        c3=new Checkbox("");
         l4=new Label("4th task");
      tf4=new TextField(15);
       c4=new Checkbox("");
       l5=new Label("5th task");
      tf5=new TextField(15);
        c5=new Checkbox("");
        b=new Button("All Done");
        l6=new Label("                                              ");
        b.addActionListener(this);
         New.addActionListener(this);
         save.addActionListener(this);
        setLayout(new FlowLayout());
    add(tf7);
        add(l);
        add(tf);
        add(c1);
        add(l2);
        add(tf2);
        add(c2);
        add(l3);
        add(tf3);
        add(c3);
        add(l4);
        add(tf4);
        add(c4);
        add(l5);
        add(tf5);
        add(c5);
        add(b);
        add(l6);
       
    }

    @Override
   
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b) { 
        boolean allTasksDone = c1.getState() && c2.getState() && c3.getState() && c4.getState() && c5.getState();
        if (allTasksDone) {
            l6.setText("All tasks completed!");
        } else {
            l6.setText("Some tasks are not completed.");
        }
    } else if (e.getSource() == New) {
        tf7.setText(""); 
        tf.setText("");
         tf2.setText(""); 
        tf3.setText("");
         tf4.setText(""); 
        tf5.setText("");
    } 
    }
}

    

public class Todo {

    public static void main(String[] args) {
         MyFrame f = new MyFrame();
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
