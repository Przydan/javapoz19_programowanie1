package pl.sdacademy.excercises.apartments;

import java.util.List;

public interface ApartmentRepository {
    List<Apartment> findAll();
}
