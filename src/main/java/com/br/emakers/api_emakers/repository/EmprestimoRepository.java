package com.br.emakers.api_emakers.repository;

import com.br.emakers.api_emakers.data.entity.Emprestimo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends PagingAndSortingRepository<Emprestimo, Long> {
}
