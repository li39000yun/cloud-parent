package com.tz4cloud.tz.laboratory.dto;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.util.List;

@Data
public class OvalDTO implements Serializable {
    private static final long serialVersionUID = -6165001330649484325L;

    /**
     * 单据号
     */
    @NotEmpty(message = "申请单号不能为空2")
    @NotBlank(message = "不能为空2")
    @NotNull(message = "不能为空2！",profiles = {"TDEC","MEAN"})
    private String appCode2;

    /**
     * 单据号
     */
    @NotEmpty(message = "申请单号不能为空")
    @NotBlank(message = "不能为空")
    @NotNull(message = "不能为空！",profiles = {"TDEC"})
    private String appCode;

    public static void main(String[] args) {
        System.out.println("begin");
        OvalDTO ovalDTO = new OvalDTO();
        Validator validator = new Validator();
        List<ConstraintViolation> violations = validator.validate(ovalDTO);
        if (CollUtil.isNotEmpty(violations)) {
            for (ConstraintViolation violation : violations) {
                System.out.println(violation.getMessage());
            }
        }
        System.out.println("end");
    }
}
