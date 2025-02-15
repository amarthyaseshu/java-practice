package java8problemsolving;

class Transaction {
    String type;
    double amount;
    Transaction(String type, double amount) { this.type = type; this.amount = amount; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
}