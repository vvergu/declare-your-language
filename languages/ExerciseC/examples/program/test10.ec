program test10

class A {
   A overriding(A in) {
     this
   }
}

class B extends A {
   A overriding(A in) {
     this
   }
}

run 
  let B b = new B()
	 in b.overriding(new A())


