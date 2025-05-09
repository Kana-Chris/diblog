<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
  　　<meta charset="UTF-8">
  　　<title>登録完了画面</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" ></script>
    <script type="text/javascript">
    function submitAction(url){
        $('form').attr('action',url);
        $('form').submit();
    }
    </script>
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
                 　<s:if test='#session.authority.equals("1")'>  <!-- アカウント権限が一般(0)なら非表示、管理者(1)なら表示 -->
                    <li><a href='<s:url action="RegistAction"/>'>アカウント登録</a></li>
                    <li><a href='<s:url action="ListAction"/>'>アカウント一覧</a></li>
                 　</s:if>
                </ul>
            </nav>
    </header>
    
    <main>
      <div class="message">
      <s:if test="messageFlg==0">
      <h2 class="font_red">
      <s:property value="resultMessage"/>
      </h2>
     
      </s:if>
      
      <s:if test="messageFlg==1">
        <span style="color:red">
          <h2 class="font_red"><s:property value="resultMessage"/></h2>
        </span>
      </s:if>
      
      <s:form>
        <button onclick="submitAction('HomeAction')">TOPに戻る</button>
      </s:form>   
      </div>
    </main>
    
    
    <footer class="bottom">
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
  </body>
</html>