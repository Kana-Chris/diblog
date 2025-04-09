<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
      <title>アカウント一覧</title>
      <link rel="stylesheet" type="text/css" href="css/style.css">
      <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" ></script>
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bxslider@4.2.17/dist/jquery.bxslider.min.css">
      
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
                     <s:if test='#session.authority.equals("1")'>  <!-- アカウント権限が一般なら非表示、管理者なら表示 -->
                    <li><a href='<s:url action="RegistAction"/>'>アカウント登録</a></li>
                    <li><a href='<s:url action="ListAction"/>'>アカウント一覧</a></li>
                    </s:if>
                </ul>
            </nav>
    </header>
   
    <h2 class="title">アカウント一覧画面</h2>
    
    <s:if test='#session.authority==null'>
      　　<div class="error">
          エラーのため操作できません。
        </div>
      </s:if>
    <s:if test='#session.authority.equals("0")'>
      <div class="error">
         エラーのため表示できません。
      </div>
    </s:if>
    <s:if test='session.authority.equals("1")'>
	      <form action="ListAction">
	       <table>
	        <tbody>
	          <tr>
	            <td>名前(姓)</td>
	            <td><input type="text" name="family_name"/></td>
	            <td>名前(名)</td>
	            <td><input type="text" name="last_name"/></td>
	          </tr>
	          <tr>
	            <td>カナ(姓)</td>
	            <td><input type="text" name="family_name_kana"/></td>
	            <td>カナ(名)</td>
	            <td><input type="text" name="last_name_kana"/></td>
	          </tr>
	          <tr>
	            <td>メールアドレス</td>
	            <td><input type="text" name="mail"/></td>
	            <td>性別</td>
	            <td>
	              <input type="radio" name="gender" value="男" checked="checked"/>男
	              <input type="radio" name="gender" value="女"/>女
	            </td>
	          </tr>
	          <tr>
	            <td>アカウント権限</td>
	            <td>
	              <select name="authority">
	                <option>一般</option>
	                <option>管理者</option>
	              </select>
	            </td>
	            <td colspan="2">
	            </td>
	           </tr>
	           <tr>
	             <td colspan="4">
	                <div style="text-align:right"><input type="submit" value="検索"/></div>
	              </td>
	            </tr>
	          </tbody>
	        </table>
	      </form>
	    <table class="list">
	      <tbody>
	        <tr>
	        <th>ID</th>
	        <th>名前（姓）</th>
	        <th>名前（名）</th>
	        <th>カナ（姓）</th>
	        <th>カナ（名）</th>
	        <th>メールアドレス</th>
	        <th>性別</th>
	        <th>アカウント権限</th>
	        <th>削除フラグ</th>
	        <th>登録日時</th>
	        <th>更新日時</th>
	        <th colspan="2">操作</th>
	        </tr>
	        <s:iterator value="searchList">
	          <tr>
	            <td><s:property value="id"/></td>
	            <td><s:property value="family_name"/></td>
	            <td><s:property value="last_name"/></td>
	            <td><s:property value="family_name_kana"/></td>
	            <td><s:property value="last_name_kana"/></td>
	            <td><s:property value="mail"/></td>
	            <td><s:property value="gender"/></td>
	            <td><s:property value="authority"/></td>
	            <td><s:property value="delete_flag"/></td>
	            <td><s:property value="registared_time"/></td>
	            <td><s:property value="update_time"/></td>
	            <td>
	              <form action="UpdateAction" method="post">
	                <input type="submit" value="更新">
	                <input type="hidden" value="<s:property value='id'/>" name="updateId">
	              </form>
	            </td>
	            <td>
	              <form action="DeleteAction" method="post">
	                <input type="submit" value="削除" />
	                <input type="hidden" value="<s:property value='id'/>"  name="deleteId">
	              </form>
	            </td>
	          </tr>
	          
	        </s:iterator>
	      </tbody>
	    </table>
     </s:if>         
    
     <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
  </body>
</html>