package oppg2_oo

class Rational(n:Int, d:Int) {

  /**
   * Remember that the body of the class is the body of the primary constructor. Assignments goes here.
   *
   * ??? Throws a NotImplementedException and returns the type Nothing
   * which is a subtype of every other type in Scala
   */
  val numer: Int = 1
  val denom: Int = if(d==0) throw new IllegalArgumentException else d

  /**
   * Hint: 1   2   3   4
   *       - + - = - + -
   *       2   3   6   6
   * You don't need to find the greatest common divisor
   */
  def add(that: Rational): Rational = {
    val div =  this.denom * Rational.???
  }

  override def toString = this.numer.toString+"/"+this.denom
}

object Rational {
  /**
   * Hint: Create and invoke a constructor on class Rational
   */
  def apply(n: Int, d: Int): Rational = new Rational(n,d)

  /**
   * Hint: Don't call the other apply method
   * Create a separate constructor using 'this'
   */
  def apply(n: Int): Rational = this(n,1)
}
