package calculator.model.Operation.FourFunction

import calculator.model.Calculator
import calculator.model.Operation.Operation

class Addition(calculator: Calculator) extends Operation {
  this.symbol = "+"

  override def compute(): Unit = {
    calculator.AnsValue = calculator.LHS + calculator.EEV
  }
}
