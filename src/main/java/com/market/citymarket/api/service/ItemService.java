package com.market.citymarket.api.service;

import com.market.citymarket.api.entity.ItemEntity;
import com.market.citymarket.api.model.Item;
import java.util.List;


public interface ItemService {

  ItemEntity toEntity(Item m);

  List<ItemEntity> toEntityList(List<Item> items);

  Item toModel(ItemEntity e);

  List<Item> toModelList(List<ItemEntity> items);
}
