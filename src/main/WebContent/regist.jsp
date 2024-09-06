<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>regist</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" ></script>
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
      <!-- エラーメッセージ表示 -->
      <div id="error">
      <s:if test="errorFlg==1">
        <s:if test="family_name==''">
        名前（姓）が未入力です。<br>
        </s:if>
        <s:if test="last_name==''">
        名前（名）が未入力です。<br>
        </s:if>
        <s:if test="family_name_kana==''">
        カナ（姓）が未入力です。<br>
        </s:if>
        <s:if test="last_name_kana==''">
        カナ（名）が未入力です。<br>
        </s:if>
        <s:if test="mail==''">
        メールアドレスが未入力です。<br>
        </s:if>
        <s:if test="password==''">
        パスワードが未入力です。<br>
        </s:if>
        <s:if test="postal_code==''">
        郵便番号が未入力です。<br>
        </s:if>
        <s:if test="prefecture==''">
        住所（都道府県）が選択されていません。<br>
        </s:if>
        <s:if test="address_1==''">
        住所（市区町村）が未入力です。<br>
        </s:if>
        <s:if test="address_2==''">
        住所（番地）が未入力です。<br>
        </s:if>
        
      </s:if>
      </div>
	    <s:form action="RegistConfirmAction">
		  <table>
		    <tr>
		      <td>名前（姓）</td>
		      <td><input type="text" name="family_name" value="${family_name}"
		      pattern="[^\x20-\x7E]*" maxlength="10" title="ひらがな、漢字で入力してください"/></td>
		    </tr>
	        <tr>
	          <td>名前（名）</td>
	          <td><input type="text" name="last_name" value="${last_name}"  
	          pattern="[^\x20-\x7E]*"　pattern="[^\x20-\x7E]*" maxlength="10" title="ひらがな、漢字で入力してください"/><td>
	        </tr>
	        <tr>
	          <td>カナ（姓）</td>
	          <td><input type="text" name="family_name_kana" value="${family_name_kana}"
	          pattern="[\u30A1-\u30F6]*" maxlength="10" title="全角カタカナで入力してください"/></td>
	        </tr>
	        <tr>
	          <td>カナ（名）</td>
	          <td><input type="text" name="last_name_kana" value="${last_name_kana}"
	          pattern="[\u30A1-\u30F6]*" maxlength="10" title="全角カタカナで入力してください"/></td>
	        </tr>
	        <tr>
	          <td>メールアドレス</td>
	          <td><input type="text" name="mail" value="${mail}"
	          pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" maxlength="10"/></td>
	        </tr>
	        <tr>
	          <td>パスワード</td>
	          <td><input type="text" name="password" value="${password}"
	          pattern="^[0-9A-Za-z]+$" maxlength="10" title="半角英数字で入力してください"/></td>
	        </tr>
	        <tr>
	         <td>性別</td>
	         <td>
	         
	         <input type="radio" value="男" name="gender"
	         <%if((session.getAttribute("gender").toString()).equals("男")){out.println("checked='checked'");}%>/>男&emsp;
	         <input type="radio" value="女" name="gender" 
	         <%if((session.getAttribute("gender").toString()).equals("女")){out.println("checked='checked'");}%>/>女
	         </td>
	        </tr>
	        <tr>
	          <td>郵便番号</td>
	          <td><input type="text" name="postal_code" value="${postal_code}"
	          pattern="[0-9]{7}" title="半角数字で入力してください"/></td>
	        </tr>
	        <tr>
	          <td>住所（都道府県）</td>
	          <td>
	            <select name="prefecture">
	    		<option>${prefecture}</option>
	            <script>
					var prefectureList =
						 ["北海道","青森県","岩手県","宮城県","秋田県","山形県","福島県",
						  "茨城県","栃木県","群馬県","埼玉県","千葉県","東京都","神奈川県","新潟県",
						  "富山県","石川県","福井県","山梨県","長野県","岐阜県","静岡県","愛知県",
						  "三重県","滋賀県","京都府","大阪府","兵庫県","奈良県","和歌山県","鳥取県",
						  "島根県","岡山県","広島県","山口県","徳島県","愛媛県","高知県","福岡県","佐賀県",
						  "長崎県","熊本県","大分県","宮崎県","鹿児島県","沖縄県"];
					
					for(var i =0; i<prefectureList.length; ++i){
							document.write("<option>");
							document.write(prefectureList[i]);
							document.write("</option>");
						}
	            </script>
	          </select>
	          </td>
	        </tr>
	        <tr>
	          <td>住所（市区町村）</td>
	          <td><input type="text" name="address_1" value="${address_1}"
	          pattern="[^!#$%&'()\*\+\.,\/:;<=>?@\[\\\]^_`{|}~]+" maxlength="10" title="ハイフン以外の記号は使えません"/></td>
	        </tr>
	        <tr>
	          <td>住所（番地）</td>
	          <td><input type="text" name="address_2" value="${address_2}"
	          pattern="[^!#$%&'()\*\+\.,\/:;<=>?@\[\\\]^_`{|}~]+" maxlength="100" title="ハイフン以外の記号は使えません"/></td>
	        </tr>
	        <tr>
	          <td>アカウント権限</td>
	          <td>
	            <select name="authority">
	           	  <option>${authority}</option>
	              <option>一般</option>
	              <option>管理者</option>
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