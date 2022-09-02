
package exemplejaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


public class ExempleJAXB {

    
    public static void main(String[] args) {
        try {
            
            JAXBContext jc = JAXBContext.newInstance(Client.class);
        
                Data donner = new Data();
                donner.setNom("1 jemima");

                Data donner2 = new Data();
                donner2.setNom("2 gabriel");;

                Client client = new Client();
                client.getMapp().put("voiture", donner);
                client.getMapp().put("avion", donner2);

                Marshaller marshaller = jc.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(client, System.out);
        }
        catch (Exception e) {
        }
        
    }
    
}
