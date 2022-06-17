package medium;

public class Employee {
    private final long id;
    private int journalDestroy;

    public Employee(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public int getJournalDestroy() {
        return journalDestroy;
    }

    public void setJournalDestroy() {
        this.journalDestroy ++;
        System.out.println(getId() + ": Ура я испортил водку!");
    }
}
