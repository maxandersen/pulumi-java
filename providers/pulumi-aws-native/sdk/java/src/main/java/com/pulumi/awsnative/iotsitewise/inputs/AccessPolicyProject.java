// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A project resource.
 * 
 */
public final class AccessPolicyProject extends com.pulumi.resources.InvokeArgs {

    public static final AccessPolicyProject Empty = new AccessPolicyProject();

    /**
     * The ID of the project.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public AccessPolicyProject(@Nullable String id) {
        this.id = id;
    }

    private AccessPolicyProject() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyProject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public AccessPolicyProject build() {
            return new AccessPolicyProject(id);
        }
    }
}
