<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>regist</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
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
                  <li>その他</li>
                  <li>アカウント登録</li>
              </ul>
          </nav>
    </header>
    
    <s:form action="RegistConfirmAction">
	  <table>
	    <tr>
	      <td>名前（姓）</td>
	      <td><input type="text" name="family_name" pattern="[^\x20-\x7E]*"/></td>
	    </tr>
        <tr>
          <td>名前（名）</td>
          <td><input type="text" name="last_name" pattern="[^\x20-\x7E]*"/><td>
        </tr>
        <tr>
          <td>カナ（姓）</td>
          <td><input type="text" name="family_name_kana" pattern="[\u30A1-\u30F6]*"/></td>
        </tr>
        <tr>
          <td>カナ（名）</td>
          <td><input type="text" name="last_name_kana" pattern="[\u30A1-\u30F6]*"/></td>
        </tr>
        <tr>
          <td>メールアドレス</td>
          <td><input type="text" name="mail"/></td>
        </tr>
        <tr>
          <td>パスワード</td>
          <td><input type="text" name="password"/></td>
        </tr>
        <tr>
         <td>性別</td>
         <td>
         <input type="radio" value="0" name="gender" checked="checked "/>男&emsp;
         <input type="radio" value="1" name="gender"/>女
         </td>
        </tr>
        <tr>
          <td>郵便番号</td>
          <td><input type="text" name="postal_code"/></td>
        </tr>
        <tr>
          <td>住所（都道府県）</td>
          <td><input type="text" label="）" name="prefecture"/></td>
        </tr>
        <tr>
          <td>住所（市区町村）</td>
          <td><input type="text" name="address_1"/></td>
        </tr>
        <tr>
          <td>住所（番地）</td>
          <td><input type="text" name="address_2"/></td>
        </tr>
        <tr>
          <td>アカウント権限</td>
          <td>
            <select name="authority">
              <option value="0" selected>一般</option>
              <option value="1">管理者</option>
            </select>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <input type="submit" value="確認する"/>
          </td>
        </tr>
        </table>
      
    </s:form>
    
    <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
        </footer>
  </body>
</html>