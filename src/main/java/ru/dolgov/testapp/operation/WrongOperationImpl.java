package ru.dolgov.testapp.operation;

public class WrongOperationImpl implements Operation{

	@Override
	public int calculate(int[] inputNumbers) throws ArithmeticException {
		throw new ArithmeticException("Неверные входные параметры");
	}
}
