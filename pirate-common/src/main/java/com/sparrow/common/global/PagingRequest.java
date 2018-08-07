package com.sparrow.common.global;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 分页信息接收实体
 *
 * @author : zhaipuhong
 * @date : 2017/9/13
 */
@Data
public class PagingRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "起始页", name = "offset")
    private int offset;
    @ApiModelProperty(value = "页数", name = "limit")
    private int limit;


    public PagingRequest() {
        this(GlobalConstant.DEFAULT_PAGE_NUM, GlobalConstant.DEFAULT_PAGE_SIZE);
    }

    public PagingRequest(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

}
