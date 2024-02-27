<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 2. reset.css 추가 -->
<link rel="stylesheet" href="resources/css/reset.css" />

<!-- 3. 스타일 적용 : style.css 추가 -->
<link rel="stylesheet" href="resources/css/index.css" />

<!-- 아이콘 추가 : fontawesome -->
<script src="https://kit.fontawesome.com/4602e82315.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- 1. HTML 작성 -->
	<div class="tob-bar container">
		<div class="tob-bar-left">
			<a href="#">즐겨찾기</a> <a href="#">입점신청</a>
		</div>
		<div class="tob-bar-right">
			<a href="#">로그인</a> 
			<a href="/register">회원가입</a> 
			<a href="#">고객센터</a>
		</div>
	</div>

	<!-- header -->
	<header class="container">
		<div class="category-btn">
			<i class="fa-solid fa-bars"></i>
			<p>카테고리</p>
			<!-- 숨겨져 있는 카테고리 -->
			<!-- event 사용 -> hover 방식으로 변경
            hover 같은 경우는 하위 태그로 존재해야 함!
        -->
			<div class="category">
				<div class="category-list">
					<div class="category-item">
						<i class="fa-solid fa-shirt"></i> <span>패션의류/잡화</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<!--(li>a)*4-->
								<li><a href="#">여성패션</a></li>
								<li><a href="#">남성패션</a></li>
								<li><a href="#">남녀 공용 의류</a></li>
								<li><a href="#">유아동패션</a></li>
							</ul>
							<img
								src="https://image8.coupangcdn.com/image/displayitem/displayitem_3cc22bda-73a2-4f9b-a7ea-c12d205adcb3.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-pump-soap"></i> <span>뷰티</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">로켓럭셔리</a></li>
								<li><a href="#">스킨케어</a></li>
								<li><a href="#">클린/비건뷰티</a></li>
								<li><a href="#">클렌징/필링</a></li>
								<li><a href="#">더마코스메틱</a></li>
							</ul>
							<img
								src="https://image9.coupangcdn.com/image/displayitem/displayitem_66b57433-c633-44e2-ad4a-e334e2779ab3.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-baby"></i> <span>출산/유아동</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">유아동패션</a></li>
								<li><a href="#">기저귀</a></li>
								<li><a href="#">물티슈</a></li>
								<li><a href="#">분유/어린이식품</a></li>
								<li><a href="#">어린이 건강식품</a></li>
							</ul>
							<img
								src="https://image7.coupangcdn.com/image/displayitem/displayitem_177b1f26-409b-4799-a6f6-1468c45fcdcc.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-bowl-food"></i> <span>식품</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">유기농/친환경 전문관</a></li>
								<li><a href="#">과일</a></li>
								<li><a href="#">견과/건과</a></li>
								<li><a href="#">채소</a></li>
								<li><a href="#">쌀/잡곡</a></li>
							</ul>
							<img
								src="https://image7.coupangcdn.com/image/displayitem/displayitem_96ace47f-0079-4436-9cf0-25a43ac75517.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-mug-saucer"></i> <span>주방용품</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">주방가전</a></li>
								<li><a href="#">냄비/프라이팬</a></li>
								<li><a href="#">주방조리도구</a></li>
								<li><a href="#">그릇/홈세트</a></li>
								<li><a href="#">수저/커트러리</a></li>
							</ul>
							<img
								src="https://image6.coupangcdn.com/image/displayitem/displayitem_2049fac1-63d9-441c-ba0a-26a95ca5ee71.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-bottle-droplet"></i> <span>생활용품</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">방한용품</a></li>
								<li><a href="#">헤어</a></li>
								<li><a href="#">바디/세안</a></li>
								<li><a href="#">구강/면도</a></li>
								<li><a href="#">화장지/물티슈</a></li>
							</ul>
							<img
								src="https://image6.coupangcdn.com/image/displayitem/displayitem_5c29f78b-865f-4303-bc84-b811633fab36.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-couch"></i> <span>홈인테리어</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">크리스마스용품</a></li>
								<li><a href="#">방한용품</a></li>
								<li><a href="#">F/W 침구샵</a></li>
								<li><a href="#">싱글하우스</a></li>
								<li><a href="#">홈데코</a></li>
							</ul>
							<img
								src="https://image9.coupangcdn.com/image/displayitem/displayitem_2af06d7f-e016-419e-8fcb-059898000ee2.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-camera"></i> <span>가전디지털</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">TV/영상가전</a></li>
								<li><a href="#">냉장고</a></li>
								<li><a href="#">세탁기/건조기</a></li>
								<li><a href="#">생활가전</a></li>
								<li><a href="#">청소기</a></li>
							</ul>
							<img
								src="https://image7.coupangcdn.com/image/displayitem/displayitem_1682114d-db45-4371-8aee-b1d6f69523dc.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-baseball"></i> <span>스포츠/레저</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">캠핑전문관</a></li>
								<li><a href="#">홈트레이닝</a></li>
								<li><a href="#">수영/수상스포츠</a></li>
								<li><a href="#">골프</a></li>
								<li><a href="#">자전거</a></li>
							</ul>
							<img
								src="https://image7.coupangcdn.com/image/displayitem/displayitem_632d731b-b306-4e0a-b3fb-1ee5bf06f380.jpg"
								alt="" />
						</div>
					</div>
					<div class="category-item">
						<i class="fa-solid fa-car"></i> <span>자동차용품</span> <i
							class="fa-solid fa-caret-right"></i>
						<div class="category-sub-item">
							<ul>
								<li><a href="#">겨울철 차량관리</a></li>
								<li><a href="#">인테리어</a></li>
								<li><a href="#">익스테리어</a></li>
								<li><a href="#">세차/카케어</a></li>
								<li><a href="#">차량용 전자기기</a></li>
							</ul>
							<img
								src="https://image7.coupangcdn.com/image/displayitem/displayitem_33eefe3e-deb8-45f3-b1f9-e9a01815c3f7.jpg"
								alt="" />
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="header-main">
			<div class="header-main-top">
				<a href="#" class="logo"> <img
					src="https://image7.coupangcdn.com/image/coupang/common/logo_coupang_w350.png"
					alt="" />
				</a>
				<form action="">
					<select name="" id="">
						<option value="">전체</option>
						<option value="">여성패션</option>
						<option value="">남성패션</option>
						<option value="">남녀 공용 의류</option>
						<option value="">유아동패션</option>
						<option value="">뷰티</option>
					</select> <input type="text" /> <i class="fa-solid fa-microphone"></i>
					<button type="submit">
						<i class="fa-solid fa-magnifying-glass"></i>
					</button>
				</form>
				<a href="#" class="header-main-icon"> <i
					class="fa-regular fa-user"></i>
					<p>마이쿠팡</p>
				</a> <a href="#" class="header-main-icon"> <i
					class="fa-solid fa-cart-shopping"></i>
					<p>장바구니</p>
				</a>
			</div>
			<nav class="header-main-bottom">
				<i class="fa-solid fa-chevron-left"></i> <a href="#"> <img
					src="https://image6.coupangcdn.com/image/coupang/common/coupang_play_icon@3x.png"
					alt="" /> <span>쿠팡플레이</span>
				</a> <a href="#"> <img
					src="https://image10.coupangcdn.com/image/coupang/rds/logo/xxhdpi/logo_rocket_symbol_large.png"
					alt="" /> <span>로켓배송</span>
				</a> <a href="#"> <img
					src="https://image9.coupangcdn.com/image/coupang/common/pc_header_rocket_fresh_1x.png"
					alt="" /> <span>로켓프레시</span>
				</a> <a href="#"> <img
					src="https://image7.coupangcdn.com/image/coupang/home/icons/Christmas/Christmas_PC_2023.png"
					alt="" /> <span>크리스마스</span>
				</a> <a href="#"> <img
					src="https://image6.coupangcdn.com/image/coupang/common/logoBizonlyBrown.png"
					alt="" /> <span>쿠팡비즈</span>
				</a> <a href="#"> <img
					src="https://image6.coupangcdn.com/image/coupang/home/icons/Overseas.png"
					alt="" /> <span>로켓직구</span>
				</a> <a href="#"> <span>골드박스</span>
				</a> <a href="#"> <span>와우회원할인</span>
				</a> <a href="#"> <span>이벤트/쿠폰</span>
				</a> <a href="#"> <img
					src="https://image10.coupangcdn.com/image/coupang/home/icons/RETURNED_MARKET_B@2x.png"
					alt="" /> <span>반품마켓</span>
				</a> <a href="#"> <img
					src="https://image9.coupangcdn.com/image/coupang/common/icon_government_promotion.png"
					alt="" /> <span>착한상점</span>
				</a> <a href="#"> <span>기획전</span>
				</a> <a href="#"> <img
					src="https://image9.coupangcdn.com/image/coupang/common/icon_travel.png"
					alt="" /> <span>여행/티켓</span>
				</a> <i class="fa-solid fa-chevron-right"></i>
			</nav>
		</div>
	</header>
</body>
</html>