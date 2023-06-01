package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//UserRepository接口提供了一些默认的定义数据访问方法
//JpaRepository是Spring Data JPA提供的一个接口，它提供了一些默认的定义数据访问方法，例如保存实体、查询实体、删除实体等。通过继承JpaRepository接口，我们可以方便地使用这些方法来处理与用户实体相关的数据库操作。

//在UserRepository接口中，除了继承JpaRepository<User, Long>，还定义了一个自定义查询方法findByTelephone。这个方法用于根据电话号码查询用户信息，并返回对应的用户实体对象。
public interface UserRepository extends JpaRepository<User, Long> {
    User findByTelephone(String telephone);
}
