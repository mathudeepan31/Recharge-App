package com.hash.tag.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class EnquiryRequest {
    private Long eid;
    private String email;
    private String network;
    private String enquiryDescription; 

}