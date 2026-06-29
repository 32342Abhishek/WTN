class StaticDemo{

    static int x=100;

    int y=200;

    static void show(){
        System.out.println("Static Method");
    }

    void display(){
        System.out.println("Non Static Method");
    }

    public static void main(String args[]){

        StaticDemo obj=new StaticDemo();

        show();

        obj.display();
    }
}
