package com.cadastra.cep.response;

import lombok.Data;
import java.util.List;
import io.swagger.annotations.ApiModel;

@ApiModel(value="ListZipCodeResponse", description="ListZipCodeResponse")
@Data
public class ResponseData {
    private List<ZipCodeResponse> data;
}
