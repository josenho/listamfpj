package listamfpj;

import java.util.*;

public class ConverterBase {
	public String converterBase(int valorDecimal, int valorBase) {
		
		List<String> resultadoBinario = new ArrayList<String>();
		int cociente = 0;
		int resto;
		int dividendo = valorDecimal;
		int divisor = valorBase;
		switch(divisor) {
		case 2:
			while(dividendo > 1) {
				if(dividendo % divisor == 1) {
					resultadoBinario.add(0, "1");
					dividendo = dividendo/divisor;
					if(dividendo <= 1) {
						resultadoBinario.add(0, Integer.toString(dividendo));
					}
				} else if(dividendo % divisor == 0) {
					resultadoBinario.add(0, "0");
					dividendo = dividendo/divisor;
					if(dividendo <= 1) {
						resultadoBinario.add(0, Integer.toString(dividendo));
					}
				}
			}
			break;
		}
		String resultadoBinarioTratado = String.join("",resultadoBinario);
		
		return resultadoBinarioTratado;
	}
}
