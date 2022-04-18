// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.awsnative.iotsitewise.outputs.AccessPolicyPortal;
import com.pulumi.awsnative.iotsitewise.outputs.AccessPolicyProject;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessPolicyResource {
    private final @Nullable AccessPolicyPortal portal;
    private final @Nullable AccessPolicyProject project;

    @CustomType.Constructor
    private AccessPolicyResource(
        @CustomType.Parameter("portal") @Nullable AccessPolicyPortal portal,
        @CustomType.Parameter("project") @Nullable AccessPolicyProject project) {
        this.portal = portal;
        this.project = project;
    }

    public Optional<AccessPolicyPortal> portal() {
        return Optional.ofNullable(this.portal);
    }
    public Optional<AccessPolicyProject> project() {
        return Optional.ofNullable(this.project);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccessPolicyPortal portal;
        private @Nullable AccessPolicyProject project;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portal = defaults.portal;
    	      this.project = defaults.project;
        }

        public Builder portal(@Nullable AccessPolicyPortal portal) {
            this.portal = portal;
            return this;
        }
        public Builder project(@Nullable AccessPolicyProject project) {
            this.project = project;
            return this;
        }        public AccessPolicyResource build() {
            return new AccessPolicyResource(portal, project);
        }
    }
}
