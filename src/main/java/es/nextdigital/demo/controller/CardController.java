package es.nextdigital.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.nextdigital.demo.entity.Card;
import es.nextdigital.demo.service.CardService;

@RestController
@RequestMapping("/api/cards")
public class CardController {
    @Autowired
    private CardService cardService;

    @PutMapping("/{id}/activate")
    public Card activateCard(@PathVariable Long id) {
        return cardService.activateCard(id);
    }

    @PutMapping("/{id}/pin")
    public Card changePin(@PathVariable Long id, @RequestBody String newPin) {
        return cardService.changePin(id, newPin);
    }

    @PutMapping("/{id}/limit")
    public Card updateCardLimit(@PathVariable Long id, @RequestBody double newLimit) {
        return cardService.updateCardLimit(id, newLimit);
    }
}

