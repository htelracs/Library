
package UserInterface.GUI.load;

import javax.swing.JOptionPane;

/**
 *
 * @author Suco
 */
public class Load {
    public static void main(String[] args) {
        Loading l= new Loading();
        l.setVisible(true);
        main m=new main();
        m.setVisible(false);        
        try {
            for(int x=0;x<=100; x++){
                Thread.sleep(110);
                l.Carga.setText(Integer.toString(x)+"%");
                l.barracarga.setValue(x);
                if(x==100){
                    l.setVisible(false);
                    m.setVisible(true);
                }
                if(x==50 || x==90){
                    l.Text.setText("Connecting to Database....");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
