public class SSHer {
    // instance variables
    private String username;
    private String password;

    // constructor
    public SSHer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // toString method
    public String toString() {
        return "Username: " + username + "\nPassword: " + password;
    }

    // getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // mutators
    public String SSH() {
        int i = 0;
        while(i < password.length()) {

            // Lowercase
            if(password.charAt(i) == 'a') {
                password = password.substring(0, i) + "1" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'b') {
                password = password.substring(0, i) + "2" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'c') {
                password = password.substring(0, i) + "3" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'd') {
                password = password.substring(0, i) + "4" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'e') {
                password = password.substring(0, i) + "5" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'f') {
                password = password.substring(0, i) + "6" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'g') {
                password = password.substring(0, i) + "7" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'h') {
                password = password.substring(0, i) + "8" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'i') {
                password = password.substring(0, i) + "9" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'j') {
                password = password.substring(0, i) + "10" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'k') {
                password = password.substring(0, i) + "11" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'l') {
                password = password.substring(0, i) + "12" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'm') {
                password = password.substring(0, i) + "13" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'n') {
                password = password.substring(0, i) + "14" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'o') {
                password = password.substring(0, i) + "15" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'p') {
                password = password.substring(0, i) + "16" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'q') {
                password = password.substring(0, i) + "17" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'r') {
                password = password.substring(0, i) + "18" + password.substring(i + 1);
            }
            if (password.charAt(i) == 's') {
                password = password.substring(0, i) + "19" + password.substring(i + 1);
            }
            if (password.charAt(i) == 't') {
                password = password.substring(0, i) + "20" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'u') {
                password = password.substring(0, i) + "21" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'v') {
                password = password.substring(0, i) + "22" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'w') {
                password = password.substring(0, i) + "23" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'x') {
                password = password.substring(0, i) + "24" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'y') {
                password = password.substring(0, i) + "25" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'z') {
                password = password.substring(0, i) + "26" + password.substring(i + 1);
            }

            // Uppercase
            if (password.charAt(i) == 'A') {
                password = password.substring(0, i) + "11" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'B') {
                password = password.substring(0, i) + "22" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'C') {
                password = password.substring(0, i) + "33" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'D') {
                password = password.substring(0, i) + "44" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'E') {
                password = password.substring(0, i) + "55" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'F') {
                password = password.substring(0, i) + "66" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'G') {
                password = password.substring(0, i) + "77" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'H') {
                password = password.substring(0, i) + "88" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'I') {
                password = password.substring(0, i) + "99" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'J') {
                password = password.substring(0, i) + "1010" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'K') {
                password = password.substring(0, i) + "1111" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'L') {
                password = password.substring(0, i) + "1212" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'M') {
                password = password.substring(0, i) + "1313" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'N') {
                password = password.substring(0, i) + "1414" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'O') {
                password = password.substring(0, i) + "1515" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'P') {
                password = password.substring(0, i) + "1616" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'Q') {
                password = password.substring(0, i) + "1717" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'R') {
                password = password.substring(0, i) + "1818" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'S') {
                password = password.substring(0, i) + "1919" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'T') {
                password = password.substring(0, i) + "2020" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'U') {
                password = password.substring(0, i) + "2121" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'V') {
                password = password.substring(0, i) + "2222" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'W') {
                password = password.substring(0, i) + "2323" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'X') {
                password = password.substring(0, i) + "2424" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'Y') {
                password = password.substring(0, i) + "2525" + password.substring(i + 1);
            }
            if (password.charAt(i) == 'Z') {
                password = password.substring(0, i) + "2626" + password.substring(i + 1);
            }
            i++;
        }
        return password;
    }
}