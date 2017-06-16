package ru.dolgov.testapp.operation;

public class MulAndAddOperationImpl implements Operation{

	@Override
	public int calculate(int[] inputNumbers) throws ArithmeticException {
		if (inputNumbers.length != 3) {
            throw new ArithmeticException("Неверные входные параметры");
        }
        return inputNumbers[0] * inputNumbers[1] + inputNumbers[2];
	}

}
