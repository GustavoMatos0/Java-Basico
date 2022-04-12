
package horadosistemaa;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.*;
public class HoraDoSistemaa {

    public static void main(String[] args) {
      Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension d = tk.getScreenSize();
       System.out.println("Resoluçao de tela ");
       System.out.println(d.width);
       System.out.println(d.height);  
    
      Locale loc = Locale.getDefault();
       System.out.println("Seu sistema esta em " + loc.getDisplayLanguage());
       System.out.println(loc.getLanguage());
             
    }
    
}
