package calculator.model.CalcState

import calculator.model.Calculator
import calculator.model.Operation.Operation

class NumberState(calculator: Calculator) extends CalcState(calculator) {
  this.symbol = "N"
  //Changing from NumberState to NumberState
  override def changeStateToNumber(): Unit = {
    calculator.calcState = this
  }
  //Changing from NumberState to OperationState
  override def changeStateToOperation(operation: Operation): Unit = {
    calculator.EEV = calculator.RHS
    calculator.lastOperation.compute()
    calculator.LHS = calculator.AnsValue
    calculator.showNumber = calculator.LHS
    calculator.RHS = 0.0
    calculator.calcState = new OperationState(calculator)
    calculator.operation = operation
    calculator.numberWorkedOn = ""
  }

  //Changing from NumberState to EqualState
  override def changeStateToEqual(): Unit = {
    calculator.EEV = calculator.RHS
    calculator.lastOperation = calculator.operation
    calculator.operation.compute()
    calculator.showNumber = calculator.AnsValue
    calculator.calcState = new EqualState(calculator)
  }
}
