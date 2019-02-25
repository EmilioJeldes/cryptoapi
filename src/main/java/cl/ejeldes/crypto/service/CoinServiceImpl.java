package cl.ejeldes.crypto.service;

import cl.ejeldes.crypto.entity.Coin;
import cl.ejeldes.crypto.repository.CoinRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by emilio on Jan 18, 2019
 */
@Service
public class CoinServiceImpl implements CoinService {

    private CoinRepository coinRepository;

    public CoinServiceImpl(CoinRepository coinRepository) {this.coinRepository = coinRepository;}

    @Override
    public List<Coin> findAll() {
        return coinRepository.findAll();
    }

    @Override
    public Page<Coin> findAll(Pageable pageable) {
        return coinRepository.findAll(pageable);
    }

    @Override
    public Coin findByName(String name) {
        return coinRepository.findByNombre(name);
    }

    @Override
    public Coin findById(String id) {
        Optional<Coin> optional = coinRepository.findById(id);
        return optional.orElseGet(Coin::new);
    }

    @Override
    public long count() {
        return coinRepository.count();
    }
}
