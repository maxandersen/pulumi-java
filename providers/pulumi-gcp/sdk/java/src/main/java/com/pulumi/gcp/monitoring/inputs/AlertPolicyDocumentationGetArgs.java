// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyDocumentationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyDocumentationGetArgs Empty = new AlertPolicyDocumentationGetArgs();

    /**
     * The text of the documentation, interpreted according to mimeType.
     * The content may not exceed 8,192 Unicode characters and may not
     * exceed more than 10,240 bytes when encoded in UTF-8 format,
     * whichever is smaller.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> content() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * The format of the content field. Presently, only the value
     * &#34;text/markdown&#34; is supported.
     * 
     */
    @Import(name="mimeType")
      private final @Nullable Output<String> mimeType;

    public Output<String> mimeType() {
        return this.mimeType == null ? Codegen.empty() : this.mimeType;
    }

    public AlertPolicyDocumentationGetArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> mimeType) {
        this.content = content;
        this.mimeType = mimeType;
    }

    private AlertPolicyDocumentationGetArgs() {
        this.content = Codegen.empty();
        this.mimeType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyDocumentationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> mimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyDocumentationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.mimeType = defaults.mimeType;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder mimeType(@Nullable Output<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = Codegen.ofNullable(mimeType);
            return this;
        }        public AlertPolicyDocumentationGetArgs build() {
            return new AlertPolicyDocumentationGetArgs(content, mimeType);
        }
    }
}
