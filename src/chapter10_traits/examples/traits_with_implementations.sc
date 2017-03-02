/*
  In Scala, trait methods need not be abstract.
  For example, we can make ConsoleLogger into
  a trait.
 */
trait ConsoleLogger {
  def log(msg: String) {println(msg)}
}

class Account(private var balance: Double) {
}

class SavingsAccount(private var balance: Double) extends Account(balance) with ConsoleLogger {
  def withdraw(amount: Double): Unit = {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}

val savings = new SavingsAccount(100)
savings.withdraw(101)