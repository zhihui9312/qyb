package com.thinkgem.jeesite.common.utils;


import java.io.Serializable;

public class BaseResponse<T> implements Serializable {


  private static final int CODE_ERROR = 500;
  private static final int CODE_FAIL = 500;
  private static final int CODE_NO_LOGIN = 300;
  private static final int CODE_SUCCESS = 200;
  private int code;
  private T data;
  private String msg;

  public BaseResponse(int code, String msg, T data) {
    this.setCode(code);
    this.setMsg(msg);
    this.setData(data);
  }

  public static <T> BaseResponse<T> badrequest() {
    return new BaseResponse<T>(CODE_FAIL, "no identifier arguments", null);
  }

  public static <T> BaseResponse<T> badrequest(String message) {
    return new BaseResponse<T>(CODE_FAIL, message, null);
  }

  public static <T> BaseResponse<T> badrequest(T data) {
    return new BaseResponse<T>(CODE_FAIL, "no identifier arguments", data);
  }

  public static <T> BaseResponse<T> badrequest(String message, T data) {
    return new BaseResponse<T>(CODE_FAIL, message, data);
  }

  public static <T> BaseResponse<T> error() {
    return new BaseResponse<T>(CODE_ERROR, "fail", null);
  }

  public static <T> BaseResponse<T> error(String message) {
    return new BaseResponse<T>(CODE_ERROR, message, null);
  }

  public static <T> BaseResponse<T> error(T data) {
    return new BaseResponse<T>(CODE_ERROR, "fail", data);
  }

  public static <T> BaseResponse<T> error(String message, T data) {
    return new BaseResponse<T>(CODE_ERROR, message, data);
  }

  public static <T> BaseResponse<T> noLogin(String message) {
    return new BaseResponse<T>(CODE_NO_LOGIN, message, null);
  }

  public static <T> BaseResponse<T> success() {
    return new BaseResponse<T>(CODE_SUCCESS, "success", null);
  }

  public static <T> BaseResponse<T> success(String message) {
    return new BaseResponse<T>(CODE_SUCCESS, message, null);
  }

  public static <T> BaseResponse<T> success(T data) {
    return new BaseResponse<T>(CODE_SUCCESS, "success", data);
  }

  public static <T> BaseResponse<T> success(String message, T data) {
    return new BaseResponse<T>(CODE_SUCCESS, message, data);
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }


}
