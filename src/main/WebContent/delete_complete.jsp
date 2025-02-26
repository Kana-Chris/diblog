<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>アカウント削除完了画面</title>
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
                    <li><a href='<s:url action="RegistAction"/>'>アカウント登録</a></li>
                    <li><a href='<s:url action="ListAction"/>'>アカウント一覧</a></li>
                </ul>
            </nav>
    </header>
    <h2 class="title">アカウント削除完了画面</h2>
    
    <div class="confirm">
      <s:property value="message"/>
      
            <div class="error">
		   	  <s:if test='message=="エラーが発生したためアカウント削除できません。"'>
		        <s:property value="message"/> 
		      </s:if>
		    </div>
		    <div class="message">  
		      <s:if test='message=="更新完了しました"'>
		         <s:property value="message"/>
		      </s:if>
		    </div>
      
     <form>
       <button onclick="submitAction('HomeAction')">TOPページに戻る</button>
    </form>
  
    </div>
    
    <footer>
            
              Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
    
    
  </body>
</html>