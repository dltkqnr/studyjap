package bookshop.studyjpa.domain;

import bookshop.studyjpa.domain.item.Item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "order_item")
@Getter @Setter
@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_Item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;
    private int count;

}
