<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/5/24
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.3.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>

</head>
<body>
<form action="/addpro.do" method="post" enctype="multipart/form-data">
    <div class="form-group">
        <label for="proName">商品名称</label>
        <input type="text" class="form-control" id="proName" placeholder="商品名称" name="proName">
    </div>
    <div class="form-group">
        <label for="proPrice">商品价格</label>
        <input name="proPrice" type="number" class="form-control" id="proPrice" placeholder="商品价格" max="999999"min="0">
    </div>
    <div class="form-group">
        <label for="proimg">上传商品图片</label>
        <input type="file" id="proimg" name="file1" >
        <p class="help-block">上传一个商品的图片…….</p>
    </div>
    <div class="form-group">
        <label for="prodes">商品描述</label>
        <br/>
        <textarea id ="prodes" placeholder="商品描述"style="width: 100%" name="prodes"></textarea>
    </div>
    <div class="form-group">
        <label for="prostock">商品库存</label>
        <input name="prostock" type="number" class="form-control" id="prostock" placeholder="商品库存"min="0"max="9999">

    </div>
    <div class="form-group">
        <label for="procateid">商品上架日期</label>
        <input name="procateid" type="date" class="form-control" id="procateid" placeholder="商品上架日期">
    </div>
    <div class="form-group">
        <label for="prodate">商品上架日期</label>
        <input name="prodate" type="date" class="form-control" id="prodate" placeholder="商品上架日期">
    </div>
    <div class="form-group">
        <label for="profac">商品生产厂家</label>
        <input name="profac" type="text" class="form-control" id="profac" placeholder="生产厂家">
    </div>

    <button type="button" class="btn btn-success">确认提交</button>
</form>
</body>
</html>
