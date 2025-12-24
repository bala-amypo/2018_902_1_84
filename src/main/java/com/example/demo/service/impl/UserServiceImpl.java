import com.example.demo.dto.AuthRequest;

public void login(AuthRequest request) {
    String email = request.getEmail();
    String password = request.getPassword();
}

public void register(AuthRequest request) {
    String email = request.getEmail();
    String password = request.getPassword();
}
