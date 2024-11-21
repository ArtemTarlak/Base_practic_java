import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class task3 {
    public static void main(String[] args){
        Worker w1 = new Worker("Ivan", 29,'m', "teather");
        Worker w2 = new Worker("Alex", 25,'m', "sis admin");
        Worker w3 = new Worker("Sabina", 32,'w', "accountant");
        Worker w4 = new Worker("Vlad", 19,'m',  "handuman");
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(w1);
        workerList.add(w2);
        workerList.add(w3);
        workerList.add(w4);
        System.out.println("Результаты до изменения");
        System.out.println(workerList);

        for (Worker worker : workerList){
            worker.setJob("programmer");
        }
        System.out.println('\n'+"Результаты после изменения");
        System.out.println(workerList);
    }
}

class Worker {
    private String name;
    private int age;
    private char sex;
    private String job;

    public Worker(String name, int age, char sex, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return '\n' + "Worker {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", job='" + job + '\'' +
                '}' ;
    }
}



