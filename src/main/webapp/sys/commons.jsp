<%--
  Created by IntelliJ IDEA.
  User: guohongming
  Date: 2019/12/29
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

 <script type="text/javascript" src="${pageContext.request.contextPath }/js/json2.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
    var _asyncFlag = true;
    var _data;
    var _successCallBack;
    var _failCallBack;
    var _way="post";

    /**
     *  ajax进行json数据传输
     * @param url 值为@RequestMapping("/json")中json
     * @param data 传入后台参数
     * @param flag true为异步模式 false为同步，默认异步
     * @param successCallBack 处理成功回调函数
     * @param failCallBack   处理失败回调函数
     * @param way 请求方式get或者Post,默认为post
     * @constructor
     */
    function AjaxRequestByPost(url,data,flag,successCallBack,failCallBack,way) {
        if(null != flag){
            _asyncFlag = flag;
        }
        if(null != way)
        {
            _way = way;
        }
        _data = data;
        _successCallBack = successCallBack;
        _failCallBack = failCallBack;
        $.ajax("${pageContext.request.contextPath}/"+url,
            // 发送请求的URL字符串
            {
                dataType: "json",
                type: _way,
                contentType: "application/json",
                data: JSON.stringify(_data),
                async: _asyncFlag,
                success: _successCallBack,
                error: _failCallBack
            });
    }
</script>

