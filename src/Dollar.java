Dollar(int amount) {
         this.amount = amount;
     }
     Dollar times(int multiplier) {
     Money times(int multiplier) {
         return new Dollar(amount * multiplier);
     }
 }