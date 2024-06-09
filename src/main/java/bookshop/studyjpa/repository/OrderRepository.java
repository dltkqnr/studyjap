package bookshop.studyjpa.repository;

import bookshop.studyjpa.domain.Member;
import bookshop.studyjpa.domain.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id){
        return em.find(Order.class, id);
    }


}
