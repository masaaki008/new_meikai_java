package account2;

public class TimeAccountTester2 {
    static int compBalance(Account a, Account b) {
        if (a.getBalance() > b.getBalance())
            return 1;
        else if (a.getBalance() < b.getBalance())
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        Account adchi = new Account("足立幸一", "123456", 1000);
        TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);

        switch (compBalance(adchi, nakata)) {
            case 0: System.out.println("足立と仲田の預金口座は同じ"); break;
            case 1: System.out.println("足立のほうが預金残高が多い"); break;
            case -1: System.out.println("仲田のほうが預金残高が多い"); break;
        }
    }
}
