package ru.dolgov.testapp.operation;

public class MulOperationImpl implements Operation{

	@Override
	public int calculate(int[] inputNumbers) throws ArithmeticException {
		if (inputNumbers.length < 2) {
            throw new ArithmeticException("Неверные входные параметры");
        }
        int result = 1;
        for (int i = 0; i < inputNumbers.length; i++) {
            result *= inputNumbers[i];
        }
        return result;
	}

}
