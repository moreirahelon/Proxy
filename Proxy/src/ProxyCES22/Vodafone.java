package ProxyCES22;

import ProxyCES22.ISP;

public class Vodafone implements ISP{

	@Override
	public String getResource(String site) {
	switch (site) {
	case "www.google.com":
		return "P�gina do Google";
	case "www.youtube.com":
		return "P�gina do youtube";
	default:
		return "P�gina n�o encontrada";
	}

	}

}
