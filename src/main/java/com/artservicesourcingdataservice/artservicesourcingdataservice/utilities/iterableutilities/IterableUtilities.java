package com.artservicesourcingdataservice.artservicesourcingdataservice.utilities.iterableutilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Utilities class for all functionality around using Iterables.
 */
public class IterableUtilities {

    /**
     * Used to convert an iterable of one type into a list of another type (under the restriction
     * that the iterable is a subclass of the list type).
     *
     * @param iterable The iterable to convert to a list
     * @param <ListType> The type of list we want to return
     * @param <IterableType> The type of iterable we are accepting (must be a subclass of list type)
     * @return A list containing the same elements as the iterable
     */
    public <ListType, IterableType extends ListType> List<ListType> convertIterableToArrayList(Iterable<IterableType> iterable) {

        List<ListType> list = new ArrayList<>();
        iterable.forEach(list::add);
        return list;

    }

}
