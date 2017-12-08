
import org.json.simple.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class JsonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("nama", "Dewi");
        obj.put("alamat", "Jakarta Barat");
        
        System.out.println(obj.toJSONString());
        System.out.println("Nama : "+obj.get("nama"));

        // TODO code application logic here
    }
    
}









