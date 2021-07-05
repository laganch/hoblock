package com.locker.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.locker.model.Hoblocker;

public interface hoblockerRepo extends JpaRepository<Hoblocker, Long> {

}
