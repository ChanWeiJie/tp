package manageezpz.model.person;

import java.time.LocalDate;

public class Date {
    public static final String MESSAGE_CONSTRAINTS = "Date should be in the following formats: \"yyyy-MM-dd\", "
            + "\"yyyy/MM/dd\", \"yyyy MMM dd\", \"dd MMM yyyy\", \"dd-MM-yyyy\", \"dd/MM/yyyy\"";

    private LocalDate value;

    public Date(LocalDate date) {
        value = date;
    }
    public LocalDate getValue() {
        return value;
    }

    public void setValue(LocalDate value) {
        this.value = value;
    }
}
