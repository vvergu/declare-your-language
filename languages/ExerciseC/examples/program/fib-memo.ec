program FibMemo

class Fib {
	
   Num n
   Num fib
   Fib fibn1 
   
   Fib initialize() { 
     if(this.n == 0) { 
       this.fib = 0; 
       this;
     } else {
       if( 
       	this.n == 1
       )
         this.fib = 1 
       else
         this.fib = - 1; 
       this.fibn1 = new Fib();
       this.fibn1.n = (this.n - 1);
       this.fibn1.initialize();
     }
   }

   Fib getn1() { 
     this.fibn1
   }
 
   Num calculate() {
     if(this.fib != -1)   
       this.fib   
     else
       this.fib = this.fibn1.calculate() + this.fibn1.getn1().calculate()
   } 
} 

run  
  let Fib fib = new Fib()
   in {
     fib.n = 10;
     fib.initialize();
     fib.calculate();
   }