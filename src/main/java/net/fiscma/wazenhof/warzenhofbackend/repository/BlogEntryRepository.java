package net.fiscma.wazenhof.warzenhofbackend.repository;

import net.fiscma.wazenhof.warzenhofbackend.model.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogEntryRepository extends JpaRepository<BlogEntry, Long> {

}