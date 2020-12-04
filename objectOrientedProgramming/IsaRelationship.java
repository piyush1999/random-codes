package objectOrientedProgramming;

class Parent {
    public void m1() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    public void m2() {
        System.out.println("Child class");
    }
}

class IsaRelationship {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1();
//        p1.m2();  error
        Child c1 = new Child();
        c1.m1();
        c1.m2();
        
        Parent p2 = new Child();
//        p2.m2();  error
        p2.m1();
    }   
}
