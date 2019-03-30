package calculator.model.Operation

import calculator.model.Calculator

class Initial(calculator: Calculator) extends Operation {
  this.symbol = "~"

  override def compute(): Unit = {
    calculator.AnsValue = calculator.RHS
  }
}
