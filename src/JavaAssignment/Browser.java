package JavaAssignment;
import java.util.ArrayList;

public class Browser {
	
	public String browserName;
	public String vendorName;
	public double currentVersion;
	ArrayList<String> plugins;
	
	public Browser(String browserName) {
	
		this.browserName = browserName;
	}

	public Browser(String browserName, String vendorName) {
	
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	public Browser(String browserName, String vendorName, double currentVersion) {
		
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public Browser(String browserName, String vendorName, double currentVersion, ArrayList<String> plugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}

    public String getname() {
	    return browserName;
}
    public String getVendor() {
    	return vendorName;
    }
    public double getVersion() {
    	return currentVersion;
    }
    public ArrayList<String> plugins(){
    	return plugins;
    }
    
	public static void main(String[] args) {
		
    ArrayList<String> plugins = new ArrayList<String>();
    plugins.add("chropath");
    plugins.add("DocuSign");
    plugins.add("Lucidchart");
    
        
		Browser br = new Browser("Chrome ", "Amazon ", 5.1);		
		System.out.println(br.browserName + br.vendorName + br.currentVersion + plugins );
		
		
		System.out.println(br.getname());
		System.out.println(br.getVendor());
		System.out.println(br.getVersion());
		System.out.println(plugins);	
	}

}
