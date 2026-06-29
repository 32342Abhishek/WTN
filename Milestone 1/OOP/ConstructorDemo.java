class Student{

    int id;

    Student(){
        System.out.println("Default Constructor");
    }

    Student(int id){
        this.id=id;
    }

    void display(){
        System.out.println(id);
    }
}

class ConstructorDemo{

    public static void main(String args[]){

        Student s1=new Student();

        Student s2=new Student(101);

        s2.display();
    }
}
