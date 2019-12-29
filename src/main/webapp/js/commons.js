
var _asyncFlag = true;
var _data;
var _successCallBack;
var _failCallBack;

/**
 *
 *   暂时作废   暂时作废   暂时作废  暂时作废
 * @param url
 * @param data
 * @param flag
 * @param successCallBack
 * @param failCallBack
 * @constructor
 */
function AjaxRequestByPost(url,data,flag,successCallBack,failCallBack) {
    if(null != flag){
        _asyncFlag = flag;
    }
    $.ajax(url,
        // 发送请求的URL字符串
        {
            dataType: "json",
            type: "post",
            contentType: "application/json",
            data: JSON.stringify(data),
            async: _asyncFlag,
            success: successCallBack,
            error: failCallBack
        });
}