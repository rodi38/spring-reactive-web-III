package tech.ada.mercado.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import tech.ada.mercado.model.Mercado;

public interface MercadoRepository extends MongoRepository<Mercado, String> {
}
