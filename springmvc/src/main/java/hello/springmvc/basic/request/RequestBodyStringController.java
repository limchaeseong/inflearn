package hello.springmvc.basic.request;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

@Slf4j
@Controller
public class RequestBodyStringController {

    @PostMapping("/request-body-string-v1")
    public void requestBodyString(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        log.info("messageBody={}", messageBody);
        response.getWriter().write("request-body-string-v1(response baisc) Ok");
    }

    @PostMapping("/request-body-string-v2")
    public void requestBodyStringV2(InputStream inputStream, Writer responseWriter) throws IOException {

        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        log.info("messageBody={}", messageBody);
        responseWriter.write("request-body-string-v2(method argument - inputStream, responseWriter) Ok");
    }

    @PostMapping("/request-body-string-v3")
    public HttpEntity<String> requestBodyStringV3(HttpEntity<String> httpEntity) throws IOException {

        String messageBody = httpEntity.getBody();
        HttpHeaders messageHeader = httpEntity.getHeaders();

        log.info("messageHeader={}", messageHeader);
        log.info("messageBody={}", messageBody);

        return new HttpEntity<>("request-body-string-v3(method argument - HttpEntity) Ok");
    }

    @PostMapping("/request-body-string-v3-1")
    public ResponseEntity<String> requestBodyStringV3_1(RequestEntity<String> requestEntity) throws IOException {

        String messageBody = requestEntity.getBody();
        HttpHeaders messageHeader = requestEntity.getHeaders();

        log.info("messageHeader={}", messageHeader);
        log.info("messageBody={}", messageBody);

        return new ResponseEntity<>("request-body-string-v3_1(method argument - RequestEntity, ResponseEntity) Ok", HttpStatus.ACCEPTED);
    }

    @ResponseBody
    @PostMapping("/request-body-string-v4")
    public String requestBodyStringV4(@RequestBody String messageBody) throws IOException {

        log.info("messageBody={}", messageBody);

        return "request-body-string-v4(RequestBody, ResponseBody) Ok";
    }
}
