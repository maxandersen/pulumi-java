// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SeccompProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SeccompProfileArgs Empty = new SeccompProfileArgs();

    @InputImport(name="localhostProfile")
    private final @Nullable Input<String> localhostProfile;

    public Input<String> getLocalhostProfile() {
        return this.localhostProfile == null ? Input.empty() : this.localhostProfile;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public SeccompProfileArgs(
        @Nullable Input<String> localhostProfile,
        Input<String> type) {
        this.localhostProfile = localhostProfile;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SeccompProfileArgs() {
        this.localhostProfile = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SeccompProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> localhostProfile;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SeccompProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localhostProfile = defaults.localhostProfile;
    	      this.type = defaults.type;
        }

        public Builder setLocalhostProfile(@Nullable Input<String> localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }

        public Builder setLocalhostProfile(@Nullable String localhostProfile) {
            this.localhostProfile = Input.ofNullable(localhostProfile);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public SeccompProfileArgs build() {
            return new SeccompProfileArgs(localhostProfile, type);
        }
    }
}
