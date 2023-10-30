package kvz.api.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Account {
    private String accountName;
    private String accountNumber;
    private String accountType;
}
