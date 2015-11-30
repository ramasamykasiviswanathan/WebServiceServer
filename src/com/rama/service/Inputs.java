package com.rama.service;

import java.io.Serializable;

public class Inputs implements Serializable{

	/**
	 * This is the latest serial ID version, updated on 30-Nov-2015
	 */
	private static final long serialVersionUID = 3912269673955808534L;
	
	private String operand_1,operand_2,operator;

	/**
	 * @return the operand_1
	 */
	public String getOperand_1() {
		return operand_1;
	}

	/**
	 * @param operand_1 the operand_1 to set
	 */
	public void setOperand_1(String operand_1) {
		this.operand_1 = operand_1;
	}

	/**
	 * @return the operand_2
	 */
	public String getOperand_2() {
		return operand_2;
	}

	/**
	 * @param operand_2 the operand_2 to set
	 */
	public void setOperand_2(String operand_2) {
		this.operand_2 = operand_2;
	}

	/**
	 * @return the operator
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
}
