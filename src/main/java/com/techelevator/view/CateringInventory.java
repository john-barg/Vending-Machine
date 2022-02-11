package com.techelevator.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CateringInventory {
    private Map<String, CateringItem> cateringInventory;
    public CateringInventory(){
        cateringInventory=FileReader.populateMap();
    }
    public CateringItem getProductByCode(String productCode){
        return cateringInventory.get(productCode);
    }
    public String[] getSortedCodes(){
        String[] sortedCodes = cateringInventory.keySet().toArray(new String[1]);
        Arrays.sort(sortedCodes);
        return sortedCodes;
    }

    public List<CateringItem> getCateringItems() {
        List<CateringItem> itemList = new ArrayList<>();
        for(CateringItem item : cateringInventory.values()) {
            itemList.add(item);
        }
        return itemList;
    }
}
