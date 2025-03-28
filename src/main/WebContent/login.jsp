<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>ログイン画面</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
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
                    <s:if test='#session.authority.equals("1")'>  <!-- アカウント権限が一般(0)なら非表示、管理者(1)なら表示 -->
                    <li><a href='<s:url action="RegistAction"/>'>アカウント登録</a></li>
                    <li><a href='<s:url action="ListAction"/>'>アカウント一覧</a></li>
                    </s:if>
                </ul>
            </nav>
        </header>
        
        <main>
        
        <h2 class="title">ログイン画面</h2>
        <div class="regist">
            <table>
              <tbody>
                <s:form action="HomeAction">
                  <tr>
                    <td>
                       メールアドレス
                    </td>
                    <td>
                     <input type="text" name="mail" maxlength="100"/>
                    </td>
                  <tr>
                    <td>
                      パスワード
                    </td>
                    <td>
                      <input type="text" name="password" maxlength="10"/>
                    </td>
                  </tr>
                  <tr>
                    <td colspan="2">
                      <input type="submit" value="ログイン"/>
                    </td>
                  </tr>               
                </s:form>
              </tbody>
            </table>
          </div>
        </main>
        <footer>
            
            Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
        </footer>
  </body>
</html>