package java8problemsolving;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@FunctionalInterface
public interface BonusCalculator {

    public Double calculateBonus(Double salary);

    default String formatHireDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
