import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*<applet code=colour.class height=200 width=200>
	</applet>*/

public class colour extends JApplet implements ActionListener
{
	JPanel p,p1;
	JButton b,b1,b2,b3;
	Checkbox c,c1;
	TextArea area;
	Color d=new Color(255,0,0);
	Color d1=new Color(0,255,0);
	Color d2=new Color(0,0,255);
	Color d3=new Color(255,177,76);
	GridLayout g;
	public void init()
	{
		p=new JPanel();
		p1=new JPanel();
		g=new GridLayout(2,2);
		p1.setLayout(g);
		b=new JButton();
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b.setBackground(d);
		b1.setBackground(d1);
		b2.setBackground(d2);
		b3.setBackground(d3);
		area=new TextArea(" Welcome To Colour Palate ",25,25);
		CheckboxGroup cbg=new CheckboxGroup();
		c=new Checkbox(" ForeGround ",cbg,true);
		c1=new Checkbox(" BackGround ",cbg,false);
		p.add(c);
		p.add(c1);
		p.add(area);
		p1.add(b);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p.add(p1);
		getContentPane().add(p);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==b)
		{
			if(c.getState()==true)
				area.setForeground(d);
			else
				area.setBackground(d);
		}
		if(obj==b1)
		{
			if(c.getState()==true)
				area.setForeground(d1);
			else
				area.setBackground(d1);
		}
		if(obj==b2)
		{
			if(c.getState()==true)
				area.setForeground(d2);
			else
				area.setBackground(d2);
		}
		if(obj==b3)
		{
			if(c.getState()==true)
				area.setForeground(d3);
			else
				area.setBackground(d3);
		}
	}
}