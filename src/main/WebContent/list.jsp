<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
      <title>アカウント一覧</title>
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
                    <li><a href='<s:url action="RegistAction"/>'>アカウント登録</a></li>
                </ul>
            </nav>
    </header>
    
    <table>
      <tbody>
        <s:iterator value="#session.accountList">
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
            <td><input type="button" value="更新"></td>
            <td><input type="button" value="削除"></td>
          </tr>
          
        </s:iterator>
      </tbody>
    </table>
   
     <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
  </body>
</html>