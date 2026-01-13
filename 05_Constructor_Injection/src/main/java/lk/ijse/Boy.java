package lk.ijse;

public class Boy {
    Agreement agreement;

    public Boy(Agreement agreement) {
        this.agreement = agreement;
    }

    public static void main(String[] args) {
        Boy boy = new Boy(new Girl());
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
