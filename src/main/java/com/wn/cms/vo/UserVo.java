package com.wn.cms.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo<T> {
    private int code;
    private String msg;
    private long count;
    private List<T> data;
}
