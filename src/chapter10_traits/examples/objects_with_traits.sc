/*
  You can add a trait to an object when its
  constructed.
 */
trait Logged {
  def log(msg: String) {} // Does nothing
}

class Account(private var balance: Double) {
}

class SavingsAccount(private var balance: Double) extends Account(balance) with Logged {
  def withdraw(amount: Double): Unit = {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}

/*
  Since Logged.log doesn't do anything, this might seem pointless. But we can
  mix in a better logger when constructing an object.
 */
trait ConsoleLogger extends Logged {
  override def log(msg: String) {println(msg)}
}

val acct1 = new SavingsAccount(100)
acct1.withdraw(101) // Will call Logger.log, but since it doesn't do anything, there's no output

val acct2 = new SavingsAccount(100) with ConsoleLogger
acct2.withdraw(101) // This one actually prints a message.