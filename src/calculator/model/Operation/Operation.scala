package calculator.model.Operation

abstract class Operation {
  var symbol: String = ""
  //Class that will define the operation processed
  def compute(): Unit = {
  }
}
