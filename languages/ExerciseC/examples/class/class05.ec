program class05

class A {
	Num x
	Num y
}

class B extends A {
  // Num x;
}

run  
 
  let B b = new B()
   in { 
   	 b; 
   	 b.x;
   	 b.x = 3;
   	 b;
   	 // b.x; 
   	 // ((A)b).x;
   	 // ((A)b).x = 1;  
   	 // b;
   }
   