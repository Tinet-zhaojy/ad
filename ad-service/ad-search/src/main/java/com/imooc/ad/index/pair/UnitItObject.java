package com.imooc.ad.index.pair;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Seven
 * @date 2019/10/20 0:07
 * @description 推广单元の兴趣的索引对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnitItObject {

    private Long unitId;
    private String itTag;

}
