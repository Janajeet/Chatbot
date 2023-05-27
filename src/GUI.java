import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.lang.System.out;

class GUI extends JFrame{
    private JLabel heading=new JLabel("BARD API");
    private JTextArea messageArea=new JTextArea();
    private JTextField messageInput=new JTextField();
    JScrollPane js = new JScrollPane(messageArea);
    private Font font=new Font("Sans-Serif", Font.PLAIN, 20);

    public void aiAsks()
    {
        messageArea.append("Bard : What do you want to know or ask me about?\n");
    }

    public void createGUI()
    {
        //Making the GUI window
        this.setTitle("Chatbot Interface");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); this.setVisible(true);

        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);
        messageArea.setMargin(new Insets(10,10,10,7));
        messageArea.setBackground(Color.pink);
        heading.setFont(font);
        messageArea.setFont(font);
        messageInput.setFont(font);
        messageArea.setEditable(false);
        this.setLayout(new BorderLayout());
        this.add(heading, BorderLayout.NORTH);
        this.add(js,BorderLayout.CENTER);
        //this.add(messageArea,BorderLayout.CENTER);
        this.add(messageInput, BorderLayout.SOUTH);
        heading.setHorizontalAlignment (SwingConstants.CENTER);


        //ImageIcon img= new ImageIcon(new ImageIcon("icons8-chat-16.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
        //heading.setIcon(img);
        heading.setIcon(new ImageIcon("icons8-chat-30.png"));
        heading.setHorizontalTextPosition(SwingConstants.CENTER);
        heading.setVerticalTextPosition(SwingConstants.BOTTOM);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setBorder (BorderFactory.createEmptyBorder (20, 20, 20, 20));

        //this.setLayout(new BorderLayout());
    }
    public void handleEvents()
    {
        PostRequest ob = new PostRequest();
        messageInput.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                //When enter is pressed, the following event is performed. The request will be sent and the response should be displayed.
            if(e.getKeyCode()==10)
            {
                String usermsg = messageInput.getText();
                if(usermsg.equals(""))
                {
                    usermsg="Hi Google";
                }
                messageArea.append("Me : "+usermsg+"\n");

                try {
                    messageArea.append("Bard : "+ ob.post1(usermsg)+"\n");
                    messageArea.append("Bard : What else can I do for you?\n");
                } catch (Exception ex) {
                    messageArea.append("Something Went wrong, please try again later. Can I help you with something else?\n");
                }

                out.flush();
                messageInput.setText("");
                messageInput.requestFocus();
                js.getViewport().setViewPosition(new Point(0,messageArea.getDocument().getLength()));
            }
            }
        });
    }
}
