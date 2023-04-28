package First.test.inherit;

/**
 * @author SeaStar
 */
public class Testcomposition {
    public static void main(String[] args) {
        STU stu1 = new STU("Happy", 175.0, "java");
        STU stu2 = new STU();
        stu1.study();
        stu2.study();
        Computer computer = new Computer();
        computer.cpu.calcuclate();
        computer.memory.store();

    }
}

class STU {
    final person person = new person();
    String mojar;

    public void study() {
        System.out.println(this.person.name + " is Studying");
    }

    public STU() {

    }

    public STU(String name, double height, String mojar) {
        this.person.name = name;
        this.person.height = height;
        this.mojar = mojar;

    }
}

class Memory {
    public void store() {
        System.out.println("Memory.store");
    }
}

class CPU {
    public void calcuclate() {
        System.out.println("CPU.calculate");
    }
}

class Computer {
    final Memory memory = new Memory();
    final CPU cpu = new CPU();
}