
// Interface untuk pengingat suara adzan
interface AudioReminder {
    void playAdzan();
}

// Kelas abstrak untuk Sholat
abstract class Prayer implements AudioReminder {
    String name;
    String time;

    Prayer(String name, String time) {
        this.name = name;
        this.time = time;
    }

    abstract void remind();
}

// Subclass untuk Sholat Fajr
class Fajr extends Prayer {
    Fajr() {
        super("Fajr", "05:00");
    }

    @Override
    void remind() {
        System.out.println("Waktunya sholat " + name + " pukul " + time);
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Fajr dikumandangkan...");
    }
}

// Subclass untuk Sholat Dhuhr
class Dhuhr extends Prayer {
    Dhuhr() {
        super("Dhuhr", "12:00");
    }

    @Override
    void remind() {
        System.out.println("Waktunya sholat " + name + " pukul " + time);
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Dhuhr dikumandangkan...");
    }
}

// Subclass untuk Sholat Asr
class Asr extends Prayer {
    Asr() {
        super("Asr", "15:30");
    }

    @Override
    void remind() {
        System.out.println("Waktunya sholat " + name + " pukul " + time);
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Asr dikumandangkan...");
    }
}

// Subclass untuk Sholat Maghrib
class Maghrib extends Prayer {
    Maghrib() {
        super("Maghrib", "18:15");
    }

    @Override
    void remind() {
        System.out.println("Waktunya sholat " + name + " pukul " + time);
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Maghrib dikumandangkan...");
    }
}

// Subclass untuk Sholat Isha
class Isha extends Prayer {
    Isha() {
        super("Isha", "19:30");
    }

    @Override
    void remind() {
        System.out.println("Waktunya sholat " + name + " pukul " + time);
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Isha dikumandangkan...");
    }
}

// Main class
public class PrayerSchedule {
    public static void main(String[] args) {
        Prayer[] prayers = {
            new Fajr(),
            new Dhuhr(),
            new Asr(),
            new Maghrib(),
            new Isha()
        };

        for (Prayer p : prayers) {
            p.remind();
            p.playAdzan();
            System.out.println();
        }
    }
}
