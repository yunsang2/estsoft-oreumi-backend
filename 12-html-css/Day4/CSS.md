글자 스타일 속성
    CSS에서 글자 스타일 속성은 상속이 가능하다
        
        font-variant 스타일 속성
         글자의 변형을 지정
            normal - 일반글자로 지정(기본값)
            small-caps - 출력될 글자를 작은 대문자로 지정

        line-height 스타일 속성
         행의 높이를 지정하는 스타일 속성 기본값은 HTML요소의 적용된 글꼴에 따라 적용
         텍스트는 행의 중간에 배치되기에 HTML 요소에서 내부 텍스트를 수직 정렬할 때 사용
         한줄로 표시되는 내부 택스트를 콘텐트 영역의 가운데에 표시하기위해 사용
         (글짜 위, 아래 여백과 글씨 높이를 지정한다고 보면 됨)
         (작성시 '{ line-height: 1.2; }' 라는건 현재 글자 크기의 1.2배 라는거다)
         그래서 1.5 = 1.5em = 150% 는 다 같은 말이다


         font 스타일 속성
          위에 작성한 글자 관련 속성 값은 font 로 묶어서 한번에 표현 가능하며
          순서 상관없이 작성하되 size, family는 생략이 안된다
          그래서 line-height같은 경우 size 뒤에 / 를 작성후 작성되야한다

        letter-spacing 스타일 속성
         글자와 글자 사이의 간격을 지정
         (-) 음수로도 표현하는데 그럴 경우 진행방향의 반대방향으로 지정된다
            normal - 보통 자간으로 지정(기본값)
            Length - 크기 단위로 자간 설정
            ex) letter-spacing: 2px = 간격을 normal 보다 2px 넓힌다
            letter-spacing: -2px = 간격을 normal 보다 2px 좁힌다

        text-align 스타일 속성
         글자의 정렬을 지정
            left - 왼쪽 정렬(기본값)
            right - 오른쪽 정렬
            center - 가운데 정렬
            justify - 양쪽 정렬

        text-decoration 스타일 속성
         선을 그어 글자를 꾸미기 위해 사용하는 단축 스타일 속성 
         none 이 한글에는 기본적으로 들어간다

            text-decoration-line 스타일 속성
             텍스트에 추가하는 장식용 선의 종류를 지정

            text-decoration-color 스타일 속성
             텍스트에 추가하는 장식용 선의 색상을 지정

            text-decoration-style 스타일 속성
             텍스트에 추가하는 장식용 선의 스타일을 지정

            text-decoration-thickness 스타일 속성 
             텍스트에 추가하는 장식용 선의 두께을 지정
                auto 
                from-font
                Length
                percentage

                
        text-indent 스타일 속성
         HTML 요소의 내부 텍스트 첫 번째 줄의 들여쓰기 너비를 지정
         크기 단위나 퍼센트 단위로 들여쓰기 할 너비를 지정한다
         (기본값은 0)또한 음수로 지정 가능하다(내어쓰기)

        <pre> 태그
         HTMl 문서에 작성된 내부 텍스트를 작성된 형태 그대로 뷰 포트에 작성된다
         (monospace 글꼴 기본값) 
        
        white-space 스타일 속성
         요소의 내부 텍스트에 포함된 공백문자를 어떻게 처리할것인지 지정
            normal - 다수의 공백문자를 전부 무시하고 1개로 표현(기본값)
            nowrap - 개행을 하지 않는다
            pre - 공백문자를 그대로 출력
            pre-wrap - 공백문자를 그대로 출력, 요소의 경계를 만나면 개행
            pre-line - 다수의 공백문자를 전부 무시하고 1개로 출력, 요소의 경계를 만나면 개행, 문서의 쓰인데로 개행



    CSS 목록 스타일 속성

        list-style-type
         목록에서 목록 항목의 마커의 종류를 지정
            none - 마커를 표시하지 않음(기본값)
            disc - 마커를 속이 꽉찬 원으로 지정(<ul>요소의 기본값)
            circle - 마커를 속이 빈 원으로 지정
            square - 마커를 사각형으로 지정
            decimal - 마커를 정수로 지정(<ol>요소의 기본값)
            lower-alpha, upper-alpha - 소문자, 대문자로 지정
            (a,b,c), (A,B,C)
            lower-roman, upper-roman - 로마자 숫자로 소문자, 대문자로 지정
            (i, ii, iii), (I, II, III)

        list-style-position
         목록의 목록 항목의 마커 부분의 컨텐트 영역 이동 지정
            outside - 컨텐트 영역 밖에 마커 지정
            inside - 컨텐트 영역 안에 마커 지정

        list-style-image
         목록에서 목록 항목의 마커를 대신할 이미지 지정
            none - 지정하지 않고 기본값사용
            url() - 해당 경로에 이미지를 마커로 지정

        list-style
         위에 속성을 한번에 지정 순서에 상관없고 생략가능(기본값)



    CSS 그림자 스타일 속성

        text-shadow - HTMl 요소의 내부 텍스트에 그림자 효과를 지정
        box-shadow - border box에 그림자 효과를 지정
        ex)text-shadow: h-shadow v-shadow [ blur-radius ] color;
            h-shadow - 수평 위치
            v-shadow - 수직 위치
            blur-radio - 번지는 효과 (기본값 0, 생략 가능)
            color - 그림자 색상



    HTML 요소의 배치 방식과 위치 지정

        position 스타일 속성
         HTML 요소의 위치 설정 방식을 지정
            static - 문서의 일반적인 흐름에따라 배치(기본값)
            relative - 문서의 일반적인 흐름에따라 배치하고
            absolute - 일반적인 흐름을 제거하고 조상 요소중 가장 가까운 위치 지정 요소의 padding box에 배치 없다면 초기 컨테이닝 블럭에 배치
            fixed  -  특정영역을 기준으로 배치

        컨테이닝 블록
         HTML요소의 크기나 위치는 컨테이닝 블록에 영향을 받으며 속성 값에 따라 컨테이닝 블록이 달라진다
            static, relative - 그 요소와 가장 가까운 블록 레벨 조상 요소의 콘텐트 영역
            absolute - 조상 요소중 가장 가까운 위치 지정 요소의 padding을 포함한 영역이거나 조상 요소중 위치 지정 요소가 없는 경우 초기 컨테이닝 블록
                       조상 요소중 위치 지정 요소가 없는 경우 초기 컨테이닝 블록(최상위 요소의 컨테이닝 블록)으로 찾아간다
            fixed - 브라우저 화면(뷰 포트)

        기준 영역
         위치 지정 요소가 배치될때 기준으로 삼는 영역을 말하며,position 스타일 속성의 값에 따라
         HTML 요소의 기준영역이 달라진다
            relative - 요소의 문서의 일반적인 흐름에 따라 배치됐을때의 영역
            absolute, fixed - 컨테이닝 블럭
            

        top, right, bottom, left 스타일 속성
         기준 영역을 기준으로 HTML요소와의 간격을 지정
            auto - 상황에 따라 브라우저가 계산해서 지정(기본값)
            Length - 크기 단위를 사용해서 지정
            percentage - 컨테이닝 블럭 크기의 백분율을 사용해서 지정

        각 스타일 속성의 % 단위의 기준
            weight,height - 컨테이닝 블록의 너비,높이
            margin,padding - 컨테이닝 블록의 너비
            border-radius - 방향에 따라, HTMl 요소의 너비 또는 높이

        overfloat(넘치는 요소를 제거)

        float 스타일 속성
         HTML 요소를 문서의 일반적인 흐름에서 제거하고, 부유하는 요소를 설정
         이지미를 글자 위에 띄우기 위해 만들어진 스타일 속성
            none - 요소를 띄우지 않고 원래 자리에 있도록 함(기본값)
            lefr - 요소를 띄우고 컨테이닝 블록의 왼쪽으로 붙임
            right - 요소를 띄우고 컨테이닝 블록의 오른쪽으로 붙임

        부유하는 요소의 특징
         부유하는 요소는 컨테이닝 블록의 수평방향 영역을 벗어날수 없다
         다른 콘텐츠는 부유하는 요소를 피해서 배치된다
         부유하는 요소는 다른 부유하는 형형 제요소의 형제가 될수 없다

        z-index 스타일 속성
         위치 지정 요소의 쌓이는 순서를 지정한다
         기본값은 auto 이며 속성값으로 정수를 지정한다
         정수가 클수록 위에 배치 된다



