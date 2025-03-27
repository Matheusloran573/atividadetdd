
     int amount = 10;
     Dollar(int amount) {}
     void times(int multiplier) {}
 }
     int amount;
     Dollar(int amount) {
         this.amount = amount;
     }
     void times(int multiplier) {
         amount = amount * multiplier;
     }
 }