public class AccountList {
    private Account[] accounts;
    private int count;

    public AccountList(int size) {
        this.accounts = new Account[size];
        this.count = 0;
    }

    public boolean appendAccount(Account account) {
        if (this.count < this.accounts.length) {
            this.accounts[count] = account;
            this.count++;
            return true;
        } else {
            return false;
        }
    }

    public Account getAccount(int idx) {
        if (idx < this.count) {
            return this.accounts[idx];
        } else {
            System.out.println("Input index exceeds the number of appended elements");
            return null;
        }
    }
}
