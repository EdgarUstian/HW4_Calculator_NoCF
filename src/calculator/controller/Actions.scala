package calculator.controller

import calculator.model.CalcState.NumberState
import calculator.model.Calculator
import calculator.model.Decimal.WholeNumber
import calculator.model.Operation._
import calculator.model.Operation.FourFunction._
import javafx.event.{ActionEvent, EventHandler}

/**
  * EventHandlers f0r each of the button on the calculator. NumberAction takes
  * an Int representing the which number button was pressed. Implement each of
  * these handle methods to call the appropriate method in your Calculator API.
  * You may assume that each of these classes has a reference to the same
  * Calculator object
  *
  * F0r testing use only these classes to ensure your tests will run with the
  * submissions on the server
  */

class EqualAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.calcState.changeStateToEqual() // Changes State to EqualState
  }
}

class ClearAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = { //Resets All States and Variables
    calculator.calcState = new NumberState(calculator)
    calculator.decimal = new WholeNumber(calculator)
    calculator.operation = new Initial(calculator)
    calculator.numberWorkedOn = "0"
    calculator.numberFinal = 0.0
    calculator.LHS = 0.0
    calculator.RHS = 0.0
    calculator.EEV = 0.0
    calculator.lastOperation = new Initial(calculator)
    calculator.AnsValue = 0.0
    calculator.showNumber = 0.0
  }
}

class DecimalAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.calcState.changeStateToNumber() //Changes State to NumberState
    calculator.decimal.makeDecimal() //Makes Decimal when Possible
  }
}

class NumberAction(calculator: Calculator, number: Int) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.calcState.changeStateToNumber() //Chenges State to NumberState
    calculator.makeNumber(number.toString) //Makes Number with the number pressed as parameter
  }
}

class AdditionAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.calcState.changeStateToOperation(new Addition(calculator))
    //Changes state to OperationState with desired Operation in the parameter
  }
}

class SubtractionAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.calcState.changeStateToOperation(new Subtraction(calculator))
    //Changes state to OperationState with desired Operation in the parameter
  }
}

class MultiplicationAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.calcState.changeStateToOperation(new Multiplication(calculator))
    //Changes state to OperationState with desired Operation in the parameter
  }
}

class DivisionAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.calcState.changeStateToOperation(new Division(calculator))
    //Changes state to OperationState with desired Operation in the parameter
  }
}
