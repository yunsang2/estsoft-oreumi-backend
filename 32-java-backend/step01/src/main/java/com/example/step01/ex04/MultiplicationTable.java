package com.example.step01.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multiplication")
public class MultiplicationTable extends HttpServlet {
    public MultiplicationTable() {
        super();
        System.out.println("CALL: MultiplicationTable#MultiplicationTable()");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("CALL: MultiplicationTable#doGet()");

        // 클라이언트에서 전송한 데이터의 문자 인코딩 설정
        request.setCharacterEncoding("UTF-8");

        // HttpServletRequest  인스턴스의 getParameter 메서드로
        // 클라이언트에서 전송한 데이터를 참조
        String number = request.getParameter("number");

        // 응답할 데이터의 미디어 형식 설정
        response.setContentType("text/html; charset=UTF-8");

        // 서블릿 컨테이너에세 응답할 데이터를 전달하기 위해 출력 스트림을 생성
        PrintWriter out = response.getWriter();

        // 유효성 검사(2보다 작거나 9보다 크면 거짓을 반환)
        // 문자열 입력시 거짓 반환
        boolean valid = true;
        int dan = 0;

        if (number == null || number.trim().isEmpty()) {
            valid = false;
        } else {
            try {
                dan = Integer.parseInt(number.trim());
                if (dan < 2 || dan > 9) {
                    valid = false;
                }
            } catch (NumberFormatException e) {
                valid = false;
            }
        }


        // 응답할 데이터를 HTML 형식으로 생성
        String html = """
        <!DOCTYPE html>
        <html lang="ko">
        <head>
            <meta charset="UTF-8">
            <title>multiplication</title>
        </head>
        <body>

        <h1>Multiplication Table</h1>

        <div>
        """;

        if (number != null && !number.trim().isEmpty()) {
            if (valid) {
                for (int i = 1; i <= 9; i++) {
                    html += dan + " x " + i + " = " + (dan * i) + "<br>";
                }
            } else {
                html += "<span>2부터 9까지의 숫자만 입력하세요.</span><br>";
            }
        }

        html += """
        </div>

        <form action="multiplication" method="get">
            <p>
                <label>
                    Multiplication table for
                    <input type="text" name="number" required>
                </label>
                <input type="submit" value="Print">
            </p>
        </form>

        </body>
        </html>
        """;
        // PrintWriter 인스턴스의 print 메서드로 출력 스트림에 응답 데이터를 출력
        out.print(html);

        // 출력 스트림 닫기
        out.close();
    }
}