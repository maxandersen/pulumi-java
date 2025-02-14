// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ActingUserResponse {
    /**
     * @return The email address of the user when the user performed the action.
     * 
     */
    private final String email;
    /**
     * @return A profile image URL for the user. May not be present if the user has changed their email address or deleted their account.
     * 
     */
    private final String imageUrl;

    @CustomType.Constructor
    private ActingUserResponse(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("imageUrl") String imageUrl) {
        this.email = email;
        this.imageUrl = imageUrl;
    }

    /**
     * @return The email address of the user when the user performed the action.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return A profile image URL for the user. May not be present if the user has changed their email address or deleted their account.
     * 
     */
    public String imageUrl() {
        return this.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActingUserResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String imageUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ActingUserResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.imageUrl = defaults.imageUrl;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = Objects.requireNonNull(imageUrl);
            return this;
        }        public ActingUserResponse build() {
            return new ActingUserResponse(email, imageUrl);
        }
    }
}
