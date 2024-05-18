package com.reysl.shopinglist.domain

class GetShopItemListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}