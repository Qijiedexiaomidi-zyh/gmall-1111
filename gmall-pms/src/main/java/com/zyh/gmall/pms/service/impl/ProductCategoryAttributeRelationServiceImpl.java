package com.zyh.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyh.gmall.pms.entity.ProductCategoryAttributeRelation;
import com.zyh.gmall.pms.mapper.ProductCategoryAttributeRelationMapper;
import com.zyh.gmall.pms.service.ProductCategoryAttributeRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-18
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelation> implements ProductCategoryAttributeRelationService {

}
