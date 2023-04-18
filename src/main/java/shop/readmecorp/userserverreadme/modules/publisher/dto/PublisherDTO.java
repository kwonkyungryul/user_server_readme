package shop.readmecorp.userserverreadme.modules.publisher.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import shop.readmecorp.userserverreadme.common.ValueOfEnum;
import shop.readmecorp.userserverreadme.common.jpa.RoleType;
import shop.readmecorp.userserverreadme.modules.publisher.entity.Publisher;
import shop.readmecorp.userserverreadme.modules.publisher.enums.PublisherStatus;
import shop.readmecorp.userserverreadme.util.DateTimeConverter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PublisherDTO {

    @NotNull
    private Integer id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String role;

    @NotBlank
    private String businessNumber;

    @NotBlank
    private String businessName;

    @NotBlank
    private String joinTime;

    @NotBlank
    private String status;


    public Publisher toEntity() {
        return Publisher.builder()
                .id(id)
                .username(username)
                .password(password)
                .role(RoleType.valueOf(role))
                .businessNumber(businessNumber)
                .businessName(businessName)
                .joinTime(DateTimeConverter.stringToLocalDateTime(joinTime))
                .status(PublisherStatus.valueOf(status))
                .build();
    }
}