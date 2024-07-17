/*public class ConstructorExamples {
    int a;
    ConstructorExamples(){
        a=10;
    }
    public static void main(String[]args){
        ConstructorExamples demo = new ConstructorExamples();
        System.out.println(demo.a);
    }
}



/* Parameterized Constructor */

public class ConstructorExamples {
    int x;
    ConstructorExamples(int x){
        this.x = x;
    }
    ConstructorExamples(ConstructorExamples obj){
        this.x = obj.x;
    }
    public static void main(String[]args) {
        ConstructorExamples obj1 = new ConstructorExamples (20);
        ConstructorExamples obj2 = new ConstructorExamples(obj1);
        System.out.println(obj2.x);
    }
}
