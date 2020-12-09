package org.acme.repository;

import org.acme.daman.Fruit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/12/9 15:20
 * @Version: v1.0
 * @Modified：
 * @Description:
 */
public interface FruitRepository extends CrudRepository<Fruit, Long>{
    List<Fruit> findByColor(String color);
}
