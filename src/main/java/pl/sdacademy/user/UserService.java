package pl.sdacademy.user;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserService {
    private List<User> users;

    public UserService() {
        init();
    }

    private void init() {
        this.users = Arrays.asList(
                new User("Lillian Burgess", Gender.female, "$2,499.49", 31),
                new User("Bird Ramsey", Gender.male, "$3,946.45", 23),
                new User("Kristie Cole", Gender.female, "$2,820.18", 34),
                new User("Leonor Cross", Gender.female, "$3,277.32", 30),
                new User("Marsh Mccall", Gender.male, "$1,972.47", 28)
        );
    }

    public List<User> findByGender(Gender gender) {
        return users.stream()
                .filter(user -> user.getGender().equals(gender))
                .collect(Collectors.toList());
    }

    public List<String> mapToNames() {
        return users.stream()
                .map(user -> user.getName())
                .collect(Collectors.toList());
    }

    public List<User> sortByAge() {

        return users.stream()
//                .sorted(Comparator.comparingInt(user -> user.getAge()))
                .sorted((a, b) -> {
                    int aAge = a.getAge();
                    int bAge = b.getAge();

                    if (aAge > bAge) {
                        return 1;
                    } else if (aAge < bAge) {
                        return -1;
                    } else {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
    }

    // test ze zwrocony user ma balance o wartosci 394645
    public User findWithHighestBalance() {
        return sortByBalance().stream()
                .findFirst()
                .orElse(null);
    }

    public List<User> sortByBalance() {
        return users.stream()
                .sorted(Comparator.comparingLong(user -> ((User)user).getBalance()).reversed())
//                .sorted((a, b) -> {
//                    Long aBalance = a.getBalance();
//                    Long bBalance = b.getBalance();
//
//                    if (aBalance > bBalance) {
//                        return 1;
//                    } else if (aBalance < bBalance) {
//                        return -1;
//                    } else {
//                        return 0;
//                    }
//                })
                .collect(Collectors.toList());
    }

    public double avgBalance() {
        return users.stream()
                .mapToLong(user -> user.getBalance())
                .average()
                .orElse(0.0);
    }

    public int getCityLength(UserWithAddress userWithAddress) {
        return Optional.ofNullable(userWithAddress)
                .map(user -> user.getAddress())
                .map(address -> address.getCity())
                .map(city -> city.length())
                .orElse(0);
//        return user.getAddress().getCity().length();
    }

    public boolean isRich(User user) {
        Optional<User> optionalUser = Optional.ofNullable(user);

        return Optional.ofNullable(user)
                .filter(u -> u.getBalance() > 10000)
                .isPresent();
    }

}









