package co.istad.chhaya.fswd_sbapp.repository;

import co.istad.chhaya.fswd_sbapp.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, String> {

}
