package christmasDelivery;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static christmasDelivery.SantasSleighImpl.arePresentsReady;

public class Main {

    public static void main(String[] args) {

        final List<Elf> elfs = Arrays.asList(
                new Elf(0),
                new Elf(1),
                new Elf(2)
        );

        while (!shouldStopProcess()) {
            elfs.get(0).requestAndPackPresent();
            elfs.get(1).requestAndPackPresent();
            elfs.get(2).requestAndPackPresent();
        }
    }

    private static boolean isChristmasNow() {
        final LocalDate now = LocalDate.now();
        return now.getMonth() != Month.DECEMBER && now.getDayOfMonth() == 24;
    }

    private static boolean shouldStopProcess() {
        return arePresentsReady() || isChristmasNow();
    }
}
