package model.exceptions;

import java.util.HashMap;
import java.util.Map;

//pacote de validações de exceções (tratamento para os possíveis erros no preenchimento do formulário)
public class ValidatioException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<>();
	
	public ValidatioException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	public void addErrors(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}

}
