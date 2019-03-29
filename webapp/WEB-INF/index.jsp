<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/3/26
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="/WEB-INF/c.tld" %>
<html>
<head>
    <title>$分页实现$</title>
</head>
<body>
<%-- 构建分页导航 --%>
共有${requestScope.pageBean.totalRecord}个员工，共${requestScope.pageBean.totalPage }页，当前为${requestScope.pageBean.pageNum}页
<br/>
<a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=1">首页</a>
<%--如果当前页为第一页时，就没有上一页这个超链接显示 --%>
<c:if test="${requestScope.pageBean.pageNum ==1}">
    <c:forEach begin="${requestScope.pageBean.start}" end="${requestScope.pageBean.end}" step="1" var="i">
        <c:if test="${requestScope.pageBean.pageNum == i}">
            ${i}
        </c:if>
        <c:if test="${requestScope.pageBean.pageNum != i}">
            <a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=${i}">${i}</a>
        </c:if>
    </c:forEach>
    <a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=${requestScope.pageBean.pageNum+1}">下一页</a>
</c:if>

<%--如果当前页不是第一页也不是最后一页，则有上一页和下一页这个超链接显示 --%>
<c:if test="${requestScope.pageBean.pageNum > 1 && requestScope.pageBean.pageNum < requestScope.pageBean.totalPage}">
    <a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=${requestScope.pageBean.pageNum-1}">上一页</a>
    <c:forEach begin="${requestScope.pageBean.start}" end="${requestScope.pageBean.end}" step="1" var="i">
        <c:if test="${requestScope.pageBean.pageNum == i}">
            ${i}
        </c:if>
        <c:if test="${requestScope.pageBean.pageNum != i}">
            <a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=${i}">${i}</a>
        </c:if>
    </c:forEach>
    <a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=${requestScope.pageBean.pageNum+1}">下一页</a>
</c:if>

<%-- 如果当前页是最后一页，则只有上一页这个超链接显示，下一页没有 --%>
<c:if test="${requestScope.pageBean.pageNum == requestScope.pageBean.totalPage}">
    <a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=${requestScope.pageBean.pageNum-1}">上一页</a>
    <c:forEach begin="${requestScope.pageBean.start}" end="${requestScope.pageBean.end}" step="1" var="i">
        <c:if test="${requestScope.pageBean.pageNum == i}">
            ${i}
        </c:if>
        <c:if test="${requestScope.pageBean.pageNum != i}">
            <a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=${i}">${i}</a>
        </c:if>
    </c:forEach>
</c:if>
<%--尾页 --%>
<a href="${pageContext.request.contextPath}/FindAllWithPage?pageNum=${requestScope.pageBean.totalPage}">尾页</a>
</body>
</html>
