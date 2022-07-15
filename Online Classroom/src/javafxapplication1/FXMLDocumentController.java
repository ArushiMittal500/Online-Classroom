package javafxapplication1;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button maths;

    @FXML
    private Button english;

    @FXML
    private Button science;

    @FXML
    private Button hindi;

    @FXML
    private Button ssc;

    @FXML
    private Button computer;
   
    @FXML
    private Button back;

    @FXML
    private Button dashboard;

    @FXML
    private Button evaluation;

    @FXML
    private Button content;
    
    @FXML
    private Button enter;
    
    @FXML
    private Hyperlink logout;
    
    @FXML
    private Button rem;
    
    @FXML
    private PasswordField passtext;
    
    @FXML
    private TextField classAtt;

    @FXML
    private Label lab;

    @FXML
    private TextField totalAtt;

    @FXML
    void att(ActionEvent event){
        String a = classAtt.getText().toString();
        double inta = Double.parseDouble(a);

        String b = totalAtt.getText().toString();
        double intb = Double.parseDouble(b);

        double percentage = (inta / intb) * 100;
        String per = Double.toString(percentage);
        lab.setText("The percentage is " + per + "%");
    }
    //class joining links
    @FXML
    private Hyperlink h1;

    @FXML
    private Hyperlink h2;

    @FXML
    private Hyperlink h3;

    @FXML
    private Hyperlink h4;

    @FXML
    private Hyperlink h5;

    @FXML
    private Hyperlink h6;
    

    @FXML
    private TextField username;
    
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @FXML
    void h1c(ActionEvent event) throws URISyntaxException {
        try {
            Desktop.getDesktop().browse(new URL("https://meet.google.com/mps-edun-fzn").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void h2c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://meet.google.com/mps-edun-fzn").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void h3c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://meet.google.com/mps-edun-fzn").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void h4c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://meet.google.com/mps-edun-fzn").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void h5c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://meet.google.com/mps-edun-fzn").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void h6c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://meet.google.com/mps-edun-fzn").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        
      
        if(event.getSource()==maths){
            Stage stage = (Stage) maths.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("exam.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==english) {
            Stage stage = (Stage) english.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("exam.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==science) {
            Stage stage = (Stage) science.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("exam.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==hindi) {
            Stage stage = (Stage) hindi.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("exam.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==ssc){
            Stage stage = (Stage) ssc.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("exam.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==computer) {
            Stage stage = (Stage) computer.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("exam.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==dashboard){
            Stage stage = (Stage) dashboard.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==evaluation) {
            Stage stage = (Stage) evaluation.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("evaluation.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==content) {
            Stage stage = (Stage) content.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("course.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==rem) {
            Stage stage = (Stage) rem.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("javafxapplication1/main.fxml"));// path for reminder
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==back) {
            Stage stage = (Stage) back.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==logout) {
            Stage stage = (Stage) logout.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }
    @FXML
    private void loginAction(ActionEvent event) throws Exception {
        String uname=username.getText().toLowerCase();
        String pass=passtext.getText().toLowerCase();
        if(uname.equals("")&&pass.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the details");
        }
        else{
            try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
            
            pst=con.prepareStatement("select * from persons where username=? and password=?");
            
            pst.setString(1,uname);
            pst.setString(2,pass);
            
            rs=pst.executeQuery();
                if(rs.next()){
                    
                    Stage stage = (Stage) enter.getScene().getWindow();
                    Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong Details, Please try again");
                    username.setText("");
                    passtext.setText("");
                    username.requestFocus();
                }
            } catch (ClassNotFoundException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }catch (SQLException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}



