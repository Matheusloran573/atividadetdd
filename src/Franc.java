Franc(int amount) {
         this.amount = amount;
     }
     Franc times(int multiplier) {
     Money times(int multiplier) {
         return new Franc(amount * multiplier);
     }
 }