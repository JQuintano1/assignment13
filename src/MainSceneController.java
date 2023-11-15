import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainSceneController {

    @FXML
    private Button button;

    @FXML
    public TextArea conversionresult;

    @FXML
    private TextField unit1;

    @FXML
    private TextField unit1amount;

    @FXML
    private TextField unit2;


    @FXML
    void convert(ActionEvent event) {
        String unit1conversionunit = unit1.getText();
        String unit2conversionunit = unit2.getText();
        String unit1value = unit1amount.getText();
        

        int unit1val = Integer.parseInt(unit1value);
        double result;
        

        if ("lb".equals(unit1conversionunit) & "kg".equals(unit2conversionunit)){
             result = unit1val/2.2;
             String resultstr = Double.toString(result);
             conversionresult.setText(resultstr);

             
        }

        else if ("kg".equals(unit2conversionunit) & "lb".equals(unit1conversionunit)) {
            result = unit1val*2.2;
             String resultstr = Double.toString(result);
             conversionresult.setText(resultstr);

            
        }

        else if ("m".equals(unit1conversionunit) &  "in".equals(unit2conversionunit)){
            result = unit1val/39.3701;
             String resultstr = Double.toString(result);
             conversionresult.setText(resultstr);
        }

        else if ("in".equals(unit2conversionunit) &  "m".equals(unit1conversionunit)){
            result = unit1val*39.3701;
             String resultstr = Double.toString(result);
             conversionresult.setText(resultstr);
        }
    }
}




