package calculator.model

import calculator.model.Decimal.{Decimal, WholeNumber}
import calculator.model.Operation.{Initial, Operation}
import calculator.model.CalcState._

class Calculator() {
  //Predefining All Variables
    //Initial States Of Calculator
    var calcState: CalcState = new NumberState(this) //Initial State Of Calculator
    var decimal: Decimal = new WholeNumber(this) //Initial Decimal State Of Calculator
    var operation: Operation = new Initial(this) //Initial Operation of Calculator

    //Initial Variables Of Calculator
      //Current Number Worked On
      var numberWorkedOn: String = "0" //Current Number Worked On String Type
      var numberFinal: Double = 0.0 //Final Number as Double
      //Values Being Stored
      var LHS: Double = 0.0 //Left Hand Side Number
      var RHS: Double = 0.0 //Right Hand Side Number
      //Equal x2 variables
      var EEV: Double = 0.0 //Equals Equals Side Variable
      var lastOperation: Operation = new Initial(this)

  var AnsValue: Double = 0.0 //Answer after computation

  var showNumber: Double = 0.0 //The number to be displayed

  // Accessed by View to show number calculated on calculator
  def displayNumber(): Double = {
    println(LHS, operation.symbol, RHS, "=", AnsValue, showNumber, "|", lastOperation.symbol, EEV, "|", calcState.symbol)
    showNumber
  }

  //NumberAction Clicked
  def makeNumber(nextDigit: String): Unit = {
    numberWorkedOn += nextDigit //The Next Upcoming Digit
    numberFinal = numberWorkedOn.toDouble
    RHS = numberFinal
    showNumber = RHS
  }

  //Anything Other than NumberAction is Clicked
  def resetDecimal(): Unit = {
    decimal = new WholeNumber(this)
  }

  //EqualAction Clicked
  def setCalculation(): Unit = {

  }

}
