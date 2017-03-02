package chapter08_inheritance.exercises.ex02

/*
  Extend the BankAccount class of the preceding exercise
  into a class SavingsAccount that earns interest every
  month (when a method earnMonthlyInterest is called)
  and has three free deposits or withdrawals every month.
  Reset the transaction count in the earnMonthlyInterest method.
 */

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = {balance += amount; balance}
  def withdraw(amount: Double) = {balance -= amount; balance}

  override def toString: String = s"BankAccount($currentBalance)"
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private val transactionFee = 0
  private val freeTransactionLimit = 3
  private var transactionCount = 0
  private var interestRate = 0.009

  override def deposit(amount: Double): Double = {
    if(transactionCount < freeTransactionLimit){
      transactionCount -= 1
      super.deposit(amount)
    } else {
      super.deposit(amount - transactionFee)
    }
  }

  override def withdraw(amount: Double): Double = super.withdraw(amount)

  def earnMonthlyInterest(): Unit ={
    super.deposit(super.currentBalance * interestRate)
    transactionCount = freeTransactionLimit
  }
}
