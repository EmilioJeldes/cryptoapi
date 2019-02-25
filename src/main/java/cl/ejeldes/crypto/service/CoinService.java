package cl.ejeldes.crypto.service;

import cl.ejeldes.crypto.entity.Coin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by emilio on Jan 18, 2019
 */
public interface CoinService {

    /**
     * This method gets all the coins in a list from the database
     *
     * @return a List of Coins
     */
    List<Coin> findAll();

    /**
     * This method gets a specific amount of numbers from the api
     *
     * @param pageable range of pages
     * @return A list of coins
     */
    Page<Coin> findAll(Pageable pageable);

    /**
     * This method returns a Coin that matches the specific name passed
     *
     * @param name of the coin
     * @return Coin Representation
     */
    Coin findByName(String name);

    /**
     * This method returns a Coin that matches de id
     *
     * @param id of the coin
     * @return a Coin representation
     */
    Coin findById(String id);

    /**
     * This method exposes the total of coins in the database
     *
     * @return total of coins
     */
    long count();
}
