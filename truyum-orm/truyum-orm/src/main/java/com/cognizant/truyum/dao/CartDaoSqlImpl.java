package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImpl implements CartDao {

	@Override
	public void addCartItem(long userId, long menuItemId) {
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		return null;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
	}

}