// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SeccompProfile {
    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet&#39;s configured seccomp profile location. Must only be set if type is &#34;Localhost&#34;.
     * 
     */
    private final @Nullable String localhostProfile;
    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * Possible enum values:
     *  - `&#34;Localhost&#34;` indicates a profile defined in a file on the node should be used. The file&#39;s location relative to &lt;kubelet-root-dir&gt;/seccomp.
     *  - `&#34;RuntimeDefault&#34;` represents the default container runtime seccomp profile.
     *  - `&#34;Unconfined&#34;` indicates no seccomp profile is applied (A.K.A. unconfined).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SeccompProfile(
        @CustomType.Parameter("localhostProfile") @Nullable String localhostProfile,
        @CustomType.Parameter("type") String type) {
        this.localhostProfile = localhostProfile;
        this.type = type;
    }

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet&#39;s configured seccomp profile location. Must only be set if type is &#34;Localhost&#34;.
     * 
    */
    public Optional<String> localhostProfile() {
        return Optional.ofNullable(this.localhostProfile);
    }
    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * Possible enum values:
     *  - `&#34;Localhost&#34;` indicates a profile defined in a file on the node should be used. The file&#39;s location relative to &lt;kubelet-root-dir&gt;/seccomp.
     *  - `&#34;RuntimeDefault&#34;` represents the default container runtime seccomp profile.
     *  - `&#34;Unconfined&#34;` indicates no seccomp profile is applied (A.K.A. unconfined).
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SeccompProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String localhostProfile;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SeccompProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localhostProfile = defaults.localhostProfile;
    	      this.type = defaults.type;
        }

        public Builder localhostProfile(@Nullable String localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SeccompProfile build() {
            return new SeccompProfile(localhostProfile, type);
        }
    }
}
