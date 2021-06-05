public class Instagram extends SocialHandleExtender{
    public Instagram(SocialFunctionality sf) {
        super(sf);
    }
    @Override
    public void postUpdate() {
        super.postUpdate();
        System.out.println("Adding Instagram Functionality");
    }
}
