package oop_hus.lab11.iterator.ex2;

public class FacebookIterator implements ProfileIterator {

    private Facebook facebook;
    private Profile[] cache;
    private String profileId;
    private String type;
    private int currentPosition;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    public Facebook getFacebook() {
        return facebook;
    }

    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    private void lazyInit() {
        if (cache == null) {
            // cache = facebook.socialGraphRequest(profileId, type)
        }
    }

    @Override
    public Profile getNext() {
        Profile result;
        if (hasMore()) {
            result = cache[currentPosition];
            currentPosition++;
            return result;
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }
}
