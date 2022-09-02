
package exemplejaxb;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {
    
    private Map<String, Data> mapp = new HashMap<String, Data>();

    public Map<String, Data> getMapp() {
        return mapp;
    }

    public void setMapp(Map<String, Data> mapp) {
        this.mapp = mapp;
    }
    
    
}
