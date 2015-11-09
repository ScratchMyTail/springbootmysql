package demo;

import org.springframework.data.repository.*;

import java.util.List;

/**
 * Created by christerhansen on 01.10.15.
 */
public interface PersonRepository extends Repository<Person, Long> {
    public List<Person> findAll();
    public void save(Person person);
}
