abstract class Demo{

    abstract void show();

    void display(){
        System.out.println("Display Method");
    }
}

class Test extends Demo{

    void show(){
        System.out.println("Abstract Method");
    }
}

class Abstraction{

    public static void main(String args[]){

        Test obj=new Test();

        obj.show();

        obj.display();
    }
}
