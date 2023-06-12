package com.pack.codeRevert;

public class CodeRevert {

	public void correctCode() {

		System.out.println("Correct code");
	}

	public void secondUpdateCode() {

		System.out.println("secondUpdateCode");
	}

	public void thirdUpdateWrongCode() {

		System.out.println("thirdUpdateWrongCode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CodeRevert obj = new CodeRevert();
		obj.correctCode();
		obj.secondUpdateCode();
		obj.thirdUpdateWrongCode();

	}

}
