//ajax返回信息验证
var ajaxResultVerification= function (result) {
    switch (result) {
        case "success":
            toastr.success("操作成功！");
            break;
        case "error":
            toastr.error("操作失败！服务器错误");
            break;
        case "dataError":
            toastr.warning("请正确填写相关信息！");
            break;
        case "IDrepeat":
            toastr.warning("ID已存在！");
            break;
        default:
            toastr.error("操作异常！");
            break;
    }}