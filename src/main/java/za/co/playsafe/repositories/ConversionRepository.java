package za.co.playsafe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import za.co.playsafe.entities.Conversion;

@Repository
public interface ConversionRepository extends JpaRepository<Conversion, Long> {

}
