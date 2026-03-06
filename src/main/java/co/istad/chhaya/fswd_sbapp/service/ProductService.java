package co.istad.chhaya.fswd_sbapp.service;

import co.istad.chhaya.fswd_sbapp.domain.Product;
import co.istad.chhaya.fswd_sbapp.dto.CreateProductRequest;
import co.istad.chhaya.fswd_sbapp.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(CreateProductRequest createProductRequest){

        Product product = new Product();
        product.setProductId(UUID.randomUUID().toString());
        product.setProductName(createProductRequest.name());
        product.setPrice(createProductRequest.price());
        productRepository.save(product);

    }
}
