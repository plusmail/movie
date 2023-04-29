package dbclass.movie.exceptionHandler;

import lombok.Getter;

@Getter
public class AccessTokenExpireException extends RuntimeException {

    public AccessTokenExpireException(String message) {
        super(message);
    }
}
