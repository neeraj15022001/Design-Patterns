public class Main {
    public static void main(String[] args) {
        SocialActivity sf = new SocialActivity();
        sf.postUpdate();
        SocialFunctionality ig = new Instagram(new SocialActivity());
        ig.postUpdate();
        SocialFunctionality fb = new Facebook(new SocialActivity());
        fb.postUpdate();
        SocialFunctionality tt = new Twitter(new SocialActivity());
        tt.postUpdate();
        SocialFunctionality igfbtt = new Instagram(new Twitter(new Facebook(new SocialActivity())));
        igfbtt.postUpdate();
    }
}
