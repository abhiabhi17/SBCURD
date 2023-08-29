package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SbcurdApplicationTests {

	@Test
	public void contextLoads() {
	}

	
}
