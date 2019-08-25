package pl.sdacademy.excercises.apartments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InMemoryApartmentRepository implements ApartmentRepository{
    private List<Apartment> apartments;
    private ApartmentRepository apartmentRepository;

    public InMemoryApartmentRepository(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
        init();
    }

    private void init() {
        List<Apartment> apartments = apartmentRepository.findAll();
        this.apartments = Arrays.asList(
                new Apartment("Poznań", "Grunwald", "Grunwaldzka",
                        3, 67.5f, true, 456857.99f),
                new Apartment("Poznań", "Górczyn", "Głogowska",
                        6, 110.5f, false, 786747.99f),
                new Apartment("Wrocław", "Stare Miasto", "Szkolna",
                        2, 50.5f, false, 300000.99f),
                new Apartment("Warszawa", "łazienki", "Aleja Niepodległości",
                        10, 250.5f, true, 1456857.99f),
                new Apartment("Warszawa", "Praga", "Jana III Sobieskiego",
                        5, 120.5f, true, 1156857.99f),
                new Apartment("Gdańsk", "śródmieście", "Główna",
                        1, 30.5f, false, 656857.99f)
        );
    }

    @Override
    public List<Apartment> findAll() {
        return new ArrayList<>(apartments);
    }
}
