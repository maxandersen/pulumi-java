// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.firebasehosting_v1beta1.outputs.ActingUserResponse;
import com.pulumi.googlenative.firebasehosting_v1beta1.outputs.VersionResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReleaseResponse {
    /**
     * @return The deploy description when the release was created. The value can be up to 512 characters.
     * 
     */
    private final String message;
    /**
     * @return The unique identifier for the release, in either of the following formats: - sites/SITE_ID/releases/RELEASE_ID - sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID This name is provided in the response body when you call [`releases.create`](sites.releases/create) or [`channels.releases.create`](sites.channels.releases/create).
     * 
     */
    private final String name;
    /**
     * @return The time at which the version is set to be public.
     * 
     */
    private final String releaseTime;
    /**
     * @return Identifies the user who created the release.
     * 
     */
    private final ActingUserResponse releaseUser;
    /**
     * @return Explains the reason for the release. Specify a value for this field only when creating a `SITE_DISABLE` type release.
     * 
     */
    private final String type;
    /**
     * @return The configuration and content that was released.
     * 
     */
    private final VersionResponse version;

    @CustomType.Constructor
    private ReleaseResponse(
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("releaseTime") String releaseTime,
        @CustomType.Parameter("releaseUser") ActingUserResponse releaseUser,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") VersionResponse version) {
        this.message = message;
        this.name = name;
        this.releaseTime = releaseTime;
        this.releaseUser = releaseUser;
        this.type = type;
        this.version = version;
    }

    /**
     * @return The deploy description when the release was created. The value can be up to 512 characters.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The unique identifier for the release, in either of the following formats: - sites/SITE_ID/releases/RELEASE_ID - sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID This name is provided in the response body when you call [`releases.create`](sites.releases/create) or [`channels.releases.create`](sites.channels.releases/create).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The time at which the version is set to be public.
     * 
     */
    public String releaseTime() {
        return this.releaseTime;
    }
    /**
     * @return Identifies the user who created the release.
     * 
     */
    public ActingUserResponse releaseUser() {
        return this.releaseUser;
    }
    /**
     * @return Explains the reason for the release. Specify a value for this field only when creating a `SITE_DISABLE` type release.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The configuration and content that was released.
     * 
     */
    public VersionResponse version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private String name;
        private String releaseTime;
        private ActingUserResponse releaseUser;
        private String type;
        private VersionResponse version;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.releaseTime = defaults.releaseTime;
    	      this.releaseUser = defaults.releaseUser;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder releaseTime(String releaseTime) {
            this.releaseTime = Objects.requireNonNull(releaseTime);
            return this;
        }
        public Builder releaseUser(ActingUserResponse releaseUser) {
            this.releaseUser = Objects.requireNonNull(releaseUser);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(VersionResponse version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ReleaseResponse build() {
            return new ReleaseResponse(message, name, releaseTime, releaseUser, type, version);
        }
    }
}
