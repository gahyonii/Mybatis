package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface ProductDAO {

   List<ProductDTO> selectAllProductList();

   List<ProductDTO> selectProductByCondition(SearchCondition searchCondition);

   int insertProduct(ProductDTO Product);

   int updateProduct(ProductDTO product);

   int deleteProduct(Map<String, String> parameter);



}
