<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>学生信息列表</title>
    <%@include file="common/head.jsp" %>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>学生列表</h2>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>学生ID</th>
                    <th>名称</th>
                    <th>学生班级</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${students}" var="student">
                    <tr>
                        <td>${student.studentId}</td>
                        <td>${student.studentName}</td>
                        <td>${student.studentClass}</td>
                        <td><a class="btn btn-info"
                               href="${pageContext.request.contextPath }/ssm-crud/${student.studentId}/detail"
                               target="_blank">详情</a></td>
                        <td><a class="btn btn-info"
                               href="${pageContext.request.contextPath }/ssm-crud/${student.studentId}/delete"
                               target="_blank">删除</a></td>
                    </tr>
                </c:forEach>
                <tr>
                    <form action="${pageContext.request.contextPath }/ssm-crud/add" method="post"
                          accept-charset="UTF-8">
                        学生姓名：
                        <input type="text" name="studentName"/>
                        <br/>
                        学生班级：
                        <input type="text" name="studentClass"/>
                        <br/>
                        <button type="submit" class="btn btn-info">添加</button>
                    </form>
                </tr>
                </tbody>
            </table>

        </div>
    </div>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>