<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
  <head>
  
    <meta charset="UTF-8">
  　 <title>パスワード変更完了画面</title>
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
    
    <main>
       <h2 class="title">パスワード変更完了画面</h2>
       
       <div class="error">
         <s:if test="result_message=='エラーが発生したためパスワード更新できません。">
           <s:property value="result_message"/>
         </s:if>
       </div>
      
       <div class="message">
          <s:if test="result_message=='パスワードを更新しました。'">
            <s:property value="result_message"/>
          </s:if>
      </div>
      
      <div class="message">
         <form>
            <button onclick="submitAction('HomeAction')">TOPページに戻る</button>
	    </form>
	 </div>
    </main>
    
    <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
  </body>
</html>