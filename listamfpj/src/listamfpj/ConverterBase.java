package listamfpj;

import java.util.*;

public class ConverterBase {
	public String converterBase(int valorDecimal, int valorBase) {
		
		List<String> resultadoBinario = new ArrayList<String>();
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
		case 3:
			while(dividendo > 2) {
				if(dividendo % divisor == 1) {
					resultadoBinario.add(0,"1");
					dividendo = dividendo/divisor;
					if(dividendo <= 2) {
						resultadoBinario.add(0, Integer.toString(dividendo));
					}
				} else if(dividendo % divisor == 2) {
					resultadoBinario.add(0,"2");
					dividendo = dividendo/divisor;
					if(dividendo <= 2) {
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
		case 4:
			while(dividendo > 3) {
				int resto = dividendo % divisor;
				resultadoBinario.add(0, Integer.toString(resto));
				dividendo = dividendo/divisor;
				if(dividendo < divisor) {
					resultadoBinario.add(0, Integer.toString(dividendo));
				}
			}
		}
		String resultadoBinarioTratado = String.join("",resultadoBinario);
		
		return resultadoBinarioTratado;
	}
}
