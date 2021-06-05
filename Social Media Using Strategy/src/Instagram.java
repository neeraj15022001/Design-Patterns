public class Instagram implements SocialHandles{
    private final String handleName;
//    private final SocialActivity socialActivityRef;
    public Instagram(String handleName) {
        this.handleName = handleName;
//        this.socialActivityRef = socialActivityRef;
    }
    @Override
    public String socialHandleName() {
        return this.handleName;
    }

    @Override
    public void askToPostAnUpdate() {
        System.out.println("Posting an update from " + this.handleName);
//        socialActivityRef.postUpdate();
    }
}
