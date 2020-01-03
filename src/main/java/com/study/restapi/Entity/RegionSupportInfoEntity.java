package com.study.restapi.Entity;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class RegionSupportInfoEntity {

    private Integer id;
    private String region;
//    private String regionCode;
    private String target;
    private String usage;
    private String limit;
    private String rate;
    private String institute;
    private String mgmt;
    private String reception;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

}
