import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class myFrame  extends JFrame implements ActionListener{
    JLabel label3,label4,label5,label6,label7,label8;
    JButton buttonPrevious,buttonNext;
    JTextField name,nid;
    JComboBox firstPage;
    myFrame(){
        this.setLayout(null);
        ImageIcon imageInside = new ImageIcon("D:\\D drive files\\java\\report.png");
        this.setIconImage(imageInside.getImage());

        label3 = new JLabel("NAME");
        label3.setBounds(15,30,60,27);
        label3.setFont(new Font("Monospaced",Font.BOLD,20));
        label3.setForeground(Color.ORANGE);
        label3.setBackground(Color.BLACK);
        label3.setOpaque(true);
        label3.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label3);

        name = new JTextField();
        name.setBounds(110,30,350,27);
        name.setFont(new Font("Arial",Font.BOLD,25));
        name.setForeground(Color.orange);
        this.add(name);

        nid = new JTextField();
        nid.setBounds(110,80,350,27);
        nid.setFont(new Font("Arial",Font.BOLD,25));
        nid.setForeground(Color.orange);
        this.add(nid);

        label4 = new JLabel("N.I.D");
        label4.setBounds(15,80,80,27);
        label4.setFont(new Font("Monospaced",Font.BOLD,20));
        label4.setForeground(Color.ORANGE);
        label4.setBackground(Color.BLACK);
        label4.setOpaque(true);
        label4.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label4);

        String[] areas={"","Mirpur-1","Mirpur-2","Mirpur-6","Mirpur-10","Mirpur-11","Mirpur-12","Mirpur-13","Mirpur-14"};
        firstPage = new JComboBox(areas);
        firstPage.setBounds(300,130, 80, 27);
        firstPage.setForeground(Color.black);
        firstPage.addActionListener(this);
        this.add(firstPage);
        
        /*text3 = new JTextField();
        text3.setBounds(15,170,445,27);
        text3.setFont(new Font("Arial",Font.BOLD,25));
        text3.setForeground(Color.orange);
        this.add(text3);*/

        buttonPrevious= new JButton("Prev. Page");
        buttonPrevious.setBounds(150,240,100,50);
        buttonPrevious.setForeground(Color.red);
        buttonPrevious.setBackground(Color.white);
        buttonPrevious.setFocusable(false);
        buttonPrevious.addActionListener(this);
        this.add(buttonPrevious);

        buttonNext= new JButton("Next Page");
        buttonNext.setBounds(300,240,100,50);
        buttonNext.setForeground(Color.white);
        buttonNext.setBackground(Color.red);
        buttonNext.setFocusable(false);
        buttonNext.addActionListener(this);
        this.add(buttonNext);

        label5 = new JLabel("Place of Occurance");
        label5.setBounds(15,130,230,27);
        label5.setFont(new Font("Monospaced",Font.BOLD,20));
        label5.setForeground(Color.ORANGE);
        label5.setBackground(Color.BLACK);
        label5.setOpaque(true);//makes Backgrond color visible
        label5.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label5);

        this.setTitle("Crime Report MetroPolitan Police");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);//stops from resizing frame
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*ImageIcon image = new ImageIcon("D:\\D drive files\\java\\haat.png");
        this.setIconImage(image.getImage());
        this.add(label1);*/
        //this.pack();//adjust to image added
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String area = (String) firstPage.getSelectedItem();
        if(e.getSource()==buttonPrevious){
            dispose();
        }
        else if(e.getSource()==buttonNext){
            if(name.getText().trim().isEmpty() || nid.getText().trim().isEmpty() || area.isEmpty()){
                JOptionPane.showMessageDialog(
                    this,
                    "Fill All The Text Boxes First...");
            }else if(!nid.getText().trim().matches("\\d{10}")){
                JOptionPane.showMessageDialog(this,"Postal and Phone Number can hold only digits","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String n=nid.getText().trim(),n1=name.getText().trim();
                nextPage next= new nextPage(n,n1,area);
                //next.nextPage();
                dispose();
            }
        }
    }
}
