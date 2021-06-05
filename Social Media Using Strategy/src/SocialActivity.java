public class SocialActivity implements SocialFunctionality{
    private SocialHandles currentSocialHandleUsed;
    public SocialActivity() {
        System.out.println("Using SocialActivity Constructor");
    }
    public SocialActivity(SocialHandles passedSocialHandle) {
        this.currentSocialHandleUsed = passedSocialHandle;
    }
    @Override
    public void postUpdate() {
        System.out.println("Posted an social update");
    }

    @Override
    public void changeCurrentHandleUsed(SocialHandles newSocialHandle) {
        this.currentSocialHandleUsed = newSocialHandle;
        System.out.println("Now new Social Handle being used is " + newSocialHandle.socialHandleName());
    }
}
