// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentFollowupIntentInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentFollowupIntentInfoArgs Empty = new IntentFollowupIntentInfoArgs();

    @Import(name="followupIntentName")
      private final @Nullable Output<String> followupIntentName;

    public Output<String> followupIntentName() {
        return this.followupIntentName == null ? Codegen.empty() : this.followupIntentName;
    }

    /**
     * The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;.
     * 
     */
    @Import(name="parentFollowupIntentName")
      private final @Nullable Output<String> parentFollowupIntentName;

    public Output<String> parentFollowupIntentName() {
        return this.parentFollowupIntentName == null ? Codegen.empty() : this.parentFollowupIntentName;
    }

    public IntentFollowupIntentInfoArgs(
        @Nullable Output<String> followupIntentName,
        @Nullable Output<String> parentFollowupIntentName) {
        this.followupIntentName = followupIntentName;
        this.parentFollowupIntentName = parentFollowupIntentName;
    }

    private IntentFollowupIntentInfoArgs() {
        this.followupIntentName = Codegen.empty();
        this.parentFollowupIntentName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFollowupIntentInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> followupIntentName;
        private @Nullable Output<String> parentFollowupIntentName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFollowupIntentInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followupIntentName = defaults.followupIntentName;
    	      this.parentFollowupIntentName = defaults.parentFollowupIntentName;
        }

        public Builder followupIntentName(@Nullable Output<String> followupIntentName) {
            this.followupIntentName = followupIntentName;
            return this;
        }
        public Builder followupIntentName(@Nullable String followupIntentName) {
            this.followupIntentName = Codegen.ofNullable(followupIntentName);
            return this;
        }
        public Builder parentFollowupIntentName(@Nullable Output<String> parentFollowupIntentName) {
            this.parentFollowupIntentName = parentFollowupIntentName;
            return this;
        }
        public Builder parentFollowupIntentName(@Nullable String parentFollowupIntentName) {
            this.parentFollowupIntentName = Codegen.ofNullable(parentFollowupIntentName);
            return this;
        }        public IntentFollowupIntentInfoArgs build() {
            return new IntentFollowupIntentInfoArgs(followupIntentName, parentFollowupIntentName);
        }
    }
}
