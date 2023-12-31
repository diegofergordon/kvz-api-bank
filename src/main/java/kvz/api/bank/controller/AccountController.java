package kvz.api.bank.controller;

import kvz.api.bank.model.Account;
import kvz.api.bank.model.RemoveResult;
import kvz.api.bank.model.ValidationResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {


    @GetMapping("get")
    public Account getAccount() {
        return new Account("Ahorros", "12001212452", "1");
    }

    @GetMapping("validate")
    public ValidationResult validate() {
        return new ValidationResult("Validation account Successful", "Account is valid");
    }
    @GetMapping("remove")
    public RemoveResult remove() {
        return new RemoveResult("Removed account Successful", "Removed");
    }
}
