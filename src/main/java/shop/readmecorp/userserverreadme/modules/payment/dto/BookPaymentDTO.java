package shop.readmecorp.userserverreadme.modules.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.readmecorp.userserverreadme.modules.book.dto.BookDTO;
import shop.readmecorp.userserverreadme.modules.card.entity.Card;
import shop.readmecorp.userserverreadme.modules.user.dto.UserDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookPaymentDTO {

    private Integer id;

    private UserDTO user;

    private BookDTO book;

    private Integer price;

    private Card card;

    private String paymentTime;

    private String status;

}
