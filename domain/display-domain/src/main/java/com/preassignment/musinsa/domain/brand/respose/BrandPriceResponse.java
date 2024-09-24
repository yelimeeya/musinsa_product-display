package com.preassignment.musinsa.domain.brand.respose;

import com.preassignment.musinsa.domain.product.Product;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BrandPriceResponse {
  private String brand;
  private List<Product> categories;
  private String totalPrice;
}
