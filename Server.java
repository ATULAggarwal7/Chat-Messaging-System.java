import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Server extends JFrame implements ActionListener {                    //Action listner is to ada action (awr.event class). This must be overwrite in server class
    Server(){
        setLayout(null);

        JPanel p1=new JPanel();                                        //creating a panel
        p1.setBackground(new Color(7,94,84));                    //set bg color of panel
        p1.setBounds(0,0,450,70);                     // set the location and size of panel
        p1.setLayout(null);         // is shoub be null to run setBounds
        add(p1);                                                       // add function is used to set any component above frame



        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));           //get image from file directory(icons folder)
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);      /*crating image class(awt package) to get image and scale it   */                                                                                         
        ImageIcon i3 = new ImageIcon(i2);                              //image class cannot be directly entere in lable so we create a new imageIcon
        JLabel back = new JLabel(i3);                                   
        back.setBounds(5, 20, 25, 25);                // set location and size of image
        p1.add(back);                                                  //p1 come befor add to add image above panel



        back.addMouseListener(new MouseAdapter(){                      //action is taken on click of of back. using MouseListner func.  . MouseAdapter is class Object
            public void mouseClicked(MouseEvent ae){                   //what action taken 
                System.exit(0);                                  // result of action
            }

        });


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));                 //////adding profile pic
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50);
        p1.add(profile);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));             ///////adding video icon
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30);
        p1.add(video);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));            /////////adding phone icon
        Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(350, 20, 35, 30);
        p1.add(phone);


        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));             ////////////adding more dots
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(420, 20, 10, 25);
        p1.add(morevert);

        JLabel name = new JLabel("Person 1");                       //creating label for name
        name.setBounds(110,15,100,18);                  //setting location and size
        name.setForeground(Color.white);                                 // selecting color
        name.setFont(new Font("SAN SERIF",Font.BOLD, 18));     //styling font
        p1.add(name);                            


        JLabel status = new JLabel("Active Now");                     //this part is optional
        status.setBounds(110, 35, 100, 18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        p1.add(status);

        JPanel a1=new JPanel();                                          /////creating a new panel where messiges will be shown
        a1.setBounds(5,75,440,570);
        add(a1);

        JTextField text= new JTextField();                                 /// creating textfield
        text.setBounds(5,655,310,40);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 14));
        add(text);

        JButton send=new JButton("SEND");                            /////creating button
        send.setBounds(320,655,123,40);
        send.setBackground(new Color(7,94,84));
        send.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        send.setForeground(Color.WHITE);
        add(send);


        setSize(450,700);                                  //set size of frame
        setLocation(200,50);                                        // set frame location
        setUndecorated(true);
        getContentPane().setBackground(Color.yellow);                   //set bg color of frame




        setVisible(true);                                             // make frame visible(by default it is not visible)

        
    }
    public void actionPerformed(ActionEvent ae){                      //overwriting action

    }
    public static void main(String[] args){
        new Server();

    }

}   