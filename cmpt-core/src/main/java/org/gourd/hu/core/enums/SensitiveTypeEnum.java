package org.gourd.hu.core.enums;

import com.alibaba.fastjson.annotation.JSONType;

/**
 * 脱敏类型枚举类
 * @author gourd
 */
@JSONType(serializeEnumAsJavaBean = true)
public enum SensitiveTypeEnum {
  /**
   * 中文名
   */
  CHINESE_NAME,
 
  /**
   * 身份证号
   */
  ID_CARD,
  /**
   * 座机号
   */
  FIXED_PHONE,
  /**
   * 手机号
   */
  MOBILE_PHONE,
  /**
   * 地址
   */
  ADDRESS,
  /**
   * 电子邮件
   */
  EMAIL,
  /**
   * 银行卡
   */
  BANK_CARD,
  /**
   * 公司开户银行联号
   */
  CNAPS_CODE
}