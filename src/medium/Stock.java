package medium;

public class Stock {
    private int vodka;

    public Stock(int vodka) {
        this.vodka = vodka;
    }

    public int getVodka() {
        return vodka;
    }

    public void addVodkaEmployee(Employee employee, int amountVodka) {
        employee.setJournalDestroy(amountVodka);
        vodka -= amountVodka;
    }
}
