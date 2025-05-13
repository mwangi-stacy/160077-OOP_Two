package farmer_connector;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
    public class LoginPage extends JFrame {
        public LoginPage() {
            // Frame settings
            setTitle("Welcome to FarMaCo ");
            setSize(800, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(true);
            setLayout(new BorderLayout());



            //Main Panel for the Login Form
            JPanel mainPanel = createMainPanel();

            //Adding the panels to the frame
            add(mainPanel, BorderLayout.CENTER);

            //Application Window
            setVisible(true);
        }

        private JPanel createMainPanel() {
            JPanel leftPanel = new JPanel();
            leftPanel.setLayout(new Color(100, 100, 100));


        }
    }
    }