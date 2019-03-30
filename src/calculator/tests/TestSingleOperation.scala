package calculator.tests

import calculator.controller._
import calculator.model.Calculator
import org.scalatest.FunSuite

class TestSingleOperation extends FunSuite{

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }
  test("Testing Addition"){
    val calculator: Calculator = new Calculator()

    // Since we don't need event inf0rmation f0r (edit to avoid keyword) this program, setting the event to null
    // to test is fine. This allows us to automate testing without using the GUI
    new NumberAction(calculator, 1).handle(null)

    new AdditionAction(calculator).handle(null)

    new NumberAction(calculator, 5).handle(null)

    new EqualAction(calculator).handle(null)

    val expected: Double = 6.0
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }
  test("Testing Subtraction"){
    val calculator: Calculator = new Calculator()

    // Since we don't need event inf0rmation f0r (edit to avoid keyword) this program, setting the event to null
    // to test is fine. This allows us to automate testing without using the GUI
    new NumberAction(calculator, 6).handle(null)

    new SubtractionAction(calculator).handle(null)

    new NumberAction(calculator, 2).handle(null)

    new EqualAction(calculator).handle(null)

    val expected: Double = 4.0
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }
  test("Testing Multiplication"){
    val calculator: Calculator = new Calculator()

    // Since we don't need event inf0rmation f0r (edit to avoid keyword) this program, setting the event to null
    // to test is fine. This allows us to automate testing without using the GUI
    new NumberAction(calculator, 3).handle(null)

    new MultiplicationAction(calculator).handle(null)

    new NumberAction(calculator, 5).handle(null)

    new EqualAction(calculator).handle(null)

    val expected: Double = 15.0
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }
  test("Testing Division"){
    val calculator: Calculator = new Calculator()

    // Since we don't need event inf0rmation f0r (edit to avoid keyword) this program, setting the event to null
    // to test is fine. This allows us to automate testing without using the GUI
    new NumberAction(calculator, 3).handle(null)

    new DivisionAction(calculator).handle(null)

    new NumberAction(calculator, 4).handle(null)

    new EqualAction(calculator).handle(null)

    val expected: Double = 0.75
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }
}
