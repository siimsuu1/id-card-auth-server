package ee.ria.webapp.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ErrorDetails {
    private LocalDateTime timestamp;
    private String errorCode;
    private String message;
}
