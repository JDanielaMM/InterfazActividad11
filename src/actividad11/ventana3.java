/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;
import java.awt.*;
/**
 *
 * @author danii
 */
public class ventana3 extends Frame{
    //Atributos: 3 botones.
    private final Button bin1,bin2,bin3,bin4,bin5,bin6,bin7,bin8,bin9;
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana3 (){
        super("Ventana 3");
        setLayout(new GridLayout());
        
        bin1 = new Button("1");
        add (bin1);
        bin2 = new Button("2");
        add (bin2);
        bin3 = new Button("3");
        add (bin3);
        bin4 = new Button("4");
        add (bin4);
        bin5 = new Button("5");
        add (bin5);
        bin6 = new Button("6");
        add (bin6);
        bin7 = new Button("7");
        add (bin7);
        bin8 = new Button("8");
        add (bin8);
        bin9 = new Button("9");
        add (bin9);
        
        
        setSize(500,500);
        setVisible(true);
    
    }
}
