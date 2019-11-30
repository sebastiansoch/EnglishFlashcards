<%-- 
    Document   : questionandanswer
    Created on : 2019-11-30, 09:23:46
    Author     : ssoch
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Question: ${question}</h1>
        <h1>Answer: ${answer}</h1>

        <c:set var="btnText" value="${button_text}" />
        <c:choose>
            <c:when test="${btnText.equals('Answer')}">
                <button type="submit" autofocus onclick="window.location.href='./showAnswer'">Show Answer</button>
            </c:when>
            <c:otherwise>
                <button type="button" autofocus onclick="window.location.href='./showQuestion'">Next Question</button>
            </c:otherwise>
        </c:choose>

    </body>
</html>
