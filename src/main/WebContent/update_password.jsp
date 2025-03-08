<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
      <title>パスワード変更画面</title>
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
        <div class="regist">
	      <h2 class="title">パスワード変更画面</h2>
	     
	      <form action="PasswordConfirmAction">
	      <table class="regist">
	        <tr>
	          <td>新しいパスワード</td>
	          <td><input type="text" name="password" value='<s:property value="password"/>'
		      pattern="^[0-9A-Za-z]+$" maxlength="10" title="半角英数字で入力してください"/></td>
	       </tr>
	       <s:if test='emptycheck=="1"'>
	         <tr>
	           <td colspan="2">
	             <p class="red">
	             新しいパスワードを入力してください。
	             </p>
	           </td>
	         </tr>
	       </s:if>
	       <tr>
	         <td colspan="2">
	         <input type="hidden" value="<s:property value='updateId'/>" name="updateId"/>
		     <input type="submit" value="確認する"/>
		     </td>
		   </tr>
		  </table>
		    
		  </form>
		</div>
     </main>
	  
    <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
  </body>
   

</html>