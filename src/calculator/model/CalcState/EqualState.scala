package calculator.model.CalcState

import calculator.model.Calculator
import calculator.model.Operation._

class EqualState(calculator: Calculator) extends CalcState(calculator) {
  this.symbol = "=="
  //Changing from EqualState to NumberState
  override def changeStateToNumber(): Unit = {
    calculator.LHS = 0
    calculator.numberFinal = 0
    calculator.operation = new Initial(calculator)
    calculator.lastOperation = new Initial(calculator)
    calculator.numberWorkedOn = ""
    calculator.calcState = new NumberState(calculator)
  }
  //Changing from EqualState to OperationState
  override def changeStateToOperation(operation: Operation): Unit = {
    calculator.numberWorkedOn = ""
    calculator.numberFinal = 0.0
    calculator.RHS = 0.0
    calculator.LHS = calculator.AnsValue
    calculator.showNumber = calculator.AnsValue
    calculator.calcState = new OperationState(calculator)
    calculator.operation = operation
  }
  //Changing from EqualState to EqualState
  override def changeStateToEqual(): Unit = {
    calculator.LHS = calculator.AnsValue
    calculator.lastOperation.compute()
    calculator.showNumber = calculator.AnsValue
  }
}
