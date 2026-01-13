package lk.ijse;

public class Boy {
    Agreement agreement = new Girl();
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl01();
        boy.chatWithGirl02();
    }

    public void chatWithGirl01() {
        agreement.chat();
    }

    public void chatWithGirl02() {
        agreement.chat();
    }
}
