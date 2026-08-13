package com.sub.nit.mockito.service;

import java.util.List;

import com.sub.nit.mockito.entity.Item;

public interface ItemService {

   public Item saveItem(Item item);

   public Item getItemById(Long id);

   public List<Item> getAllItems();

   public Item updateItem(Long id, Item item);

   public void deleteItem(Long id);
}
