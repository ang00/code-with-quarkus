package org.acme.repository;

import org.acme.daman.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/12/9 10:40
 * @Version: v1.0
 * @Modified：
 * @Description:
 */
public interface BookRepository extends CrudRepository<Book, Integer> {
}
