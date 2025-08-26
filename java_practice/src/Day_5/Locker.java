package Day_5;

public class Locker {
    private String lockerId;
    private boolean locked;
    private String passcode;

    private class SecurityManager {
        private boolean verify(String code) {
            return passcode.equals(code);
        }
    }
    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.locked = true; 
    }
    public void lock() {
        locked = true;
        System.out.println("Locker locked.");
    }
    public void unlock(String code) {
        SecurityManager sm = new SecurityManager();
        if (sm.verify(code)) {
            locked = false;
            System.out.println("Locker unlocked successfully.");
        } else {
            System.out.println("Incorrect passcode. Access denied.");
        }
    }
    public boolean isLocked() {
        return locked;
    }
    public void displayStatus() {
        System.out.println("Locker ID: " + lockerId);
        System.out.println("Status: " + (locked? "Locked" : "Unlocked"));
    }
    public static void main(String[] args) {
        Locker myLocker = new Locker("L123", "g134");

        myLocker.displayStatus();
        myLocker.unlock("0000");     
        myLocker.unlock("g134");  
        myLocker.displayStatus();
        myLocker.lock();
        myLocker.displayStatus();
    }
}

