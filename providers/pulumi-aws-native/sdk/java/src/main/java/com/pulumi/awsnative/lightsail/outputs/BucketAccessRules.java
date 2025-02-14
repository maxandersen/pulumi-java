// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketAccessRules {
    /**
     * @return A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual objects override the getObject option that is currently specified.
     * 
     */
    private final @Nullable Boolean allowPublicOverrides;
    /**
     * @return Specifies the anonymous access to all objects in a bucket.
     * 
     */
    private final @Nullable String getObject;

    @CustomType.Constructor
    private BucketAccessRules(
        @CustomType.Parameter("allowPublicOverrides") @Nullable Boolean allowPublicOverrides,
        @CustomType.Parameter("getObject") @Nullable String getObject) {
        this.allowPublicOverrides = allowPublicOverrides;
        this.getObject = getObject;
    }

    /**
     * @return A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual objects override the getObject option that is currently specified.
     * 
     */
    public Optional<Boolean> allowPublicOverrides() {
        return Optional.ofNullable(this.allowPublicOverrides);
    }
    /**
     * @return Specifies the anonymous access to all objects in a bucket.
     * 
     */
    public Optional<String> getObject() {
        return Optional.ofNullable(this.getObject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessRules defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowPublicOverrides;
        private @Nullable String getObject;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPublicOverrides = defaults.allowPublicOverrides;
    	      this.getObject = defaults.getObject;
        }

        public Builder allowPublicOverrides(@Nullable Boolean allowPublicOverrides) {
            this.allowPublicOverrides = allowPublicOverrides;
            return this;
        }
        public Builder getObject(@Nullable String getObject) {
            this.getObject = getObject;
            return this;
        }        public BucketAccessRules build() {
            return new BucketAccessRules(allowPublicOverrides, getObject);
        }
    }
}
