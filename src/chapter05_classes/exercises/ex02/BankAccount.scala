package chapter05_classes.exercises.ex02

/*
  Write a class BankAccount with methods deposit
  and withdraw, and a read-only property balance.
 */

class BankAccount {
  private var accountBalance: Double = 0

  def this(initialBalance: Int){
    this() // call primary constructor first
    accountBalance = initialBalance
  }
  def deposit(amount: Double){accountBalance += amount}
  def withdraw(amount: Double){accountBalance -= amount}
  def balance = accountBalance

  override def toString: String = {
    f"BankAccount(balance = $$$accountBalance%.2f)"
  }
}

object BankAccount {
  def main(args: Array[String]): Unit = {
    val acct: BankAccount = new BankAccount
    acct.deposit(1000.00)
    acct.withdraw(345.67)
    println(acct)
  }
}
