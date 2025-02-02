package acc.br.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import acc.br.contatos.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
