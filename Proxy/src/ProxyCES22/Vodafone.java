package ProxyCES22;

import ProxyCES22.ISP;

public class Vodafone implements ISP{

	@Override
	public String getResource(String site) {
	switch (site) {
	case "www.google.com":
		return "Página do Google";
	case "www.youtube.com":
		return "Página do youtube";
	default:
		return "Página não encontrada";
	}

	}

}
