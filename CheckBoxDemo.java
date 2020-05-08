/*<applet code="CheckBoxDemo.class" width=500 height=500>
</applet>
*/ 
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxDemo extends Applet implements ItemListener
{
    Font f1;
  Checkbox c1,c2;
  String message="",message1="";
  public void init()
  {f1 = new Font("Arial",Font.BOLD,18);
      c1=new Checkbox("C");//Checkbox creation
      c2=new Checkbox("Java");//Checkbox creation
      add(c1);//Add Components to the appletwindow
      add(c2);
      c1.addItemListener(this);//Register with the ItemListener
      c2.addItemListener(this);//Register with the ItemListener
  }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.getState())//getState() returns true if c1 check box is selected 
        {
            message=c1.getLabel();//Label of c1 check box stored in message1
        }
      if(c2.getState())
          message1="java";
       
   repaint();//invoke paint()
}
    public void paint(Graphics g)
    {g.setFont(f1);
        g.drawString(message, 100, 100);
        g.drawString(message1, 200, 100);
    }
}

