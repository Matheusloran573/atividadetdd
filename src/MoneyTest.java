@Test
     public void testMultiplication() {
         Dollar five = new Dollar(5);
         five.times(2);
         assertEquals(10, five.amount);
         assertEquals(new Dollar(10), five.times(2));
         assertEquals(new Dollar(15), five.times(3));
     }
 }
}