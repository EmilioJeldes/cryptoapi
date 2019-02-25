package cl.ejeldes.crypto.controller;

import cl.ejeldes.crypto.entity.Coin;
import cl.ejeldes.crypto.service.CoinService;
import io.swagger.annotations.Api;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by emilio on Jan 18, 2019
 */
@Api(tags = "Coins Resource")
@RestController
@RequestMapping("/api/coins")
@CrossOrigin
public class CoinController {

    private CoinService coinService;

    public CoinController(CoinService coinService) {this.coinService = coinService;}

    @GetMapping
    public List<Coin> getAllCoins() {
        return coinService.findAll();
    }

    @RequestMapping(value = "/page", params = {"page", "size"}, method = RequestMethod.GET)
    public List<Coin> getCoinsByPage(@RequestParam("page") int page, @RequestParam("size") int size) {
        Pageable pageRequest = PageRequest.of(page, size);

        return coinService.findAll(pageRequest).getContent();
    }

    @GetMapping("/{name}")
    public Coin getCoinByName(@PathVariable("name") String name) {
        return coinService.findByName(name);
    }

    @GetMapping("/{id}")
    public Coin getCoinById(@PathVariable("id") String id) {
        return coinService.findById(id);
    }

    @GetMapping("/count")
    public Map<String, Long> getTotalOfCoins() {
        Map<String, Long> result = new HashMap<>();
        result.put("size", coinService.count());

        return result;
    }

}
