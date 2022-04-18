// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionFixedResponseGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionFixedResponseGetArgs Empty = new ListenerDefaultActionFixedResponseGetArgs();

    /**
     * Content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    @Import(name="contentType", required=true)
      private final Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * Message body.
     * 
     */
    @Import(name="messageBody")
      private final @Nullable Output<String> messageBody;

    public Output<String> messageBody() {
        return this.messageBody == null ? Codegen.empty() : this.messageBody;
    }

    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    @Import(name="statusCode")
      private final @Nullable Output<String> statusCode;

    public Output<String> statusCode() {
        return this.statusCode == null ? Codegen.empty() : this.statusCode;
    }

    public ListenerDefaultActionFixedResponseGetArgs(
        Output<String> contentType,
        @Nullable Output<String> messageBody,
        @Nullable Output<String> statusCode) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.messageBody = messageBody;
        this.statusCode = statusCode;
    }

    private ListenerDefaultActionFixedResponseGetArgs() {
        this.contentType = Codegen.empty();
        this.messageBody = Codegen.empty();
        this.statusCode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionFixedResponseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contentType;
        private @Nullable Output<String> messageBody;
        private @Nullable Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionFixedResponseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentType(Output<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Output.of(Objects.requireNonNull(contentType));
            return this;
        }
        public Builder messageBody(@Nullable Output<String> messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public Builder messageBody(@Nullable String messageBody) {
            this.messageBody = Codegen.ofNullable(messageBody);
            return this;
        }
        public Builder statusCode(@Nullable Output<String> statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Builder statusCode(@Nullable String statusCode) {
            this.statusCode = Codegen.ofNullable(statusCode);
            return this;
        }        public ListenerDefaultActionFixedResponseGetArgs build() {
            return new ListenerDefaultActionFixedResponseGetArgs(contentType, messageBody, statusCode);
        }
    }
}
