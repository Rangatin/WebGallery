package org.webgallery;


import java.util.List;

public interface ImageService {
    /**
     * Retrieve all cars in the catalog.
     * @return all cars
     */
    public List<Image> getAll();

    /**
     * search cars according to keyword in  model and make.
     * @param keyword for search
     * @return list of car that matches the keyword
     */
    public List<Image> search(String keyword);
}
