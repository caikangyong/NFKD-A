package com.cclinux.framework.core.mapper;

import cn.hutool.core.util.StrUtil;
import com.github.yulichang.wrapper.MPJLambdaWrapper;


public class WhereJoin<T> extends MPJLambdaWrapper<T> {

    /**
     * 前端直接传来排序字段
     */
    public MPJLambdaWrapper<T> fmtOrderBySort(String sortVal, String defaultSort) {
        if (StrUtil.contains(sortVal,"|")) {
            String[] arr = sortVal.split("\\|");

            if (arr[1].equals("desc"))
                return this.orderByDesc(arr[0]);
            else
                    return this.orderByAsc(arr[0]);

        }
        else if (StrUtil.isNotEmpty(defaultSort)){
            return this.orderByDesc(defaultSort);
        }

        return this.typedThis;
    }
}
