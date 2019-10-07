<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>学生信息详情页</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <%@include file="common/head.jsp" %>
</head>
<body>
<div class="container">
    <div class="panel panel-default text-center">
        <div class="panel-heading text-center">
            <h2>学生详情页</h2>
        </div>
        <div class="panel-body">
            <form action="${pageContext.request.contextPath }/ssm-crud/update" method="post" accept-charset="UTF-8">
                学生ID：
                <input type="text" name="studentId" value="${student.studentId}"/>
                <br/>
                学生姓名：
                <input type="text" name="studentName" value="${student.studentName}"/>
                <br/>
                学生班级：
                <input type="text" name="studentClass" value="${student.studentClass}"/>
                <br/>
                <button type="submit" class="btn btn-info">提交</button>
            </form>
        </div>
    </div>
</div>
<%--jQery文件,务必在bootstrap.min.js之前引入--%>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>