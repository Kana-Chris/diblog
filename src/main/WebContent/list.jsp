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
                    <li><a href='<s:url action="RegistAction"/>'>アカウント登録</a></li>
                    <li><a href='<s:url action="ListAction"/>'>アカウント一覧</a></li>
                </ul>
            </nav>
    </header>
    
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
    
     <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
    </footer>
  </body>
</html>