package calculator.model.CalcState

import calculator.model.Calculator
import calculator.model.Operation.Operation

class OperationState(calculator: Calculator) extends CalcState(calculator) {
  this.symbol = "(+, -, *, /)"
  //Changing from OperationState to NumberState
  override def changeStateToNumber(): Unit = {
    calculator.lastOperation = calculator.operation
    calculator.makeNumber("0")
    calculator.calcState = new NumberState(calculator)
    calculator.resetDecimal()
  }
  //Changing from one OperationState to OperationState
  override def changeStateToOperation(operation: Operation): Unit = {
    calculator.operation = operation
  }
  //Changing from OperationState to EqualState
  override def changeStateToEqual(): Unit = {
  }
}
