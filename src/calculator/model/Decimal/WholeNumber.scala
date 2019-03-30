package calculator.model.Decimal

import calculator.model.Calculator

class WholeNumber(calculator: Calculator) extends  Decimal {
  override def makeDecimal(): Unit = {
    calculator.numberWorkedOn += "."
    calculator.decimal = new DecimalNumber
  }
}
