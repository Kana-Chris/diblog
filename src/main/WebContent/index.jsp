<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>D.I.Blog</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!--<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>-->

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
        <script>
            $(document).ready(function(){
            $('.abc').bxSlider({
            auto: true,
            mode: 'horizontal',
            speed: 2000,
            slideWidth: 1400
            });
            });

          </script>
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
            <div class="main-container">
                <div class="left">
                    <h1>プログラミングに役立つ書籍</h1>
                    <p>2024年8月1日</p>
                    
                    <div class="abc">
                    <div><img src="pic/jQuery_image1.jpg"></div>
                    <div><img src="pic/jQuery_image2.jpg"></div>
                    <div><img src="pic/jQuery_image3.jpg"></div>
                    <div><img src="pic/jQuery_image4.jpg"></div>
                    <div><img src="pic/jQuery_image5.jpg"></div>
                    </div>
                   
                    <p>D.I.BlogはD.I.Worksが提供する演習課題です。</p>
                    <p>記事中身</p>
                    <section>
                        <div class="article">
                            <img src="pic/pic1.jpg">
                            <p>ドメイン取得方法</p>
                        </div>
                        <div class="article">
                            <img src="pic/pic2.jpg">
                            <p>快適な職場環境</p>
                        </div>
                        <div class="article">
                            <img src="pic/pic3.jpg">
                            <p>Linux基礎</p>
                        </div>
                        <div class="article">
                            <img src="pic/pic4.jpg">
                            <p>マーケティング入門</p>
                        </div>
                        <br>
                        <div class="article">
                            <img src="pic/pic5.jpg">
                            <p>アクティブラーニング</p>
                        </div>
                        <div class="article">
                            <img src="pic/pic6.jpg">
                            <p>CSSの効率的な勉強方法</p>
                        </div>
                        <div class="article">
                            <img src="pic/pic7.jpg">
                            <p>リーダブルコードとは</p>
                        </div>
                        <div class="article">
                            <img src="pic/pic8.jpg">
                            <p>HTML5の可能性</p>
                        </div>
                    </section>
                </div>
                <div class="right">
                    <h2>人気の記事</h2>
                        <ul class="subNav">
                            <li>PHPオススメ本</li>
                            <li>PHP MyAdminの使い方</li>
                            <lI>今人気のエディタTops</lI>
                            <li>HTMLの基礎</li>
                        </ul>
                    <h2>オススメリンク</h2>
                        <ul class="subNav">
                            <li>ディーアイワークス株式会社</li>
                            <li>XAMPPのダウンロード</li>
                            <li>Eclipseのダウンロード</li>
                            <li>Braketsのダウンロード</li>
                        </ul>
                    <h2>カテゴリ</h2>
                        <ul class="subNav">
                            <li>HTML</li>
                            <li>PHP</li>
                            <li>MySQL</li>
                            <li>JavaScript</li>
                        </ul>
                </div>
            </div>
        </main>
        <footer>
            
                Copyright D.I.works| D.I.Blog is the one which provides A to A about programming
          
        </footer>
        <script type="text/javascript" src="script.js"></script>
    </body>
</html>