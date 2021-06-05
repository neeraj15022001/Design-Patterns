public class Twitter extends SocialHandleExtender{
    public Twitter(SocialFunctionality sf) {
        super(sf);
    }
    @Override
    public void postUpdate() {
        super.postUpdate();
        System.out.println("Adding Twitter Functionality");
    }
}
