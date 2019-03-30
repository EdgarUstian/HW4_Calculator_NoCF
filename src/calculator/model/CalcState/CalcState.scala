package calculator.model.CalcState

import calculator.model.Calculator
import calculator.model.Operation._

abstract class CalcState(calculator: Calculator) {
  var symbol: String = ""
  //Changing to NumberState
  def changeStateToNumber(): Unit = {}
  //Changing to OperationState
  def changeStateToOperation(operation: Operation): Unit = {}
  //Changing to EqualsState
  def changeStateToEqual(): Unit = {}
}
