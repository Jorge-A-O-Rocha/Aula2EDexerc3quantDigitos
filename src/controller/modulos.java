package controller;

public class modulos {
	public modulos() {
		super();
	}

	public int digitos(int n){
		// A condição de parada é quando o N for menor 10 e maior que -10
        if(n < 10 && n > -10){
        	return 1 ;
        }else{
        	// soma-se de um em um enquanto n é dividido por 10 sucessivamente até atingir a condição de parada
            return 1 + digitos(n/10);
        }
    }

}
