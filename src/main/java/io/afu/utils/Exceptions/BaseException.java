package io.afu.utils.Exceptions;

/**
 * 自定义基础错误类
 */
public class BaseException extends Exception {

    private static final long serialVersionUID = -699741520432411324L;

    private Integer code;
    private String msg;

    public BaseException(){
        super();
    }

    public BaseException(Integer code,String msg){
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public BaseException(Throwable cause){
        super(cause);
    }

    public BaseException(Integer code,String msg,Throwable cause){
        super(msg,cause);
        this.msg = msg;
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
