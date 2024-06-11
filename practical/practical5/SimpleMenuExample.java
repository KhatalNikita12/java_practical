import java.awt.*;
import java.awt.event.*;
public class SimpleMenuExample extends Frame
{
 Menu file ,SaveAs;
 public SimpleMenuExample()
 {
 MenuBar mb = new MenuBar(); // begin with creating menu bar
 setMenuBar(mb); // add menu bar to frame
 file = new Menu("file"); // create menus 
SaveAs=new Menu("Save As");
 mb.add(file); // add menus to menu bar
mb.add(SaveAs);
//  file.addActionListener(this); // link with ActionListener for event handling
//  SaveAs.addActionListener(this);
 file.add(new MenuItem("New"));
 file.add(new MenuItem("Open"));
 file.add(new MenuItem("Save"));
 // file.add(new MenuItem("Save As"));
  SaveAs.add(new  MenuItem(".ppt"));
  SaveAs.add(new  MenuItem(".doc"));
  SaveAs.add(new  MenuItem(".pdf"));
  file.add(SaveAs);
 setTitle("Simple Menu Program"); // frame creation methods
 setSize(300, 300);
 addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
 });
 setVisible(true);
 }
//  public void actionPerformed(ActionEvent e)
//  {
//  String str = e.getActionCommand(); // know the menu item selected by the user
//  System.out.println("You selected " + str);
//  }
 public static void main(String args[])
 {
 new SimpleMenuExample();
 }
}