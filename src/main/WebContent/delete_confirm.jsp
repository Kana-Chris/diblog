<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>アカウント削除確認画面</title>
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
    
    
    
      <h2 class="title">アカウント削除確認画面</h2>
 	  <div class="confirm">
 	    <s:form>
    
        本当に削除してよろしいですか？
        
        <div class="button">
          <button onclick="submitAction('DeleteAction')">前に戻る</button>
          <button onclick="submitAction('DeleteCompleteAction')"/>削除する</button>
        </div>
        
      </s:form>
      </div>
    <footer>
            
              Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
    
  </body>
</html>
