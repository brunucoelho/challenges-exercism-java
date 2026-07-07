package main.java.br.com.easy.au_GottaSnatchEmAll;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {
    
    static Set<String> newCollection(List<String> cards) {
        Set<String> newCards = Set.copyOf(cards);
        return newCards;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) { 
        if (myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection))
            return false;
        return true;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> collectionCards = new HashSet<>(collections.get(0));
        Set<String> collectionCardsOne = collections.get(0);
        if (collections.size() == 1)
          return collectionCardsOne;
        for (Set<String> card: collections) {
            collectionCards.retainAll(card);
        }
        return collectionCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> collectionCards = new HashSet<>();
        for (Set<String> card: collections) {
            collectionCards.addAll(card);
        }
        return collectionCards;
    }
}