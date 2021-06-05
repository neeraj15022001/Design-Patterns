public class Main {
    public static void main(String[] args) {
        SocialActivity newSocialActivity = new SocialActivity();
        Facebook fb = new Facebook("Facebook",newSocialActivity);
        System.out.println(fb.socialHandleName());
        fb.askToPostAnUpdate();
        Twitter tt = new Twitter("Twitter", newSocialActivity);
        newSocialActivity.changeCurrentHandleUsed(tt);
        System.out.println(tt.socialHandleName());
        tt.askToPostAnUpdate();
        Instagram ig = new Instagram("Instagram", newSocialActivity);
        newSocialActivity.changeCurrentHandleUsed(ig);
        System.out.println(ig.socialHandleName());
        ig.askToPostAnUpdate();
    }
}
