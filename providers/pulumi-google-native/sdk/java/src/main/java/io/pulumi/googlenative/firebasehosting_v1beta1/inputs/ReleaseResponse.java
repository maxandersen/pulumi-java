// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.firebasehosting_v1beta1.inputs.ActingUserResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.inputs.VersionResponse;
import java.lang.String;
import java.util.Objects;


/**
 *  A `Release` is a particular [collection of configurations and files](sites.versions) that is set to be public at a particular time.
 * 
 */
public final class ReleaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReleaseResponse Empty = new ReleaseResponse();

    /**
     * The deploy description when the release was created. The value can be up to 512 characters.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    /**
     * The unique identifier for the release, in either of the following formats: - sites/SITE_ID/releases/RELEASE_ID - sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID This name is provided in the response body when you call [`releases.create`](sites.releases/create) or [`channels.releases.create`](sites.channels.releases/create).
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The time at which the version is set to be public.
     * 
     */
    @Import(name="releaseTime", required=true)
      private final String releaseTime;

    public String releaseTime() {
        return this.releaseTime;
    }

    /**
     * Identifies the user who created the release.
     * 
     */
    @Import(name="releaseUser", required=true)
      private final ActingUserResponse releaseUser;

    public ActingUserResponse releaseUser() {
        return this.releaseUser;
    }

    /**
     * Explains the reason for the release. Specify a value for this field only when creating a `SITE_DISABLE` type release.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The configuration and content that was released.
     * 
     */
    @Import(name="version", required=true)
      private final VersionResponse version;

    public VersionResponse version() {
        return this.version;
    }

    public ReleaseResponse(
        String message,
        String name,
        String releaseTime,
        ActingUserResponse releaseUser,
        String type,
        VersionResponse version) {
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.releaseTime = Objects.requireNonNull(releaseTime, "expected parameter 'releaseTime' to be non-null");
        this.releaseUser = Objects.requireNonNull(releaseUser, "expected parameter 'releaseUser' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private ReleaseResponse() {
        this.message = null;
        this.name = null;
        this.releaseTime = null;
        this.releaseUser = null;
        this.type = null;
        this.version = null;
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
