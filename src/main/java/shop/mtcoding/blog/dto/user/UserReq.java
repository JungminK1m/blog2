package shop.mtcoding.blog.dto.user;

import lombok.Getter;
import lombok.Setter;

public class UserReq {

    @Getter
    @Setter
    public static class joinReqDto {
        private String username;
        private String password;
        private String email;
    }
}
