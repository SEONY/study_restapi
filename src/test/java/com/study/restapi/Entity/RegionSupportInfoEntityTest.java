package com.study.restapi.Entity;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class RegionSupportInfoEntityTest {

    /*
     * builder가 동작하는지 확인하기 위한 테스트
     */
    @Test
    public void builder() {

        RegionSupportInfoEntity regionSupportInfoEntity;

        regionSupportInfoEntity = RegionSupportInfoEntity.builder()
                .region("강릉")
                .target("강릉시 소재 중소기업으로서 강릉시장이 추천한 자")
                .usage("운전")
                .limit("추천금액 이내")
                .rate("3.00%")
                .institute("강릉시")
                .mgmt("강릉지점")
                .reception("강릉시 소재 영업")
                .build();

        assertThat(regionSupportInfoEntity).isNotNull();

    }

    /*
     * Java Bean 스펙 준수하는지 확인하기 위한 테스트
     *    - default 생성자, getter, setter로 만들 수 있는지 확인
     */
    @Test
    public void javaBean() {

        String region = "강릉시";
        String target = "강릉시 소재 중소기업으로서 강릉시장이 추천한 자";
        String usage = "운전";
        String limit = "추천금액 이내";
        String rate = "3.00%";
        String institute = "강릉시";
        String mgmt = "강릉지점";
        String reception = "강릉시 소재 영업";

        // Given
        RegionSupportInfoEntity regionSupportInfoEntity = new RegionSupportInfoEntity();

        // When
        regionSupportInfoEntity.setRegion(region);
        regionSupportInfoEntity.setTarget(target);
        regionSupportInfoEntity.setUsage(usage);
        regionSupportInfoEntity.setLimit(limit);
        regionSupportInfoEntity.setRate(rate);
        regionSupportInfoEntity.setInstitute(institute);
        regionSupportInfoEntity.setMgmt(mgmt);
        regionSupportInfoEntity.setReception(reception);

        // Then
        assertThat(regionSupportInfoEntity.getRegion()).isEqualTo(region);
        assertThat(regionSupportInfoEntity.getTarget()).isEqualTo(target);
        assertThat(regionSupportInfoEntity.getUsage()).isEqualTo(usage);
        assertThat(regionSupportInfoEntity.getLimit()).isEqualTo(limit);
        assertThat(regionSupportInfoEntity.getRate()).isEqualTo(rate);
        assertThat(regionSupportInfoEntity.getInstitute()).isEqualTo(institute);
        assertThat(regionSupportInfoEntity.getMgmt()).isEqualTo(mgmt);
        assertThat(regionSupportInfoEntity.getReception()).isEqualTo(reception);
    }
}