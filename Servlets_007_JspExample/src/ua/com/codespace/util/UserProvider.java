package ua.com.codespace.util;


import ua.com.codespace.model.PhoneNumber;
import ua.com.codespace.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public class UserProvider {
    public static List<User> getListOfUser() {
        return Arrays.asList(
                new User("Robert", "De Niro", "rdeniro@gmail.com", "rdeniro", new PhoneNumber("+117", "764335263")),
                new User("Gabriel", "Macht", "gmacht@gmail.com", "gmacht", new PhoneNumber("+117", "334232112")),
                new User("Margot", "Robbie", "mrobbie@yahoo.com", "mrobbie", new PhoneNumber("+134", "277747122")),
                new User("Morgan", "Freeman", "mfreeman@yahoo.com", "mfreeman", new PhoneNumber("+134", "112345663"))
        );
    }

    public static Map<String, User> getEmailToUserMap() {
        return getListOfUser().stream().collect(toMap(User::getEmail, identity()));
    }
}
