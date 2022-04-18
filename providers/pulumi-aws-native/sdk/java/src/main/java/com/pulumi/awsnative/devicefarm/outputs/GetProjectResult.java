// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm.outputs;

import com.pulumi.awsnative.devicefarm.outputs.ProjectTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectResult {
    private final @Nullable String arn;
    private final @Nullable Integer defaultJobTimeoutMinutes;
    private final @Nullable String name;
    private final @Nullable List<ProjectTag> tags;

    @CustomType.Constructor
    private GetProjectResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("defaultJobTimeoutMinutes") @Nullable Integer defaultJobTimeoutMinutes,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable List<ProjectTag> tags) {
        this.arn = arn;
        this.defaultJobTimeoutMinutes = defaultJobTimeoutMinutes;
        this.name = name;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Integer> defaultJobTimeoutMinutes() {
        return Optional.ofNullable(this.defaultJobTimeoutMinutes);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<ProjectTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Integer defaultJobTimeoutMinutes;
        private @Nullable String name;
        private @Nullable List<ProjectTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultJobTimeoutMinutes = defaults.defaultJobTimeoutMinutes;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder defaultJobTimeoutMinutes(@Nullable Integer defaultJobTimeoutMinutes) {
            this.defaultJobTimeoutMinutes = defaultJobTimeoutMinutes;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tags(@Nullable List<ProjectTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ProjectTag... tags) {
            return tags(List.of(tags));
        }        public GetProjectResult build() {
            return new GetProjectResult(arn, defaultJobTimeoutMinutes, name, tags);
        }
    }
}
