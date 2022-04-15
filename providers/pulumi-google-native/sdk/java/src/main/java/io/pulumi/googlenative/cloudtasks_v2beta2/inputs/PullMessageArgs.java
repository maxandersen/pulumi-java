// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The pull message contains data that can be used by the caller of LeaseTasks to process the task. This proto can only be used for tasks in a queue which has pull_target set.
 * 
 */
public final class PullMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PullMessageArgs Empty = new PullMessageArgs();

    /**
     * A data payload consumed by the worker to execute the task.
     * 
     */
    @Import(name="payload")
      private final @Nullable Output<String> payload;

    public Output<String> payload() {
        return this.payload == null ? Codegen.empty() : this.payload;
    }

    /**
     * The task's tag. Tags allow similar tasks to be processed in a batch. If you label tasks with a tag, your worker can lease tasks with the same tag using filter. For example, if you want to aggregate the events associated with a specific user once a day, you could tag tasks with the user ID. The task's tag can only be set when the task is created. The tag must be less than 500 characters. SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8 encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> tag() {
        return this.tag == null ? Codegen.empty() : this.tag;
    }

    public PullMessageArgs(
        @Nullable Output<String> payload,
        @Nullable Output<String> tag) {
        this.payload = payload;
        this.tag = tag;
    }

    private PullMessageArgs() {
        this.payload = Codegen.empty();
        this.tag = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> payload;
        private @Nullable Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(PullMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.tag = defaults.tag;
        }

        public Builder payload(@Nullable Output<String> payload) {
            this.payload = payload;
            return this;
        }
        public Builder payload(@Nullable String payload) {
            this.payload = Codegen.ofNullable(payload);
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Codegen.ofNullable(tag);
            return this;
        }        public PullMessageArgs build() {
            return new PullMessageArgs(payload, tag);
        }
    }
}
