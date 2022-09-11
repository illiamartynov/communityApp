package org.example;
enum variantsToGo{
 CAFE,RESTAURANT,CINEMA,THEATRE,KARAOKE,POOL,SWIMMING_POOL,CLUB,SHOP
}


public class Account {
 private double balance;
 private double q;


 Account() {
  balance = 0;
 }
 Account( double accountBalance) {
  this.balance = accountBalance;
 }
 double paymentForParty(double withdrawAmount) {
  q = withdrawAmount;
  return q;


 }
 double getBalance() {
  return this.balance += q *-1;
 }
 double setBalance() {
  return this.balance;

 }

}