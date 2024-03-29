<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="layout_body" class="layout_body">
	<div id="boardlayout">
			<div class="subpage_wrap">
				<div class="subpage_container">
					<div class="title_container">
						<h2>자주묻는질문</h2>
					</div>
					<div id="bbslist">
					<ul class="faq_new">
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=12" fileperm_read="" board_seq="12" board_id="faq"><a>퍼스트몰 올인원에서는 재고 없이 출고(공급처 배송)할 방법이 없나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  12</span>
				</p>
			</div>
			<div id="faqcontent_12" class="answer hide">
				<p>퍼스트몰 올인원에서도 '공급처 배송 상품'의 경우, 무재고 출고가 가능합니다.</p><p><br></p><p>1. [판매상품]-[[실물]상품]에서 기존과 동일한 방법으로 상품을 등록합니다.</p><p>&nbsp; &nbsp;다만, '재고 변화에 따른 상품판매 여부'를 '재고와 상관없이 판매'로 변경하여 등록합니다.</p><p>&nbsp; &nbsp;(다른 설정은 상품의 상태를 정상으로 변경할 수 없습니다.)</p><p><br></p><p>2. [재고관리]-[상품관리] 메뉴에서 등록한 상품을 클릭하여, '공급처 배송'에 체크하고, 발주정보를 등록합니다.</p><p>&nbsp; &nbsp;(※ '공급처 배송'의 경우에도 '거래처별 발주정보'는 꼭 입력하여야 합니다.)</p><p><br></p><p>3. 판매 준비가 완료 되었으면, 상품의 상태를 '정상'으로 변경합니다.</p><p><br></p><p>4. '공급처 배송' 상품의 경우에는 재고가 없더라도 출고가 가능합니다.</p><p><br></p><p>5. '공급처 배송' 상품은 출고 시, 출고 수량만큼 자동입고 후 출고 되기 때문에 [발주/입고]-[입고]메뉴에 비정규입고가 쌓이게 됩니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=11" fileperm_read="" board_seq="11" board_id="faq"><a>이니시스 전자결제 세팅은 어떻게 하나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  11</span>
				</p>
			</div>
			<div id="faqcontent_11" class="answer hide" style="display: none;">
				<p>전자결제 세팅은 [설정]-[전자결제]에서 할 수 있습니다.</p><p><br></p><p>이니시스의 경우 일반 세팅(GBF 코드)과 에스크로 세팅(ESGB 코드) 정보가 따로 있습니다.</p><p>이니시스에서 계약이 완료되면 일반 GBF와 에스크로 ESGB로 시작되는 메일을 보내주며, 각 파일을 다운로드 받아 압축을 해제하면 파일 4개가 있습니다. txt파일 제외 순차적으로 업로드 해주시기 바랍니다.</p><p><br></p><p>※ 아래 1, 2, 3번의 값은 이니시스에서 보내온 메일안에서 확인할 수 있습니다.</p><p>1. 이니시스에서 제공받은 'GBF로 시작하는 아이디'를 입력 합니다.&nbsp;</p><p>2. 키패스워드에는 '1111' 을 입력 합니다.</p><p>3. 메일에서 파일을 다운 받은후 압축을 풀어 파일을 업로드 합니다.&nbsp;</p><p>4. 이니시스 가맹점 관리자에서 사인키를 확인한 후 입력합니다.&nbsp;</p><p>&nbsp; 1) 상점정보를 클릭합니다.</p><p>&nbsp; 2) 부가정보를 클릭합니다.</p><p>&nbsp; 3) 웹결제 signkey생성조회를 클릭합니다.</p><p>&nbsp; 4) 생성/갱신을 클릭하여 사인키를 확인할 수 있습니다.</p><p><br></p><p>&nbsp; ※ 하단 에스크로 세팅은 ESGB코드와 키패스워드 1111를 등록하고, 사인키(signkey)를 위와 같이 이니시스에서 에크스로 ID로 로그인하여 따로 확인하여 입력 후, 파일을 등록하시면 됩니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=10" fileperm_read="" board_seq="10" board_id="faq"><a>독립몰을 사용 중인데, 프로그램 및 DB 수정을 하려고 합니다. 어떻게 해야 하나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  10</span>
				</p>
			</div>
			<div id="faqcontent_10" class="answer hide">
				<p>독립형 퍼스트몰에서 프로그램 및 DB에 접근하시려면 FTP권한변경 신청을 하셔야 합니다.</p><p><br></p><p>1. https://www.firstmall.kr MY퍼스트몰에 접속합니다.</p><p>2. FTP권한변경할 도메인을 클릭합니다.</p><p>3. 호스팅정보에서 FTP 권한 변경을 클릭합니다.</p><p>4. FTP권한변경에 대한 절차와 안내에 대해서 동의후 진행하여 주시면 됩니다.</p><p><br></p><p>단, 프로그램 및 DB 접근 이후에는 자동 업그레이드/패치는 지원되지 않으며 수동으로 진행해 주셔야 합니다.</p><p>업그레이드/패치 게시판: https://www.firstmall.kr/customer/patch#page-1</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=9" fileperm_read="" board_seq="9" board_id="faq"><a>카카오페이 계약 및 설정은 어디서 하나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  9</span>
				</p>
			</div>
			<div id="faqcontent_9" class="answer hide">
				<p>카카오페이 설정 및 계약은 관리자페이지 內 '설정 - 전자결제' 메뉴에서 할 수 있습니다.</p><p><br></p><p>&lt;카카오페이 신청&gt;</p><p>1. 하단에서&nbsp; 카카오페이의 '온라인 신청하기'를 클릭하여 신청합니다.</p><p>2. '계약서류 다운로드'를 클릭하여 계약서를 작성하고 첨부서류를 준비하여 LG CNS로 우편발송합니다.</p><p>&nbsp; &nbsp; (주소는 계약서류에서 확인할 수 있습니다.)</p><p><br></p><p>&lt;카카오페이 설정&gt;</p><p>1. 카카에페이 사용여부를 선택합니다.</p><p>1. 카카오페이에서 '세팅정보'를 받아서 입력합니다.</p><p>2. 결제방법을 설정후 저정합니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=8" fileperm_read="" board_seq="8" board_id="faq"><a>FTP이용하지않고 이미지를 올리수 있나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  8</span>
				</p>
			</div>
			<div id="faqcontent_8" class="answer hide">
				<p style="text-align: left;">퍼스트몰의 EYE Editor를 통하여 이미지 등록을 하실 수 있습니다.</p><p style="text-align: left;"><br></p><p style="text-align: left;"><img src="https://interface.firstmall.kr/firstmall_plus/sample_img/responsive_ver1_default_gl/board/faq/813df9c250157769472e78c9b0243b5b1018531.jpeg" class="txc-image" style="clear:none;float:none;"></p><p style="text-align: left;"><br></p><p style="text-align: left;">① 이미지를 업로드할 폴더를 선택 합니다.</p><p style="text-align: left;">② 이미지 업로드 버튼을 클릭합니다.</p><p style="text-align: left;">③ 업로드 할 이미지파일을 선택합니다.</p><p style="text-align: left;">④ 업로드 버튼을 클릭합니다.</p><p style="text-align: left;"><br></p><p style="text-align: left;"><img src="https://interface.firstmall.kr/firstmall_plus/sample_img/responsive_ver1_default_gl/board/faq/94a4318dbaea288106b13460b111d2e01019121.jpeg" class="txc-image" style="clear:none;float:none;"></p><p style="text-align: left;"><br></p><p style="text-align: left;"><br></p><p style="text-align: left;">이미지가 업로드된것을 확인하실수 있으며, 해당 파일명에서 마우스 우클릭 - [주소복사]를 클릭하셔서 원하시는 위치에 붙여넣기하여 이용하실 수 있습니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=7" fileperm_read="" board_seq="7" board_id="faq"><a>텍스트 색상을 변경하고 싶어요. (개발자도구 활용)</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  7</span>
				</p>
			</div>
			<div id="faqcontent_7" class="answer hide">
				<p>아래 화면은 브라우저에 개발자도구를 띄운 화면입니다.</p><p>보통 브라우저를 띄운 상태에서 키보드의 F12키를 누르면 해당 도구창이 뜹니다.</p><p>개발자도구는 HTML/CSS 소스 확인, 웹페이지 구조 확인, 웹페이지 속도 측정 등 웹페이지를 테스트/디버깅하는 도구입니다.</p><p>저희 쇼핑몰 스킨은 EYE-DESIGN을 통해 배너 및 상품디스플레이 등을 손쉽게 교체할 수 있지만</p><p>그외에는 에디터를 이용하여 스킨 소스를 직접 수정해야 합니다.</p><p>이럴떄 개발자도구를 활용하면 소스 수정이 편리합니다.</p><p><br></p><p>1. 개발자도구의 왼쪽 상단에 있는 화살표 부분을 선택한 후</p><p>2. 브라우저 화면의 원하는 위치를 선택하게 되면</p><p>3. 그 아래 HTML 소스와 연결된 CSS가 활성화되어 표시됩니다.</p><p>4. 아래 화면에서 h3 타이틀을 수정하려면 css/user.css의 232번째줄을 수정하면 됩니다.</p><p><br></p><p><br></p><p>이떄, 개발자도구를 이용하면 실제 소스를 수정하지 않더라도 개발자도구에 HTML/CSS를 수정하여 변경된 화면을 미리 경험할 수도 있습니다.</p><p>만약, 검은색 글자(color:#000)를 빨간색 글자(color:#f00)로 변경하고자 한다면</p><p>아래 CSS 부분에서 color: 다음에 오는 #000 을 마우스 클릭하고 #f00 을 입력하면 빨간색 글자로 변경되어 보입니다.</p><p><br></p><p>한번, 수정해보세요.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=6" fileperm_read="" board_seq="6" board_id="faq"><a>새로운 페이지를 만들려면 어떻게 해야 하나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  6</span>
				</p>
			</div>
			<div id="faqcontent_6" class="answer hide">
				<p>1. 디자인 환경으로 이동한 후 EYE DESIGN 하단의 [새 페이지 만들기]를 클릭합니다.</p><p><br></p><p>2. [새 페이지 만들기] 창이 뜨면 위에서부터, 경로, 파일명, 레이아웃 설정 등을 할 수 있습니다.</p><p><br></p><p>3. 페이지가 만들어지면&nbsp; EYE DESIGN 상단의 [전체 페이지]에서 만들어진 경로와 주소를 확인할 수 있으며, 해당 페이지의 디자인 또는 HTML 페이지로 이동할 수 있습니다.</p><p>이때 주의하실 점은 파일 경로와 링크 경로가 다르다는 점인데, 다른 페이지에서 링크할 때는 [주소복사]를 클릭해서 붙여 넣어야 하며, 링크할 주소 형식은 /page/index?tpl=main%2Fnewfile.html와 같이 이루어집니다.</p><p><br></p><p>4. 페이지가 만들어진 이후에는 [전체페이지]에서 접속하여 편집할 수 있지만, EYE DESIGN에서 바로 접속하여 편집할 수도 있습니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=5" fileperm_read="" board_seq="5" board_id="faq"><a>메인페이지에 상품을 노출하려면 어떻게 해야 하나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  5</span>
				</p>
			</div>
			<div id="faqcontent_5" class="answer hide">
				<p>메인화면에 상품을 노출하려면 EYE DESIGN의 [상품 디스플레이 넣기]를 이용하시면 됩니다.</p><p><br></p><p><br></p><p>1. 관리자 로그인 &gt; 오른쪽 위 상단의 디자인 - 디자인 환경(PC)를 클릭합니다.</p><p><br></p><p>2. EYE DESIGN에서는 해당 페이지가 파란색 글씨로 표시되는데, 여기에서 마우스 오른쪽 버튼을 클릭하여 [상품디스플레이 넣기]를 선택합니다. (아이디자인의 메인- 메인화면 에서 마우스 오른쪽을 클릭)</p><p><br></p><p>3. 상품디스플레이 만들기를 통해 새로운 리스트를 만들거나, 기존에 있는 리스트에서 수정을 눌러 상품의 정보를 설정할 수 있습니다.</p><p><br></p><p>4. 상품을진열하기 위한 스타일, 노출 개수, 이미지 꾸미기, 상품 정보 등의 설정을 진행합니다.</p><p><br></p><p>5. 추가한 디스플레이를 삽입합니다.</p><p><br></p><p>6. HTML소스에서 상품 디스플레이 치환코드를 확인할 수 있으며, 치환코드 위치에 따라 상품이 노출되는 위치가 변경됩니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=4" fileperm_read="" board_seq="4" board_id="faq"><a>팝업은 어디에서 띄우나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  4</span>
				</p>
			</div>
			<div id="faqcontent_4" class="answer hide">
				<p>팝업은 원하는 페이지에서 EYE DESIGN을 이용하여 띄울 수 있습니다.</p><p><br></p><p>1. 팝업을 띄울 페이지로 들어가서 EYE DESIGN에서 마우스 오른쪽 버튼을 클릭하여 [띠배너/팝업 띄우기]를 클릭합니다.&nbsp;</p><p>2. 리스트에서 원하시는 팝업을 [선택]하여 [적용]하거나, 팝업만들기를 클릭하여 새로운 팝업을 만들 수 있습니다.</p><p>&nbsp; - 팝업을 새로 만드는 경우에는 [팝업 만들기]를 통해 만들 수 있습니다.</p><p>&nbsp; - 기존 팝업을 수정하시려면 [수정] 버튼을 클릭하면 됩니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=3" fileperm_read="" board_seq="3" board_id="faq"><a>하이웍스가 무엇인가요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  3</span>
				</p>
			</div>
			<div id="faqcontent_3" class="answer hide">
				<p>하이웍스는 가비아에서 제공하는 비즈니스 통합 솔루션입니다.</p><p>퍼스트몰을 이용하시는 경우에 “하이웍스 웹메일/웹하드/전자세금계산서”를 무료로 제공하고 있습니다.</p><p><br></p><p>하이웍스는 "영문도메인"이 연결되어야 신청이 가능하며, https://www.firstmall.kr MY퍼스트몰에서 신청할 수 있습니다.</p><p><br></p><p>1. 퍼스트몰 사이트 (http://firstmall.kr/) 로그인을 하신 후 상단 오른쪽의 [MY퍼스트몰]을 클릭합니다.</p><p>2. 하이웍스를 신청할 쇼핑몰의 '임시도메인'을 클릭합니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=2" fileperm_read="" board_seq="2" board_id="faq"><a>쇼핑몰의 IP(아이피) 확인은 어떻게 할 수 있나요?</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  2</span>
				</p>
			</div>
			<div id="faqcontent_2" class="answer hide">
				<p>쇼핑몰 서버의 IP는 아래와 같이 확인해 보실 수 있습니다.</p><p><br></p><p>1. 윈도우의 [검색] 아이콘을 클릭한 후,</p><p>2. cmd 라고 입력합니다.</p><p>3. 명령 프롬프트를 클릭하여 실행합니다.</p><p>4. 명령 프롬프트에서 'ping 쇼핑몰 도메인'을 입력후 실행하면 이용하시는 쇼핑몰 서버의 IP를 확인하실 수 있습니다.</p>
			</div>
		</li>
		<li>
			<div class="question">
				<p class="subject"> <span class="cat">[기타]</span> <span class="hand highlight-link boad_faqview_btn " viewtype="page" pagetype="" viewlink="/board/view?id=faq&amp;seq=1" fileperm_read="" board_seq="1" board_id="faq"><a>이미지 등록을 하고싶은데 [찾아보기]버튼이 안나와요.</a> &nbsp;&nbsp; </span>    </p>
				<p class="add_info">
					<span class="hide">번호:  1</span>
				</p>
			</div>
			<div id="faqcontent_1" class="answer hide">
				<p style="box-sizing: inherit; font-family: " spoqa="" han="" sans",="" "malgun="" gothic",="" "apple="" sd="" gothic="" neo",="" dotum,="" sans-serif;="" color:="" rgb(102,="" 102,="" 102);="" font-size:="" 16px;="" text-align:="" left;"="">'상품 등록 시 이미지 등록' 또는 '디자인환경에서의 이미지 등록'시에 [찾아보기]버튼이보이지 않을 때, Adobe Flash Player의 업그레이드와 관련이 있을 수 있습니다.</p><p style="box-sizing: inherit; font-family: " spoqa="" han="" sans",="" "malgun="" gothic",="" "apple="" sd="" gothic="" neo",="" dotum,="" sans-serif;="" color:="" rgb(102,="" 102,="" 102);="" font-size:="" 16px;="" text-align:="" left;"="">1. 인터넷 익스플로어는 아래 링크로 접속하셔서 플래시 플레이어의 버전을 최신버전으로 업그레이드 하시기 바랍니다.</p><p style="box-sizing: inherit; font-family: " spoqa="" han="" sans",="" "malgun="" gothic",="" "apple="" sd="" gothic="" neo",="" dotum,="" sans-serif;="" color:="" rgb(102,="" 102,="" 102);="" font-size:="" 16px;="" text-align:="" left;"=""><a href="https://get.adobe.com/kr/flashplayer/" style="box-sizing: inherit; font-weight: inherit; font-size: inherit; color: rgb(0, 154, 250); line-height: 1.5; text-decoration-line: underline; margin: 0px; padding: 0px;">https://get.adobe.com/kr/flashplayer/</a></p><p style="box-sizing: inherit; font-family: " spoqa="" han="" sans",="" "malgun="" gothic",="" "apple="" sd="" gothic="" neo",="" dotum,="" sans-serif;="" color:="" rgb(102,="" 102,="" 102);="" font-size:="" 16px;="" text-align:="" left;"="">2. 크롬은 Flash 사용을 허용으로 변경하여 주시기 바랍니다.</p><p style="box-sizing: inherit; font-family: " spoqa="" han="" sans",="" "malgun="" gothic",="" "apple="" sd="" gothic="" neo",="" dotum,="" sans-serif;="" color:="" rgb(102,="" 102,="" 102);="" font-size:="" 16px;="" text-align:="" left;"=""><br></p><p style="box-sizing: inherit; font-family: " spoqa="" han="" sans",="" "malgun="" gothic",="" "apple="" sd="" gothic="" neo",="" dotum,="" sans-serif;="" color:="" rgb(102,="" 102,="" 102);="" font-size:="" 16px;="" text-align:="" left;"=""><img src="https://interface.firstmall.kr/firstmall_plus/sample_img/responsive_ver1_default_gl/board/faq/ed5277e7c19ac622b24738d03e3c1e671000181.png" class="txc-image" style="clear:none;float:none;"></p><p style="box-sizing: inherit; font-family: " spoqa="" han="" sans",="" "malgun="" gothic",="" "apple="" sd="" gothic="" neo",="" dotum,="" sans-serif;="" color:="" rgb(102,="" 102,="" 102);="" font-size:="" 16px;="" text-align:="" left;"=""><br></p>
			</div>
		</li>
	</ul>
	<script type="text/javascript">
			// FAQ 게시글 보기
			$('.boad_faqview_btn').on('click', function() { 
				var board_seq = $(this).attr('board_seq');
				$("#faqcontent_"+board_seq).toggle();
			}); 
	</script>
					</div>
				</div>
			</div>
	</div>
</div>
    
<!-- <h1>Q&amp;A</h1> -->