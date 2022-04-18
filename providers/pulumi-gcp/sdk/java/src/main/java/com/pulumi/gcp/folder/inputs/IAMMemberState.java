// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.folder.inputs.IAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMMemberState extends com.pulumi.resources.ResourceArgs {

    public static final IAMMemberState Empty = new IAMMemberState();

    @Import(name="condition")
      private final @Nullable Output<IAMMemberConditionGetArgs> condition;

    public Output<IAMMemberConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="folder")
      private final @Nullable Output<String> folder;

    public Output<String> folder() {
        return this.folder == null ? Codegen.empty() : this.folder;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> member() {
        return this.member == null ? Codegen.empty() : this.member;
    }

    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public IAMMemberState(
        @Nullable Output<IAMMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> folder,
        @Nullable Output<String> member,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.folder = folder;
        this.member = member;
        this.role = role;
    }

    private IAMMemberState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.folder = Codegen.empty();
        this.member = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IAMMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> folder;
        private @Nullable Output<String> member;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<IAMMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable IAMMemberConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder folder(@Nullable Output<String> folder) {
            this.folder = folder;
            return this;
        }
        public Builder folder(@Nullable String folder) {
            this.folder = Codegen.ofNullable(folder);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public IAMMemberState build() {
            return new IAMMemberState(condition, etag, folder, member, role);
        }
    }
}
