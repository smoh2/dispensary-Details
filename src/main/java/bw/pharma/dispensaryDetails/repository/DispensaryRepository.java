package bw.pharma.dispensaryDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bw.pharma.dispensaryDetails.entity.DispensaryEntity;

@Repository
public interface DispensaryRepository extends JpaRepository<DispensaryEntity, String> {
	
	public boolean existsByDispNameAndDispLocation(String dispName, String dispLocation);
	public boolean existsByDispName(String dispName);

}
