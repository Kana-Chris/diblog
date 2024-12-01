<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>アカウント更新完了画面</title>
  </head>
  <body>
    <header>
      <div class="Logo"><img src="pic/diblog_logo.jpg"></div>
      <nav class="mainNav">
            <ul>
                <li><a href='<s:url action="HomeAction"/>'>トップ</a></li>
                <li>プロフィール</li>
                <li>D.I.Blogについて</li>
                <li>登録フォーム</li>
                <li>問い合わせ</li>
                <li><a href='<s:url action="RegistAction"/>'>アカウント登録</a></li>
                <li><a href='<s:url action="ListAction"/>'>アカウント一覧</a></li>
            </ul>
      </nav>
    </header>
    <h2 class="title">アカウント更新完了画面</h2>
    
    <div class="confirm">
   
      <s:property value="message"/>
      <div class="button">
        <button onclick="submitAction('HomeAction')">TOPページに戻る</button>
      </div>
    </div>
    <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
  </body>
</html>