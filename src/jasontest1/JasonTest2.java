/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasontest1;

import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

/**
 *
 * @author Massa
 */
public class JasonTest2 {
    public static void main(String[] args) {
        try {
            JSONObject obj = new JSONObject();
            
            obj.put("name","foo");
            obj.put("num",new Integer(100));
            obj.put("balance",new Double(1000.21));
            obj.put("is_vip",new Boolean(true));
            
            StringWriter out = new StringWriter();
            obj.writeJSONString(out);
            
            String jsonText = out.toString();
            System.out.print(jsonText);
        } catch (IOException ex) {
            Logger.getLogger(JasonTest2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
