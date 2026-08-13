package com.sub.nit.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sub.nit.mockito.entity.Item;
import com.sub.nit.mockito.repository.ItemRepository;
import com.sub.nit.mockito.service.ItemServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {

    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemServiceImpl itemService;

    private Item item;

    @BeforeEach
    void setUp() {

        item = new Item();

        item.setId(1L);
        item.setName("Laptop");
        item.setPrice(50000);
    }

    // 1. SAVE ITEM
    @Test
    void testSaveItem() {

        when(itemRepository.save(item)).thenReturn(item);

        Item result = itemService.saveItem(item);

        assertNotNull(result);
        assertEquals("Laptop", result.getName());
        assertEquals(50000, result.getPrice());

        verify(itemRepository).save(item);
    }

    // 2. GET ITEM BY ID
    @Test
    void testGetItemById() {

        when(itemRepository.findById(1L))
                .thenReturn(Optional.of(item));

        Item result = itemService.getItemById(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("Laptop", result.getName());
        assertEquals(50000, result.getPrice());

        verify(itemRepository).findById(1L);
    }

    // 3. GET ALL ITEMS
    @Test
    void testGetAllItems() {

        Item item2 = new Item();

        item2.setId(2L);
        item2.setName("Mobile");
        item2.setPrice(20000);

        List<Item> items = Arrays.asList(item, item2);

        when(itemRepository.findAll()).thenReturn(items);

        List<Item> result = itemService.getAllItems();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Laptop", result.get(0).getName());
        assertEquals("Mobile", result.get(1).getName());

        verify(itemRepository).findAll();
    }

    // 4. UPDATE ITEM
    @Test
    void testUpdateItem() {

        Item updatedItem = new Item();

        updatedItem.setName("Gaming Laptop");
        updatedItem.setPrice(80000);

        when(itemRepository.findById(1L))
                .thenReturn(Optional.of(item));

        when(itemRepository.save(item))
                .thenReturn(item);

        Item result = itemService.updateItem(1L, updatedItem);

        assertNotNull(result);
        assertEquals("Gaming Laptop", result.getName());
        assertEquals(80000, result.getPrice());

        verify(itemRepository).findById(1L);
        verify(itemRepository).save(item);
    }

    // 5. DELETE ITEM
    @Test
    void testDeleteItem() {

        itemService.deleteItem(1L);

        verify(itemRepository).deleteById(1L);
    }
}
