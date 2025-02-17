package com.green.greengram.feed.model;

import com.green.greengram.common.model.Paging;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.BindParam;

import java.beans.ConstructorProperties;

@Slf4j
@Getter
@ToString(callSuper = true)
public class FeedGetReq extends Paging {
    @Schema(title = "로그인 유저 PK", name="signed_user_id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private long signedUserId;

    @ConstructorProperties({"page", "size", "signed_user_id"})
    public FeedGetReq(Integer page, Integer size, @BindParam("signed_user_id") long signedUserId) {
        super(page, size);
        this.signedUserId = signedUserId;
    }
}