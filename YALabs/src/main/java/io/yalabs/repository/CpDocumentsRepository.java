package io.yalabs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.yalabs.model.CpDocuments;


public interface CpDocumentsRepository extends CrudRepository<CpDocuments,String> {
	@Query(value = "select * from cp_documents where id=?1", nativeQuery = true)
	public CpDocuments findDetailById(int id);

	@Query(value = "delete from cp_document where id=?1", nativeQuery = true)
	public void deleteDetailById(int id);
}
