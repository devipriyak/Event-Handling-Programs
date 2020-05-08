/*<applet code="TextFieldMathDemo.class" width=500 height=500>
</applet>
*/ 
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextFieldMathDemo extends Applet implements ActionListener{
 TextField t1,t2,t3;
  
Button click;
 public void init()
 {
     Label l1=new Label("A");
     Label l2=new Label("B");
     
     t1=new TextField(10);
     
     t2=new TextField(20);
     t3=new TextField(10);
      click=new Button("click");
      add(l1);//add components
      add(t1);
      add(l2);
      add(t2);
      add(t3);
      add(click);
      click.addActionListener(this);//register
       }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.green);
        String  no1,no2;
        no1=t1.getText();
        no2=t2.getText();
        int a=Integer.parseInt(no1);
        int b=Integer.parseInt(no2);
        
        int result=a+b;
        String res=String.valueOf(result);
        t3.setText(res);
        
    }

    
}
