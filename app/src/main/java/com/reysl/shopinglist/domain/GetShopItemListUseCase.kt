package com.reysl.shopinglist.domain

import androidx.lifecycle.LiveData

class GetShopItemListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}