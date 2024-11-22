import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        Worker w1 = new Worker("Ivan", "1995-01-15", 'm', "intern");
        Worker w2 = new Worker("Alex", "1984-06-10", 'm', "junior");
        Worker w3 = new Worker("Sabina", "2005-03-21", 'w', "middle");
        Worker w4 = new Worker("Vlad", "1998-07-01", 'm', "senior");

        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(w1);
        workerList.add(w2);
        workerList.add(w3);
        workerList.add(w4);

        System.out.println("Результаты до изменения:");
        workerList.forEach(System.out::println);

        for (Worker worker : workerList) {
            worker.promote(); // Понижаем ранг
        }

        System.out.println("\nРезультаты после изменения:");
        workerList.forEach(System.out::println);
    }
}

class Worker {
    private String name;
    private LocalDate birthDate;
    private char sex;
    private String job;
    private Rank rank;

    public Worker(String name, String birthDate, char sex, String job) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.sex = sex;
        this.job = job;
        this.rank = Rank.fromJob(job);
    }

    public void setJob(String job) {
        this.job = job;
        this.rank = Rank.fromJob(job); // Обновляем ранг в зависимости от новой должности
    }

    public void promote() {
        if (rank.ordinal() > 0) { // Уменьшаем ранг, если он не самый низкий
            rank = Rank.values()[rank.ordinal() - 1];
            this.job = rank.getJobTitle();
        }
    }

    public String toString() {
        return '\n' + "Worker {" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", sex=" + sex +
                ", job='" + job + '\'' +
                '}' ;
    }
}




