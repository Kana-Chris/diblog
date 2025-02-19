<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
  <head>
  
  <meta charset="UTF-8">
  <title>パスワード変更確認画面</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
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
       <div>
         
           <table>
             <tr>
               <td>
               パスワードを下記に変更します。
               </td>
               <td>
               <s:property value="password"/>
               </td>
             </tr>
             
             <tr>
               <td>
               <s:form action="UpdatePasswordAction">
               <input type="hidden" value='<s:property value="password"/>' name="password">
               <input type="submit" value="前に戻る"/>
               
               </s:form>
               </td>
               <td>
               <s:form action="PasswordCompleteAction">
               <input type="hidden" value='<s:property value="password"/>' name="password">
               <input type="hidden" value='<s:property value="updateId"/>' name="updateId"/>
               <input type="submit" value="変更する" />
               </s:form>
               </td>
             </tr>
             
           </table>
     
       
       </div>
    
    </main>
   
  </body>
</html>