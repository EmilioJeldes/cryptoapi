package cl.ejeldes.crypto.repository;

import cl.ejeldes.crypto.entity.Coin;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by emilio on Jan 18, 2019
 */
public interface CoinRepository extends MongoRepository<Coin, String> {

    Coin findByNombre(String name);
}
