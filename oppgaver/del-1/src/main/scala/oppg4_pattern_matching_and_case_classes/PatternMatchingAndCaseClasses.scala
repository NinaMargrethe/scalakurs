package oppg4_pattern_matching_and_case_classes;

// TODO: Add attributes and method (see tests)
case class Person()

object PatternMatchingAndCaseClasses {

  def computeSquareOfIntOrString(number: Any): Int = number match {
    case a:Int => a * a
    case a:String => a.toInt * a.toInt
    case _ => 0
  }

  def checkIfParameterIsPersonOlaAtAge20(parameter: Any): Boolean = parameter match{
    //case p:Int => if(p==20) true
    case _ => false
  }

  // Try to use pattern matching for lists
  // Hint: Use _* for arbitrary many elements i list
  def checkIfSecondElementIsAPersonAtAge30(persons: List[Person]): Boolean = ???
}

