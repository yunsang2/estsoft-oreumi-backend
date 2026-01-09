문서 객체 모델(DOM)
 웹 브라우저가 HTML 문서를 인식하는 방식
 좁은 의미로 document 객체와 관련된 객체의 집합을 말한다
 HTML DOM에서 모든것은 노드이다

DOM 탐색
 document 객체와 HTMLElement 객체를 통해 DOM를 참조하거나 설정한다
 JavaScript 프로그램에서 DOM에 포함된 HTML 요소에 접근하려면 먼저 DOM에서 그요소에 접근해야하는 데 이를 DOM 탐색이라고 한다

DOM API
 JavaScript 와 같은 프로그래밍 언어에서 DOM 에 접근해서 참조하고 수정할 수 있도록 제공하는 기능
 일반적으로 속성과 메서드를 갖는 JavaScript객체로 제공된다
 브라우저는 HMTL 문서를 해석해서 DOM을 생성하고 메모리에 적재한다


    
    HTMLElement 객체를 탐색하는 메서드

        메서드                                  인자            반환 값

        document.getElementById(id)             id 속성값       Element 객체

        document.getElementByClassName(class)   class 속성값    Element 객체들의 배열

        document.getElementByTagName(tagname)   태그 이름       Element 객체들의 배열

        document.getElementByName(name)         name 속성값     Element 객체들의 배열

        document.querySelector(selector)        CSS 선택자      Element 객체

        document.querySelectorAll(selector)     CSS 선택자      Element 객체들의 배열


    HTML 요소의 내부 텍스트 참조와 설정

        element.innerHTML   HTML 요소의 내부 HTML 마크업
         후손요소의 태그까지 포함한 문자열

        element.innerText   HTML 요소의 내부 텍스트
         후손요소의 태그를 제거한 순수한 문자열
         순수한 텍스트만 가져오는일은 별로 없어 잘 사용하지 않는다

        node.textContent    HTML 요소의 내부 텍스트
         해당 속성은 Node가 어떤 객체인가에 따라 값이 달라진다
         document, Doctype 이면 null
         주석, 처리명령,텍스트 노드 이면 Node.nodeValue 속성과 같다
         그외 유형 이면 주석과 처리명령을 제외한 모든 자식노드의 textContent 와 같다


    HTML 요소의 속성 참조와 설정

        element.getAttribute(name)  HTML 요소의 속성 값 반환

        element.setAttribute(name, value)  HTML 요소의 속성 설정


    HTML 요소의 객체 속성과 스타일 속성
     CSS 블록에서 적용된 스타일 속성은 JavaScript 프로그램으로 접근할 수 없다
     인라인 스타일을 설정하기에 스타일 속성에 접근할 수 있다(인라인 스타일은 CSS 블록중 우선순위가 가장 높기때문에)
     속성 접근시 - 으로 연결되는 단어는 대문자로 변형해 작성한다
     ex) font-family = fontFamily

        (스타일 속성을 찾기 어려워 져서 비추)


    HTML 요소의 객체의 생성과 추가, 제거

        document.createElement(tagname)     tagname으로 새로운 HTMLElement 객체를 생성 

        document.createTextNode(text)       text로 텍스트 노드를 생성

        element.appendChild(node)           새로운 노드를 객체에 추가


    HTML 요소의 객체의 제거

        element.removeChild(child)          HTMLElement 객테의 자식 노드인 child를 제거
        

    HTML 요소의 객체의 복제

        element.cloneNode(deep)             element 객체를 복제해서 새로운 HTMLElement 객체 생성


    메서드 체이닝
     메서드를 연달아 호출하는 프로그램밍 기법
     앞써 있는 메서드가 객체를 호출하면 연달아 메서드를 호출