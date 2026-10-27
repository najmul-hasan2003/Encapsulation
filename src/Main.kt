class OurBankAccount() {
    /*Encapsulation: Secure Data
• public (ডিফল্ট): কোডটি প্রজেক্টের যেকোনো জায়গা থেকে অ্যাক্সেস করা যায়। আপনি কোনো মডিফায়ার না লিখলে সেটি অটোমেটিক public হয়ে যায় (যেমন আপনার deposit বা withdraw ফাংশন)।
• private: কোডটি শুধুমাত্র সেই নির্দিষ্ট ক্লাসের ({ }) ভেতর থেকে অ্যাক্সেস করা যায়। যেমন আপনার balance ভেরিয়েবলটি private করায় বাইরের কেউ সরাসরি bank.balance = 1000000 লিখে হ্যাক করতে পারবে না। এটাই Encapsulation-এর মূল উদ্দেশ্য।
• protected: private-এর মতোই, তবে ক্লাসটি যদি অন্য কোনো ক্লাস ইনহেরিট (Subclass/Child class) করে, তাহলে সেই চাইল্ড ক্লাস থেকেও এটি অ্যাক্সেস করা যায়।
• internal: এটি কোটলিনের একটি বিশেষ মডিফায়ার। একই মডিউলের (Module) ভেতরের যেকোনো কোড থেকে এটি অ্যাক্সেস করা যায়, কিন্তু মডিউলের বাইরে থেকে করা যায় না।
     */
    private var balance: Double = 0.0
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= 0.0) {
            println("Invalid Amount")
        }
        else if (balance < amount) {
            println("Insufficient Balance")
        }
        else{
            balance -= amount
            println("Withdraw $amount")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}
fun main() {
    val bank = OurBankAccount()
    bank.deposit(5000.0)
    println("Balance: ${bank.getBalance()}")
    bank.withdraw(3000.0)
    println("Your new Balance is: ${bank.getBalance()}")
}