CSS Flexible Box 레이아웃
 행, 열 형태로 요소들을 수용된 공간에 배치하는 일차원 레이아웃
 배치되는 요소 하나하나는'아이템 요소'라 하며
 그 요소들이 나열되는 공간을'컨테이너'라 하며
 요소들이 배치되고있는 방향으로 진행되는 축을'기본 축'이라고 하며
 기본축이 시작되는 점이'main start'라 하고 끝나는 점을 'main end'라 한다
 그리고 배치되는 방향의 수직을 이루는 축을'cross axis'라 하며 위에서 아래로 진행
 'cross axis'가 시작하는 점이'cross start' 라 하고 끝나는 점을 'cross end'라 한다
 아이템 요소 의 진행방향과 평행하는 크기가 'main size', 수직되는 크기는'cross size'라 한다


    컨테이너 요소들에 적용하는 스타일 속성 

        display 스타일 속성
         HTML 요소를 블록 또는 인라인 형식의 플렉스 컨테이너로 설정한다

        flex 스타일 속성
         요소를 블록 또는 인라인 형식의 플렉스 컨테이너로 설정
        
        flex-direction 스타일 속성
         아이템들을 배치할 기본 축의 방향을 설정
            row - 왼쪽부터 오른쪽으로 (기본값)
            column - 위에서 아래로 
            row-reverse, column-reverse - 반대 방향으로
       
        flex-wrap 스타일 속성
         모든 아이템 요소들을 한 행에 배치할 여유 공간이 없을때 줄 바꿈을 할 것 인지 설정
            nowrap - 공간이 없으면 최대한 너비를 줄임 (기본값)
            wrap - 자기 크기대로 설정 자리가 없으면 아래로 내려감
            wrap-reverse - 자기 크기대로 설정 자리가 없으면 위로 올라감

        flex-flow 스타일 속성
         direction, wrap 속성을 한번에 설정하는 속성

        justify-content 스타일 속성
         기본 축 상에서 아이템 요소들의 배치 기준점과 여백을 설정
            flex-start(normal) - 왼쪽부터 차례대로 지정 남는 공간이 있어도 채우지 않음(기본값)
            flex-end - 오른쪽으로 붙음
            center - 가운데로 모임
            space-between - 시작되는 요소는 main start쪽에 붙고 마지막요소는 main end 쪽에 딱 붙음 사이에 있는 요소들의 간격은 일정하게 설정
            space-around - 아이템 요소들의 갯수만큼 기본 축을 나누고 나눈 한 가운데 요소를 배치(여백, 위치가 동일)
            space-evenly - main start와 요소의 간격, 요소와 요소의 간격, 요소와 main end의 간격을 동일하게 설정

        align-items 스타일 속성
         교차 축 상에서 한 행으로 배치된 아이템 요소들의 정렬 방법을 설정
            flex-start - 위에 설명과 같지만 수평이 아닌 수직
            flex-end - 동일하다
            center - 동일하다
            stretch - 아이템 요소들의 cross size를 높이만큼 늘림(기본값)
            baseline - 모든 아이템 요소들의 중싱을 1개로 맞추어서 설정

        align-content 스타일 속성
         교차축상에서 여러 행으로 배치된 아이템요소들의 배치 기준점과 여백을 설정
            flex-start - cross line 과 관련됨 설명은 위와 비슷
            flex-end - cross line 과 관련됨 설명은 위와 비슷
            center - cross line 과 관련됨 설명은 위와 비슷
            stretch - 위에 설정과 비슷하지만 여러줄일때 사용(기본값)
            space-between - cross line 과 관련됨 설명은 위와 비슷
            space-around - cross line 과 관련됨 설명은 위와 비슷
            space-evenly - cross line 과 관련됨 설명은 위와 비슷

        아이템 요소들의 정렬
         justify 라고 나오면 기본축 설정
         align 이라고 나오면 교차축 설정

         -content 정렬축을 기준으로 아이템 요소들이 여러줄로 배치
         -item 요소들이 정렬축으로 한줄로 배치

         gap 스타일 속성
          아이템 요소들 사이의 간격을 설정(컨테이닝 블럭 안 요소)
          아이템 요소들이 행과 열로 이루워져있다면 간격을 따로 설정가능
          row-gap, column-gap 으로 사용

    아이템 요소에 설정하는 스타일 속성
        (규칙적이지 않아서 선호하지 않음)

        overflow 스타일 속성
         HTML 요소의 영역을 벗어난 콘텐츠를 어떻게 처리할지 설정한다
            visible - HTML 요소의 영역을 벗어난 콘텐츠를 보여줌(기본값)
            hidden - HTML 요소의 영역을 벗어난 콘텐츠를 숨김 
            scroll - 스크롤 바를 생성해 HTML 요소위 영역을 벗어난 콘텐츠를 볼 수 있도록 함
            auto - HTML 요소의 영역을 벗어난 콘텐츠가 있으면 스크롤 바 생성

        text-overflow 스타일 속성
         HTML 요소의 영역을 벗어난 내부 텍스트를 어떻게 처리할지 설정
            clip - HTML 요소의 영역을 벗어난 내부 텍스트를 숨김(기본값)
            ellipsis - HTML 요소의 영역을 벗어난 내부 텍스트를 ... 으로 표현
            string - HTML 요소의 영역을 벗어난 내부 텍스트를 숨기고 string 으로 표현

        float 스타일 속성
         HTML 요소를 문서의 일반적인 흐름에서 제거하고, 부유하는 요소로 설정
         (다른 컨텐츠는 부유하고 있는 요소의 영역에 침범할 수 없다)
         이미지를 글자위에 띄우기 위해 만들어진 스타일 속성
         해당 부유하는 요소는 수평방향에서 벗어날수없고 다른 부유하는 형제요소에 들어갈수 없고 부모 요소에서도 제거된다
            none - HTML 요소를 띄우지 않고 원래 자리에 있도록 함(기본값)
            left - HTML 요소를 띄우고 컨테이닝 블록의 왼쪽으로 붙임
            right - HTML 요소를 띄우고 컨테이닝 블록의 오른쪽으로 붙임

        CSS Grid 레이아웃
         표 처럼 가로 행 과 세로 열의 형태로 아이템을 배치하기 위한 레이아웃
         flex 보다 설정할수있는게 많다



