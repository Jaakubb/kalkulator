package pl.jakub.porownywarka;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public int a=0;
    public boolean b;
    @FXML private Label welcomeText;
    @FXML private TextField poletekstowe;

    @FXML
    public void getPoletekstowe() {
        a+=Integer.parseInt(poletekstowe.getText());
        poletekstowe.setText("");
    }

    @FXML
    protected void onHelloButtonClick() {
        String str = poletekstowe.getText();
        try {
            int liczba = Integer.parseInt(str);

            welcomeText.setText(Integer.toString(liczba*2));

        }
        catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
    @FXML
    protected void button() {
        poletekstowe.setText("");
    }

    @FXML
    protected void num1() {
        if(b){
            a=0;
            poletekstowe.clear();
            poletekstowe.setText(poletekstowe.getText()+Integer.toString(1));
            b=false;
        }
        else{
            poletekstowe.setText(poletekstowe.getText()+Integer.toString(1));
        }


    }
    @FXML
    protected void num2() {
        poletekstowe.setText(poletekstowe.getText()+Integer.toString(2));
    }
    @FXML
    protected void num3(){
        poletekstowe.setText(poletekstowe.getText()+Integer.toString(3));
    }
    @FXML
    protected void num4() {
        poletekstowe.setText(poletekstowe.getText()+Integer.toString(4));
    }
    @FXML
    protected void num5() {
        poletekstowe.setText(poletekstowe.getText()+Integer.toString(5));
    }
    @FXML
    protected void num6() {
        poletekstowe.setText(poletekstowe.getText()+Integer.toString(6));
    }
    @FXML
    protected void num7() {
        poletekstowe.setText(poletekstowe.getText()+Integer.toString(7));
    }
    @FXML
    protected void num8() {
        poletekstowe.setText(poletekstowe.getText()+Integer.toString(8));
    }
    @FXML
    protected void num9() {
        poletekstowe.setText(poletekstowe.getText()+Integer.toString(9));
    }
    @FXML
    protected void rownosc(){
        b=true;
        poletekstowe.setText(Integer.toString(a+=Integer.parseInt(poletekstowe.getText())));


    }

}