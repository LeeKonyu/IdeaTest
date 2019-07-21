public class Test2 {
    public static void main (String[] args) {
        Animal h = new Horse();
        h.eat();
    }
}

class Animal {
    public void eat(){
        System.out.println ("Animal is eating.");
    }
}

class Horse extends Animal{
    public void eat(){
        System.out.println ("Horse is eating.");
    }
    public void buck(){
    }
}