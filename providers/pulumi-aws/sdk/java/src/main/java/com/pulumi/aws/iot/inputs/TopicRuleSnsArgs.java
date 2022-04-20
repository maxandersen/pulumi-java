// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleSnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleSnsArgs Empty = new TopicRuleSnsArgs();

    /**
     * The message format of the message to publish. Accepted values are &#34;JSON&#34; and &#34;RAW&#34;.
     * 
     */
    @Import(name="messageFormat")
      private final @Nullable Output<String> messageFormat;

    public Output<String> messageFormat() {
        return this.messageFormat == null ? Codegen.empty() : this.messageFormat;
    }

    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the SNS topic.
     * 
     */
    @Import(name="targetArn", required=true)
      private final Output<String> targetArn;

    public Output<String> targetArn() {
        return this.targetArn;
    }

    public TopicRuleSnsArgs(
        @Nullable Output<String> messageFormat,
        Output<String> roleArn,
        Output<String> targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private TopicRuleSnsArgs() {
        this.messageFormat = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.targetArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> messageFormat;
        private Output<String> roleArn;
        private Output<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSnsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder messageFormat(@Nullable Output<String> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }
        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = Codegen.ofNullable(messageFormat);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder targetArn(Output<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public Builder targetArn(String targetArn) {
            this.targetArn = Output.of(Objects.requireNonNull(targetArn));
            return this;
        }        public TopicRuleSnsArgs build() {
            return new TopicRuleSnsArgs(messageFormat, roleArn, targetArn);
        }
    }
}
