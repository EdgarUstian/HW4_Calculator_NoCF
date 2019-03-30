package calculator.tests

import calculator.controller._
import calculator.model.Calculator
import org.scalatest._

class TestEnterNumbers extends  FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("Testing 10 Number Buttons") {
    //Calculator Button 1
    val calculator1: Calculator = new Calculator()

    new NumberAction(calculator1, 1).handle(null)

    val expected1: Double = 1.0
    val actual1: Double = calculator1.displayNumber()
    assert(equalDoubles(actual1, expected1), actual1)



    //Calculator Button 2
    val calculator2: Calculator = new Calculator()

    new NumberAction(calculator2, 2).handle(null)

    val expected2: Double = 2.0
    val actual2: Double = calculator2.displayNumber()
    assert(equalDoubles(actual2, expected2), actual2)


    //Calculator Button 3
    val calculator3: Calculator = new Calculator()

    new NumberAction(calculator3, 3).handle(null)

    val expected3: Double = 3.0
    val actual3: Double = calculator3.displayNumber()
    assert(equalDoubles(actual3, expected3), actual3)


    //Calculator Button 4
    val calculator4: Calculator = new Calculator()

    new NumberAction(calculator4, 4).handle(null)

    val expected4: Double = 4.0
    val actual4: Double = calculator4.displayNumber()
    assert(equalDoubles(actual4, expected4), actual4)


    //Calculator Button 5
    val calculator5: Calculator = new Calculator()

    new NumberAction(calculator5, 5).handle(null)

    val expected5: Double = 5.0
    val actual5: Double = calculator5.displayNumber()
    assert(equalDoubles(actual5, expected5), actual5)


    //Calculator Button 6
    val calculator6: Calculator = new Calculator()

    new NumberAction(calculator6, 6).handle(null)

    val expected6: Double = 6.0
    val actual6: Double = calculator6.displayNumber()
    assert(equalDoubles(actual6, expected6), actual6)


    //Calculator Button 7
    val calculator7: Calculator = new Calculator()

    new NumberAction(calculator7, 0).handle(null)

    val expected7: Double = 0.0
    val actual7: Double = calculator7.displayNumber()
    assert(equalDoubles(actual7, expected7), actual7)


    //Calculator Button 8
    val calculator8: Calculator = new Calculator()

    new NumberAction(calculator8, 8).handle(null)

    val expected8: Double = 8.0
    val actual8: Double = calculator8.displayNumber()
    assert(equalDoubles(actual8, expected8), actual8)


    //Calculator Button 9
    val calculator9: Calculator = new Calculator()

    new NumberAction(calculator9, 9).handle(null)

    val expected9: Double = 9.0
    val actual9: Double = calculator9.displayNumber()
    assert(equalDoubles(actual9, expected9), actual9)


    //Calculator Button 0
    val calculator0: Calculator = new Calculator()

    new NumberAction(calculator0, 0).handle(null)

    val expected0: Double = 0.0
    val actual0: Double = calculator0.displayNumber()
    assert(equalDoubles(actual0, expected0), actual0)
  }

  test("Testing Weird Number Inputs"){
    //Calculator Button
    val calculator: Calculator = new Calculator()

    new NumberAction(calculator, 0).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 2).handle(null)
    new NumberAction(calculator, 3).handle(null)
    new NumberAction(calculator, 4).handle(null)
    new NumberAction(calculator, 5).handle(null)
    new NumberAction(calculator, 6).handle(null)
    new NumberAction(calculator, 7).handle(null)
    new NumberAction(calculator, 8).handle(null)
    new NumberAction(calculator, 9).handle(null)
    new NumberAction(calculator, 10).handle(null)
    new NumberAction(calculator, 11).handle(null)



    val expected: Double = 1234567891011.0
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }

}
