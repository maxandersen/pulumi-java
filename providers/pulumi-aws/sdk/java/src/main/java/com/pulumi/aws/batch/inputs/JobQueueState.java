// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueueState extends com.pulumi.resources.ResourceArgs {

    public static final JobQueueState Empty = new JobQueueState();

    /**
     * The Amazon Resource Name of the job queue.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     * 
     */
    @Import(name="computeEnvironments")
      private final @Nullable Output<List<String>> computeEnvironments;

    public Output<List<String>> computeEnvironments() {
        return this.computeEnvironments == null ? Codegen.empty() : this.computeEnvironments;
    }

    /**
     * Specifies the name of the job queue.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn&#39;t specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can&#39;t remove the fair share scheduling policy.
     * 
     */
    @Import(name="schedulingPolicyArn")
      private final @Nullable Output<String> schedulingPolicyArn;

    public Output<String> schedulingPolicyArn() {
        return this.schedulingPolicyArn == null ? Codegen.empty() : this.schedulingPolicyArn;
    }

    /**
     * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public JobQueueState(
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> computeEnvironments,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> schedulingPolicyArn,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.computeEnvironments = computeEnvironments;
        this.name = name;
        this.priority = priority;
        this.schedulingPolicyArn = schedulingPolicyArn;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private JobQueueState() {
        this.arn = Codegen.empty();
        this.computeEnvironments = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
        this.schedulingPolicyArn = Codegen.empty();
        this.state = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> computeEnvironments;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> schedulingPolicyArn;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueueState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.computeEnvironments = defaults.computeEnvironments;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.schedulingPolicyArn = defaults.schedulingPolicyArn;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder computeEnvironments(@Nullable Output<List<String>> computeEnvironments) {
            this.computeEnvironments = computeEnvironments;
            return this;
        }
        public Builder computeEnvironments(@Nullable List<String> computeEnvironments) {
            this.computeEnvironments = Codegen.ofNullable(computeEnvironments);
            return this;
        }
        public Builder computeEnvironments(String... computeEnvironments) {
            return computeEnvironments(List.of(computeEnvironments));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder schedulingPolicyArn(@Nullable Output<String> schedulingPolicyArn) {
            this.schedulingPolicyArn = schedulingPolicyArn;
            return this;
        }
        public Builder schedulingPolicyArn(@Nullable String schedulingPolicyArn) {
            this.schedulingPolicyArn = Codegen.ofNullable(schedulingPolicyArn);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public JobQueueState build() {
            return new JobQueueState(arn, computeEnvironments, name, priority, schedulingPolicyArn, state, tags, tagsAll);
        }
    }
}
