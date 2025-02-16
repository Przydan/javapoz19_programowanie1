package pl.sdacademy.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class InMemoryEmployeeRepository implements EmployeeRepository {
    private List<Employee> employees;

    public InMemoryEmployeeRepository() {
        this.init();
    }

    InMemoryEmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    private void init() {
        this.employees = Arrays.asList(
                new Employee("zzz", 123, 25),
                new Employee("vnbvnbv", 0, 0),
                new Employee("JKDFJLKKDSL", 12345, 24),
                new Employee("test0000000000000001", 123, 23),
                new Employee("Bob29", 123, 23),
                new Employee("sdfdsfds", 54544, 24),
                new Employee("rfdsfdsf", 9566, 24),
                new Employee("sdfgdfg", 0, 24),
                new Employee("grfgfdjhnfgj", 0, 0),
                new Employee("zubair12", 28765, 35),
                new Employee("HarryPotter", 123, 23),
                new Employee("vardha", 120000, 87),
                new Employee("ch", 0, 0),
                new Employee("Nupur", 500000, 26),
                new Employee("ch1", 0, 0),
                new Employee("Bob48", 123, 23),
                new Employee("Bob49", 12345, 23),
                new Employee("Bob378", 12345, 99),
                new Employee("HarryPotter1", 123, 23),
                new Employee("HarryPotter2", 123, 23),
                new Employee("harnisha", 7878, 17),
                new Employee("Bob4144", 100000, 80),
                new Employee("Bob4933", 10000, 23),
                new Employee("testjlm", 123, 23),
                new Employee("sadsd", 3432, 32),
                new Employee("kkkk", 90888, 65),
                new Employee("Bob3789", 12345, 99),
                new Employee("abcdefsgxj", 373783, 46),
                new Employee("TestName36", 26700, 29),
                new Employee("TestName37", 3200, 23),
                new Employee("TestName38", 2673, 25),
                new Employee("TestName39", 4300, 34),
                new Employee("kkckck", 8383, 28),
                new Employee("Visu", 66666, 32),
                new Employee("Souvik", 2000, 30),
                new Employee("eewrfewf", 689, 24),
                new Employee("HarryPotter3", 123, 23),
                new Employee("adsfdhnfgj", 0, 0),
                new Employee("abc123", 12345, 99),
                new Employee("namedummyjETI", 100456, 26),
                new Employee("new test", 50000, 26),
                new Employee("abc1234", 12345, 99),
                new Employee("WNTkC7sj1E", 7637261, 30),
                new Employee("nDrfALW7EV", 0, 30),
                new Employee("John111", 7637261, 30),
                new Employee("sfdhnfgj", 0, 0),
                new Employee("dsfsdfs", 544445, 24),
                new Employee("8123945027", 2147483647, 2147483647),
                new Employee("DhNCokLg3A", 7637261, 30),
                new Employee("Sid9rfHCEF", 0, 30),
                new Employee("Y3CuZIwq50", 7637261, 30),
                new Employee("Bob41445", 100000, 80),
                new Employee("jaanu", 123456, 24),
                new Employee("test12assaa33n", 12312321, 23),
                new Employee("test12as22saan", 12312321, 23),
                new Employee("Bob414454", 100000, 80),
                new Employee("testTrainingCD", 123, 23),
                new Employee("Bob4144545", 100000, 80),
                new Employee("abcd123", 12345, 99),
                new Employee("sdfgdggfdgdf", 566, 24),
                new Employee("gvfgfggfg", 4142, 25),
                new Employee("SampleAPItest", 12345, 30),
                new Employee("HarryPotter4", 123, 23),
                new Employee("emp", 4142, 25),
                new Employee("test91357885", 123, 23),
                new Employee("HarryPotter6", 123, 23),
                new Employee("emp0011", 4142, 25),
                new Employee("Sayali", 20000, 29),
                new Employee("abcd1234", 12345, 99),
                new Employee("hgfjhgj", 4142, 25),
                new Employee("Pravin", 123, 28),
                new Employee("vfdxhgfnj", 0, 0),
                new Employee("{itemId}", 12345, 99),
                new Employee("Pravin1", 123, 28),
                new Employee("Pravin2", 123, 28),
                new Employee("Bipin", 201, 27),
                new Employee("Bipin3", 2014, 274),
                new Employee("abcdef123", 12345, 99),
                new Employee("Reportstest", 1000, 25),
                new Employee("test123545454544", 123, 23),
                new Employee("kala", 0, 24),
                new Employee("vg", 2, 1),
                new Employee("wwe", 1, 1),
                new Employee("DINESH", 123, 23),
                new Employee("guru", 123, 23),
                new Employee("wq", 12, 12),
                new Employee("werere", 1, 1),
                new Employee("rey", 0, 0),
                new Employee("ter", 12, 12),
                new Employee("ff", 12, 12),
                new Employee("123", 1234, 12345),
                new Employee("o9ooooo", 0, 0),
                new Employee("hbnjnjm", 988488, 95),
                new Employee("Onur Deneme1", 260, 26),
                new Employee("workshop_test_create6", 1000, 35),
                new Employee("abcdef1234", 12345, 99),
                new Employee("abcdef12345", 12345, 99),
                new Employee("${dummy_name}", 12345, 99),
                new Employee("s", 12345, 99),
                new Employee("Amit Negi111", 123456, 44),
                new Employee("s2", 12345, 99),
                new Employee("test1", 123, 23),
                new Employee("xyz321", 12345, 99),
                new Employee("SSESEVi", 85984, 54),
                new Employee("fhuewiafhiufiuwef2r23", 123, 23),
                new Employee("testssss", 41234, 23),
                new Employee("Bob3790", 12345, 99),
                new Employee("Bob3791", 12345, 99),
                new Employee("xyz3210", 12345, 99),
                new Employee("xyz32101", 12345, 99),
                new Employee("tasdest", 12, 23),
                new Employee("taest", 1213, 23),
                new Employee("MONICA RINCON", 4000000, 40),
                new Employee("dffddffdfd", 333333, 44),
                new Employee("qrshmdhd", 2147483647, 12),
                new Employee("Dagmar", 425, 32),
                new Employee("SpivakHahn", 609, 680),
                new Employee("sinta pai ", 12340, 31),
                new Employee("Jagan", 20000, 29),
                new Employee("Simran", 30000, 30),
                new Employee("abcsdgh", 2333, 12),
                new Employee("rosamel fierro grueso", 2147483647, 32),
                new Employee("llamadaPrimerEndpoint", 123456789, 23),
                new Employee("Uk Prashanth", 43465, 44),
                new Employee("ZywAaBznFj", 1271, 56),
                new Employee("pOQdgAAPkW", 1535, 37),
                new Employee("SiLgFqYHTP", 8964, 3),
                new Employee("QOwwfOdEdP", 8997, 46),
                new Employee("QOwwfOdEdP1", 8997, 46),
                new Employee("AwjuRJbNwL", 7393, 85),
                new Employee("LTSetSPbpY", 4666, 43),
                new Employee("mIDWFpzjMp", 4717, 40),
                new Employee("YldCHtseyw", 5713, 4),
                new Employee("bEfLmuAInv", 1362, 46),
                new Employee("max", 123, 23),
                new Employee("nrwryOcXaq", 720, 10),
                new Employee("pra1", 0, 0),
                new Employee("pra2", 20000, 25),
                new Employee("SAJKLFJLDJGKL", 1000, 23),
                new Employee("DDLlmObIFP", 149, 78),
                new Employee("SAJKLFJLDJGKL1", 1000, 23),
                new Employee("yoh4566yr65657", 123, 23),
                new Employee("hema", 12000, 21),
                new Employee("Saig", 61022, 56),
                new Employee("test121122", 123, 23),
                new Employee("name5", 123, 23),
                new Employee("h8iok", 123, 23),
                new Employee("Bob3792", 12345, 99),
                new Employee("Saiy", 24509, 18),
                new Employee("test121122332", 123, 23),
                new Employee("modify test", 1000000, 1126),
                new Employee("Vinay Singh", 75, 28),
                new Employee("asfa", 75, 28),
                new Employee("dhgjx", 75, 28),
                new Employee("z2nep", 75, 28),
                new Employee("test132421122332", 123, 23),
                new Employee("test13244321122332", 123, 23),
                new Employee("qem9jm", 75, 28),
                new Employee("38rufm", 75, 28),
                new Employee("b1rr29", 75, 28),
                new Employee("16738w", 75, 28),
                new Employee("e0vss", 75, 28),
                new Employee("sinta pais ", 12340, 31),
                new Employee("test88888", 123, 23),
                new Employee("tesdt", 123, 23),
                new Employee("nagarjuna1", 855000, 31),
                new Employee("z4icf", 75, 28),
                new Employee("3gxrhh", 75, 28),
                new Employee("Bob37789", 10000, 23),
                new Employee("dankjesus", 420, 69),
                new Employee("SSESEVj", 63578, 12),
                new Employee("SSESEVO", 50167, 94),
                new Employee("sfgsfd", 123, 23),
                new Employee("test23", 123, 23),
                new Employee("ra", 123, 23),
                new Employee("its me", 123, 23),
                new Employee("guy", 123, 23),
                new Employee("da", 1, 2),
                new Employee("yuh", 123, 23),
                new Employee("ffyh", 123, 23),
                new Employee("Jhon Doe", 23456, 25),
                new Employee("AAA BBB", 500, 25),
                new Employee("morpheus", 0, 0),
                new Employee("Jhon Wick", 999999999, 30),
                new Employee("baz", 20, 10),
                new Employee("Jhon Snow", 999999999, 30),
                new Employee("tyhj", 123, 23),
                new Employee("gh", 123, 23),
                new Employee("hj", 123, 23),
                new Employee("MARCELO LARA", 2000000, 45),
                new Employee("MANUEL JARA", 1200000, 22),
                new Employee("VICTOR RAMA", 1000000, 33)
        );

    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }

    @Override
    public List<Employee> sortByAge() {
        return sortBy(employee -> employee.getAge());
//        return employees.stream()
//                .sorted(Comparator.comparingInt(employee -> employee.getAge()))
//                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> sortBySalary() {
        return sortBy(employee -> employee.getSalary());
//        return employees.stream()
//                .sorted(Comparator.comparingInt(employee -> employee.getSalary()))
//                .collect(Collectors.toList());
    }

    private List<Employee> sortBy(ToIntFunction<Employee> selector) {
        return employees.stream()
                .sorted(Comparator.comparingInt(selector))
                .collect(Collectors.toList());
    }
}
