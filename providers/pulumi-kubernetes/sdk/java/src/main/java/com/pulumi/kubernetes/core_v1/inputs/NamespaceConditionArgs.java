// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NamespaceCondition contains details about state of namespace.
 * 
 */
public final class NamespaceConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceConditionArgs Empty = new NamespaceConditionArgs();

    @Import(name="lastTransitionTime")
      private final @Nullable Output<String> lastTransitionTime;

    public Output<String> lastTransitionTime() {
        return this.lastTransitionTime == null ? Codegen.empty() : this.lastTransitionTime;
    }

    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> message() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> reason() {
        return this.reason == null ? Codegen.empty() : this.reason;
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    /**
     * Type of namespace controller condition.
     * 
     * Possible enum values:
     *  - `&#34;NamespaceContentRemaining&#34;` contains information about resources remaining in a namespace.
     *  - `&#34;NamespaceDeletionContentFailure&#34;` contains information about namespace deleter errors during deletion of resources.
     *  - `&#34;NamespaceDeletionDiscoveryFailure&#34;` contains information about namespace deleter errors during resource discovery.
     *  - `&#34;NamespaceDeletionGroupVersionParsingFailure&#34;` contains information about namespace deleter errors parsing GV for legacy types.
     *  - `&#34;NamespaceFinalizersRemaining&#34;` contains information about which finalizers are on resources remaining in a namespace.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public NamespaceConditionArgs(
        @Nullable Output<String> lastTransitionTime,
        @Nullable Output<String> message,
        @Nullable Output<String> reason,
        Output<String> status,
        Output<String> type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NamespaceConditionArgs() {
        this.lastTransitionTime = Codegen.empty();
        this.message = Codegen.empty();
        this.reason = Codegen.empty();
        this.status = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lastTransitionTime;
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;
        private Output<String> status;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = Codegen.ofNullable(lastTransitionTime);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }
        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = Codegen.ofNullable(reason);
            return this;
        }
        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public NamespaceConditionArgs build() {
            return new NamespaceConditionArgs(lastTransitionTime, message, reason, status, type);
        }
    }
}
