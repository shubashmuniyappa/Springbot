package com.sawal.farm.mapper;

import com.sawal.farm.dto.CartDTO;
import com.sawal.farm.dto.CartItemsDTO;
import com.sawal.farm.model.Cart;
import com.sawal.farm.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "userId", source = "user.id")
    CartDTO toDTO(Cart cart);

    @Mapping(target = "user.id", source = "userId")
    Cart toEntity(CartDTO cartDTO);

    @Mapping(target = "productId", source = "product.id")
    CartItemsDTO toDTO(CartItem cartItem);

    @Mapping(target = "product.id", source = "productId")
    CartItem toEntity(CartItemsDTO cartItemDTO);
}