package chapter08_inheritance.exercises.ex01

/*
  Extend the following BankAccount class to a CheckingAccount
  class that charges $1 for every deposit and withdrawal.
    class BankAccount(initialBalance: Double) {
      private var balance = initialBalance
      def currentBalance = balance
      def deposit(amount: Double) = { balance += amount; balance }
      def withdraw(amount: Double) = { balance -= amount; balance }
    }
 */

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = {balance += amount; balance}
  def withdraw(amount: Double) = {balance -= amount; balance}

  override def toString: String = s"BankAccount($currentBalance)"
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = super.deposit(amount-1.00)

  override def withdraw(amount: Double): Double = {
    super.withdraw(1)
    super.withdraw(amount)
  }

  override def toString: String = s"CheckingAccount($currentBalance)"
}

object Main {
  def main(args: Array[String]): Unit = {
    val acct = new CheckingAccount(100.00)
    acct.deposit(10) // will actually deposit 9
    println(acct)
    println(acct.withdraw(10)) // will actually return 9
    println(acct)
  }
}
