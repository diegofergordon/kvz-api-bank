package kvz.api.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class ValidationResult {
    private String result;
    private String details;
}
