<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>アカウント削除画面</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" ></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bxslider@4.2.17/dist/jquery.bxslider.min.css">
  </head>
  <body>
     <header>
            <div class="Logo"><img src="pic/diblog_logo.jpg"></div>
            <nav class="mainNav">
                <ul>
                    <li>トップ</li>
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
           <table>
             <s:form action="">
             <s:iterator value="">
               <tr>
                 <td>名前(姓)</td>
                 <td></td>
               </tr>
               <tr>
                 <td>名前(名)</td>
                 <td></td>
               </tr>
               <tr>
                 <td>カナ(姓)</td>
                 <td></td>
               </tr>
               <tr>
                 <td>カナ(名)</td>
                 <td></td>
               </tr>
               <tr>
                 <td>メールアドレス</td>
                 <td></td>
               </tr>
               <tr>
                 <td>パスワード</td>
                 <td></td>
               </tr>
               <tr>
                 <td>性別</td>
                 <td></td>
               </tr>
               <tr>
                 <td>郵便番号</td>
                 <td></td>
               </tr>
               <tr>
                 <td>住所(都道府県)</td>
                 <td></td>
               </tr>
               <tr>
                 <td>住所(市区町村)</td>
                 <td></td>
               </tr>
               <tr>
                 <td>住所(番地)</td>
                 <td></td>
               </tr>
               <tr>
                 <td>アカウント権限</td>
                 <td></td>
               </tr>
               </s:iterator>
               <input type="submit" value="確認する">
               </s:form>
             </table>
           </div>
         </main>
       
       
       <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
        </footer>
  </body>
</html>