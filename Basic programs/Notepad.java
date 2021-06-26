import java.awt.*;
import javax.swing.*;
class Notepad extends JFrame
{
	JFrame f;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
	public  void  mynotepad()
 	{
 	  f=new JFrame();
	  f.setLayout(null);
	  mb=new JMenuBar();
	  m1=new JMenu("file");
	  m2=new JMenu("Edit");
	  m3=new JMenu("format");
	  m4=new JMenu("view");
	  m5=new JMenu("help");
	  i1=new JMenuItem("New Ctrl+N");
	  m1.add(i1);
	  i2=new JMenuItem("Open ctrl+O");
	  m1.add(i2);
	  i3=new JMenuItem("Save ctrl+S");
	  m1.add(i3);
	  i4=new JMenuItem("Save as..");
	  m1.add(i4);
	  i5=new JMenuItem("PageSetup...");
                    m1.add(i5);
	  i6=new JMenuItem("Print..");
 	  m1.add(i6);
	  i7=new JMenuItem("Exit");
	  m1.add(i7);
	  mb.add(m1);
	  mb.add(m2);
	  mb.add(m3);
	  mb.add(m4);
	  mb.add(m5);
	 f.setJMenuBar(mb);
	 f.setVisible(true);
         f.setSize(500,400);
}
    public static void main(String S[]) 
  {
     mynotepad();
   }
}       