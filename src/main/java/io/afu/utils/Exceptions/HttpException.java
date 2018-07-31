package io.afu.utils.Exceptions;

/**
 * Created By: rffan
 * At Time: 2018/7/31
 */
public class HttpException extends BaseException {

    private static final long serialVersionUID = -699741520432411329L;

    private Integer status_code;

    public HttpException(){
        super();
    }

    public HttpException(Integer status_code){
        super();
        this.status_code = status_code;
    }

    public HttpException(Integer code,String msg){
        super(code,msg);
    }

    public HttpException(Integer code,Integer status_code,String msg){
        super(code,msg);
        this.status_code = status_code;
    }


    public Integer getStatus_code() {
        return status_code;
    }

    public void setStatus_code(Integer status_code) {
        this.status_code = status_code;
    }
}
