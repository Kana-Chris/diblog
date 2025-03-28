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
                    <s:if test='#session.authority.equals("1")'>  <!-- アカウント権限が一般(0)なら非表示、管理者(1)なら表示 -->
                    <li><a href='<s:url action="RegistAction"/>'>アカウント登録</a></li>
                    <li><a href='<s:url action="ListAction"/>'>アカウント一覧</a></li>
                    </s:if>
                </ul>
            </nav>
       </header>
       
       <main>
       <h2 class="title">アカウント削除画面</h2>
         <div class="regist">
           <table>
             <s:form action="DeleteConfirmAction">
             <s:iterator value="selectDTO">
               <tr>
                 <td>名前(姓)</td>
                 <td><s:property value="family_name"/></td>
               </tr>
               <tr>
                 <td>名前(名)</td>
                 <td><s:property value="last_name"/></td>
               </tr>
               <tr>
                 <td>カナ(姓)</td>
                 <td><s:property value="family_name_kana"/></td>
               </tr>
               <tr>
                 <td>カナ(名)</td>
                 <td><s:property value="last_name_kana"/></td>
               </tr>
               <tr>
                 <td>メールアドレス</td>
                 <td><s:property value="mail"/></td>
               </tr>
               <tr>
                 <td>パスワード</td>
                 <td>※パスワードは表示されません</td>
               </tr>
               <tr>
                 <td>性別</td>
                 <td><s:property value="gender"/></td>
               </tr>
               <tr>
                 <td>郵便番号</td>
                 <td><s:property value="postal_code"/></td>
               </tr>
               <tr>
                 <td>住所(都道府県)</td>
                 <td><s:property value="prefecture"/></td>
               </tr>
               <tr>
                 <td>住所(市区町村)</td>
                 <td><s:property value="address_1"/></td>
               </tr>
               <tr>
                 <td>住所(番地)</td>
                 <td><s:property value="address_2"/></td>
               </tr>
               <tr>
                 <td>アカウント権限</td>
                 <td><s:property value="authority"/></td>
               </tr>
               </s:iterator>
               <tr>
                 <td colspan="2">
                    <input type="hidden" value='<s:property value="deleteId"/>' name="deleteId">
                    <input type="submit" value="確認する">
            
                 </td>
               </tr>
               </s:form>
             </table>
           </div>
         </main>
       
       
       <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
        </footer>
  </body>
</html>