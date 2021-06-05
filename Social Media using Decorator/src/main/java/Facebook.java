public class Facebook extends SocialHandleExtender{
    public Facebook(SocialFunctionality sf) {
        super(sf);
    }
    @Override
    public void postUpdate() {
        super.postUpdate();
        System.out.println("Adding Facebook Functionality");
    }
}
