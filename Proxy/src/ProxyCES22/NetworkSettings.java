package ProxyCES22;

import ProxyCES22.ISP;
import ProxyCES22.InternetProxy;
import ProxyCES22.Vodafone;

public class NetworkSettings {
	public ISP getInternet(){
		return new InternetProxy();
	}
	
	public ISP getISP(){
		return new Vodafone();
	}
}

