// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryEventNotificationConfigItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryEventNotificationConfigItemArgs Empty = new RegistryEventNotificationConfigItemArgs();

    @Import(name="pubsubTopicName", required=true)
      private final Output<String> pubsubTopicName;

    public Output<String> pubsubTopicName() {
        return this.pubsubTopicName;
    }

    @Import(name="subfolderMatches")
      private final @Nullable Output<String> subfolderMatches;

    public Output<String> subfolderMatches() {
        return this.subfolderMatches == null ? Codegen.empty() : this.subfolderMatches;
    }

    public RegistryEventNotificationConfigItemArgs(
        Output<String> pubsubTopicName,
        @Nullable Output<String> subfolderMatches) {
        this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName, "expected parameter 'pubsubTopicName' to be non-null");
        this.subfolderMatches = subfolderMatches;
    }

    private RegistryEventNotificationConfigItemArgs() {
        this.pubsubTopicName = Codegen.empty();
        this.subfolderMatches = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryEventNotificationConfigItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> pubsubTopicName;
        private @Nullable Output<String> subfolderMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryEventNotificationConfigItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopicName = defaults.pubsubTopicName;
    	      this.subfolderMatches = defaults.subfolderMatches;
        }

        public Builder pubsubTopicName(Output<String> pubsubTopicName) {
            this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName);
            return this;
        }
        public Builder pubsubTopicName(String pubsubTopicName) {
            this.pubsubTopicName = Output.of(Objects.requireNonNull(pubsubTopicName));
            return this;
        }
        public Builder subfolderMatches(@Nullable Output<String> subfolderMatches) {
            this.subfolderMatches = subfolderMatches;
            return this;
        }
        public Builder subfolderMatches(@Nullable String subfolderMatches) {
            this.subfolderMatches = Codegen.ofNullable(subfolderMatches);
            return this;
        }        public RegistryEventNotificationConfigItemArgs build() {
            return new RegistryEventNotificationConfigItemArgs(pubsubTopicName, subfolderMatches);
        }
    }
}
