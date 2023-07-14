package net.fiscma.wazenhof.warzenhofbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T,ID> extends JpaRepository<T, ID> {

}
