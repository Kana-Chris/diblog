<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>アカウント登録確認画面</title>
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
	      <s:form>
			  <table>
			    <tr>
			      <td>名前（姓）</td>
			      <td><s:property value="family_name"/></td>
			    </tr>
		        <tr>
		          <td>名前（名）</td>
		          <td><s:property value="last_name"/></td>
		        </tr>
		        <tr>
		          <td>カナ（姓）</td>
		          <td><s:property value="family_name_kana"/></td>
		        </tr>
		        <tr>
		          <td>カナ（名）</td>
		          <td><s:property value="last_name_kana"/></td>
		        </tr>
		        <tr>
		          <td>メールアドレス</td>
		          <td><s:property value="mail"/></td>
		        </tr>
		        <tr>
		          <td>パスワード</td>
		          <td><s:property value="password"/></td>
		        </tr>
		        <tr>
		         <td>性別</td>
		         <td>
		         <s:property value="gender"/>
		         </td>
		        </tr>
		        <tr>
		          <td>郵便番号</td>
		          <td><s:property value="postal_code"/></td>
		        </tr>
		        <tr>
		          <td>住所（都道府県）</td>
		          <td>
		          <s:property value="prefecture"/>
		          </td>
		        </tr>
		        <tr>
		          <td>住所（市区町村）</td>
		          <td><s:property value="address_1"/></td>
		        </tr>
		        <tr>
		          <td>住所（番地）</td>
		          <td><s:property value="address_2"/></td>
		        </tr>
		        <tr>
		          <td>アカウント権限</td>
		          <td>
		            <s:property value="authority"/>
		          </td>
		        </tr>
		        <tr>
		          <td><input type="button" value="前に戻る" onclick="submitAction('RegistAction')"/></td>
		          <td><input type="button" value="登録する" onclick="submitAction('RegistCompleteAction')"/></td>
		        </tr>
		      </table>
		  </s:form>
	   </div>
	 </main>
	 
	 <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
  </body>
</html>