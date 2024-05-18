package com.reysl.shopinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getShopItemId(shopItemId: Int): ShopItem
}