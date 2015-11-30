package com.rama.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="MathsService")
public class MathematicOperationServiceImpl implements MathematicOperationService {

	@WebMethod(exclude=false,operationName="ramMathsOperation",action="MathsOperations")
	public Integer operations(Inputs inputs) throws NullPointerException {
		if(inputs == null)
			throw new NullPointerException("Inputs is Null");
		return manipulation(inputs);
	}
	
	@WebMethod(exclude=true)
	public int manipulation(final Inputs inputs){
		int output = 0;
		switch (inputs.getOperator()) {
		case "+":
			output += stringToInt(inputs.getOperand_1()) + stringToInt(inputs.getOperand_2());
			break;
		default:
			throw new IllegalArgumentException("Operator is not supported");
		}
		return output;
	}
	
	private int stringToInt(final String value){
		return Integer.valueOf(value);
	}
}
