package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootMySqlApplication.class)
@WebAppConfiguration
public class SpringBootMySqlApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAll(){
		Person person = new Person("Kalle", "Ekmans");
		personRepository.save(person);
		List<Person> personList = personRepository.findAll();
		System.out.println(personList.size());
	}
}
