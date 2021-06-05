public class SocialHandleExtender extends SocialActivity{
    private SocialFunctionality socialFunctionality;
    SocialHandleExtender(SocialFunctionality sf) {
        this.socialFunctionality = sf;
    }

    @Override
    public void postUpdate() {
        this.socialFunctionality.postUpdate();
    }
}