웹 페이지 레이아웃
 웹 페이지의 구성 요소들을 효과적으로 정리하고 배치하는 것
 대부분의 웹 페이지는 큰틀에서 보면 상당히 비슷한 레이아웃을 가진다
 헤더, 내비게이션, 사이드 바, 본문, 푸터 등으로 구분할수있다
    헤더(header)
    내비게이션(navigation)
    사이드 바(sidebar) 본문(content)
    푸터(footer)

웹 페이지 레이아웃 구분 순서
 -웹 페이지 구상
 -웹 페이지의 구성 영역 분리
 -구성 영역을 행 단위로 분리
 -나누어진 행의 내부 영역을 분리

HTML 5 시멘틱 구조 태그
    <header> - 문서 구조에서 상단 영역을 의미
    <nav> - 문서 구조에서 내비게이션을 의미
    <aside> - 문서 구조에서 주요 콘텐츠 부분 이외의 콘텐츠를 의미
    <main> - 문서 구조에서 주요 콘텐츠를 의미
    <section> - 문서 구조에서 문서의 전체적인 내용과 관련이 있는 콘텐츠들의 집합을 의미
    <article> - 문서 구조에서 하나의 독립적인 콘텐츠를 의미
    <footer> - 문서 구조에서 하단영 역을 의미
    <address> - 문서 구조에서 주소 영역을 의미(주로 <footer>영역에 포함)

CSS 초기화
 브라우저가 HTML 요소들에 기본적으로 설정하는 스타일 속성들을 제거
 모든 브라우저에서 이슷한 출력 결과를 얻기 위해 사용된다

 많이 사용되는 CSS 초기화 코드
  "Eric Meyer's Reset Css"
  "HTML5 Doctor Reset Stylesheet"
  "YUI 3 CSS Reset"


  


    고정 폭 레이아웃
     모든 영역의 폭이 일정한것을 고정 폭 레이아웃 이라고 한다
     (창의 크기와 상관없이)
