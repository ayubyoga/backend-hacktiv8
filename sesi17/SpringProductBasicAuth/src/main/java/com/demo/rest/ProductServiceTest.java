package com.demo.rest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import static org.mockito.Mockito.times;

import com.demo.rest.entity.Product;
import com.demo.rest.repository.ProductRepository;
import com.demo.rest.service.ProductService;
import com.demo.rest.service.impl.ProductServiceImpl;

@RunWith(SpringRunner.class)
public class ProductServiceTest {

	@InjectMocks
	private ProductService productService = new ProductServiceImpl();

	@Mock
	private ProductRepository productRepository;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(productService, "productRepository", productRepository);
	}

	@Test
	public void testFindAll() {

		final List<Product> datas = TestObjectFactory.createProductList(10);
		Mockito.when(productRepository.findAll()).thenReturn(datas);

		final List<Product> actual = productService.findAllProduct();
		MatcherAssert.assertThat(actual.size(), Matchers.equalTo(datas.size()));
	}

	@Test
	public void testProductById() throws Exception {

		final int id = new Random().nextInt();
		final Product product = TestObjectFactory.createProduct();
		Mockito.when(productRepository.findAllById(id)).thenReturn(Optional.of(product));

		final Product actual = productService.findProductById(id);
		MatcherAssert.assertThat(actual.getId(), Matchers.equalTo(product.getId()));
		MatcherAssert.assertThat(actual.getNama), Matchers.equalTo(product.getNama()));
		MatcherAssert.assertThat(actual.getHargaBeli(), Matchers.equalTo(product.getHargaBeli()));
		MatcherAssert.assertThat(actual.getHargaJual(), Matchers.equalTo(product.getHargaJual()));
	}

	@Test
	public void testProductByIdWithNullDataFromDB() throws Exception {
		final int id = new Random().nextInt();

		Mockito.when(productRepository.findById(id)).thenReturn(Optional.empty());
		final Product actual = productService.findProductById(id);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testSaveUpdateProduct() {
		final Product product = TestObjectFactory.createProduct();
		Mockito.when(productRepository.save(product)).thenReturn(product);

		final Product actual = productService.saveorUpdateProduct(product);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testDeleteProduct() {
		final int id = new Random().nextInt();
		Product product = TestObjectFactory.createProduct();

		Mockito.when(productRepository.findById(id)).thenReturn(Optional.of(product));
		Mockito.doNothing().when(productRepository).delete(product);
		productService.deleteProduct(id);

		Mockito.verify(productRepository, times(1)).delete(product);
	}
}
