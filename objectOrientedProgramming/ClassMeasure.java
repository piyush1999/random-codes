package objectOrientedProgramming;

class Measure {
    int h;
    int l;
    int b;
}

class ClassMeasure {
        public static void main(String[] args) {
            Measure m1 = new Measure();
            m1.h = 2;
            Measure m2 = new Measure();
            m2 = m1;
            System.out.println(m2.h);
    }
}
