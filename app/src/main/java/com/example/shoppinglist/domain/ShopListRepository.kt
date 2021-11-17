package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

   suspend fun addShopItem(shopItem: ShopItem)

   suspend fun editShopItem(shopItem: ShopItem)

   suspend fun getShopItemById(shopItemId: Int): ShopItem?

   fun getShopList(): LiveData<List<ShopItem>>

   suspend fun removeShopItem(shopItem: ShopItem)
}