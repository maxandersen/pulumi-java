// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.stepfunctions;

import com.pulumi.awsnative.stepfunctions.inputs.ActivityTagsEntryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActivityArgs Empty = new ActivityArgs();

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="tags")
      private final @Nullable Output<List<ActivityTagsEntryArgs>> tags;

    public Output<List<ActivityTagsEntryArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ActivityArgs(
        @Nullable Output<String> name,
        @Nullable Output<List<ActivityTagsEntryArgs>> tags) {
        this.name = name;
        this.tags = tags;
    }

    private ActivityArgs() {
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<ActivityTagsEntryArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<ActivityTagsEntryArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ActivityTagsEntryArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ActivityTagsEntryArgs... tags) {
            return tags(List.of(tags));
        }        public ActivityArgs build() {
            return new ActivityArgs(name, tags);
        }
    }
}
