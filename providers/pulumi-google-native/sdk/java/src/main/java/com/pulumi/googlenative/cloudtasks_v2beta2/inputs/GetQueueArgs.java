// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueueArgs Empty = new GetQueueArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="queueId", required=true)
      private final String queueId;

    public String queueId() {
        return this.queueId;
    }

    @Import(name="readMask")
      private final @Nullable String readMask;

    public Optional<String> readMask() {
        return this.readMask == null ? Optional.empty() : Optional.ofNullable(this.readMask);
    }

    public GetQueueArgs(
        String location,
        @Nullable String project,
        String queueId,
        @Nullable String readMask) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.queueId = Objects.requireNonNull(queueId, "expected parameter 'queueId' to be non-null");
        this.readMask = readMask;
    }

    private GetQueueArgs() {
        this.location = null;
        this.project = null;
        this.queueId = null;
        this.readMask = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String queueId;
        private @Nullable String readMask;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.queueId = defaults.queueId;
    	      this.readMask = defaults.readMask;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder queueId(String queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }
        public Builder readMask(@Nullable String readMask) {
            this.readMask = readMask;
            return this;
        }        public GetQueueArgs build() {
            return new GetQueueArgs(location, project, queueId, readMask);
        }
    }
}
