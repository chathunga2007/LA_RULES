package lk.ijse;

public class Boy implements DI {
    Agreement agreement;

    @Override
    public void inject(Agreement agreement) {
        this.agreement = agreement;
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.inject(new Girl());
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