// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.apikeys_v2.inputs.V2RestrictionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId == null ? Codegen.empty() : this.keyId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Key restrictions.
     * 
     */
    @Import(name="restrictions")
      private final @Nullable Output<V2RestrictionsArgs> restrictions;

    public Output<V2RestrictionsArgs> restrictions() {
        return this.restrictions == null ? Codegen.empty() : this.restrictions;
    }

    public KeyArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> keyId,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<V2RestrictionsArgs> restrictions) {
        this.displayName = displayName;
        this.keyId = keyId;
        this.location = location;
        this.project = project;
        this.restrictions = restrictions;
    }

    private KeyArgs() {
        this.displayName = Codegen.empty();
        this.keyId = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.restrictions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<V2RestrictionsArgs> restrictions;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.keyId = defaults.keyId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.restrictions = defaults.restrictions;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Codegen.ofNullable(keyId);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder restrictions(@Nullable Output<V2RestrictionsArgs> restrictions) {
            this.restrictions = restrictions;
            return this;
        }
        public Builder restrictions(@Nullable V2RestrictionsArgs restrictions) {
            this.restrictions = Codegen.ofNullable(restrictions);
            return this;
        }        public KeyArgs build() {
            return new KeyArgs(displayName, keyId, location, project, restrictions);
        }
    }
}
