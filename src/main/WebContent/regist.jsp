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
    
    <main>
    
      <s:if test="message!=''">
        <s:property value ="message" escape="false"/>
      </s:if>
      
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
	         <input type="radio" value="男" name="gender" checked="checked "/>男&emsp;
	         <input type="radio" value="女" name="gender"/>女
	         </td>
	        </tr>
	        <tr>
	          <td>郵便番号</td>
	          <td><input type="text" name="postal_code"/></td>
	        </tr>
	        <tr>
	          <td>住所（都道府県）</td>
	          <td>
	            <select name="prefecture">
	              <option value=""></option>
	          　　　 <option value="" selected></option>
			      <option value="北海道">北海道</option>
			      <option value="青森県">青森県</option>
			      <option value="岩手県">岩手県</option>
			      <option value="宮城県">宮城県</option>
			      <option value="秋田県">秋田県</option>
			      <option value="山形県">山形県</option>
			      <option value="福島県">福島県</option>
			      <option value="茨城県">茨城県</option>
			      <option value="栃木県">栃木県</option>
			      <option value="群馬県">群馬県</option>
			      <option value="埼玉県">埼玉県</option>
			      <option value="千葉県">千葉県</option>
			      <option value="東京都">東京都</option>
			      <option value="神奈川県">神奈川県</option>
			      <option value="新潟県">新潟県</option>
			      <option value="富山県">富山県</option>
			      <option value="石川県">石川県</option>
			      <option value="福井県">福井県</option>
			      <option value="山梨県">山梨県</option>
			      <option value="長野県">長野県</option>
			      <option value="岐阜県">岐阜県</option>
			      <option value="静岡県">静岡県</option>
			      <option value="愛知県">愛知県</option>
			      <option value="三重県">三重県</option>
			      <option value="滋賀県">滋賀県</option>
			      <option value="京都府">京都府</option>
			      <option value="大阪府">大阪府</option>
			      <option value="兵庫県">兵庫県</option>
			      <option value="奈良県">奈良県</option>
			      <option value="和歌山県">和歌山県</option>
			      <option value="鳥取県">鳥取県</option>
			      <option value="島根県">島根県</option>
			      <option value="岡山県">岡山県</option>
			      <option value="広島県">広島県</option>
			      <option value="山口県">山口県</option>
			      <option value="徳島県">徳島県</option>
			      <option value="香川県">香川県</option>
			      <option value="愛媛県">愛媛県</option>
			      <option value="高知県">高知県</option>
			      <option value="福岡県">福岡県</option>
			      <option value="佐賀県">佐賀県</option>
			      <option value="長崎県">長崎県</option>
			      <option value="熊本県">熊本県</option>
			      <option value="大分県">大分県</option>
			      <option value="宮崎県">宮崎県</option>
			      <option value="鹿児島県">鹿児島県</option>
			      <option value="沖縄県">沖縄県</option>    
	            </select></td>
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
	              <option value="一般" selected>一般</option>
	              <option value="管理者">管理者</option>
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
	    
    </main>
    <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
        </footer>
  </body>
</html>