package ex_20_Super_Abstraction;

public class Lab1714_Interview_Q {
}

interface I11{
 final int a = 10;
}

interface I12{

}

class A1{

}
class B1{

}

//class Test2 extends A1,A2{} Not Allowed

class Test3 implements I11{} // Allowed

class Test4 implements I11,I12{}// Allowed

class Test5 extends A1 implements I11,I12{} // Allowed

// class Test6 implements I11,I12  extends A1{} // Reverse is never allowed

// interface I3 extends A1{} Not Allowed