package ru.dolgov.testapp.calc;

import ru.dolgov.testapp.operation.AddOperationImpl;
import ru.dolgov.testapp.operation.MulAndAddOperationImpl;
import ru.dolgov.testapp.operation.MulOperationImpl;
import ru.dolgov.testapp.operation.Operation;
import ru.dolgov.testapp.operation.WrongOperationImpl;

public class OperationsFactory {

	public static Operation getOperation(String command) {
		if (command.equals("add")) {
            return new AddOperationImpl();
        } else if (command.equals("mul")) {
            return new MulOperationImpl();
        } else if (command.equals("mulAndAdd")) {
            return new MulAndAddOperationImpl();
        } else {
            return new WrongOperationImpl();
        }
	}
}
