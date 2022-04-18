// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAttachmentConsumerProjectLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentConsumerProjectLimitArgs Empty = new ServiceAttachmentConsumerProjectLimitArgs();

    /**
     * The value of the limit to set.
     * 
     */
    @Import(name="connectionLimit")
      private final @Nullable Output<Integer> connectionLimit;

    public Output<Integer> connectionLimit() {
        return this.connectionLimit == null ? Codegen.empty() : this.connectionLimit;
    }

    /**
     * The project id or number for the project to set the limit for.
     * 
     */
    @Import(name="projectIdOrNum")
      private final @Nullable Output<String> projectIdOrNum;

    public Output<String> projectIdOrNum() {
        return this.projectIdOrNum == null ? Codegen.empty() : this.projectIdOrNum;
    }

    public ServiceAttachmentConsumerProjectLimitArgs(
        @Nullable Output<Integer> connectionLimit,
        @Nullable Output<String> projectIdOrNum) {
        this.connectionLimit = connectionLimit;
        this.projectIdOrNum = projectIdOrNum;
    }

    private ServiceAttachmentConsumerProjectLimitArgs() {
        this.connectionLimit = Codegen.empty();
        this.projectIdOrNum = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConsumerProjectLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> connectionLimit;
        private @Nullable Output<String> projectIdOrNum;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConsumerProjectLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionLimit = defaults.connectionLimit;
    	      this.projectIdOrNum = defaults.projectIdOrNum;
        }

        public Builder connectionLimit(@Nullable Output<Integer> connectionLimit) {
            this.connectionLimit = connectionLimit;
            return this;
        }
        public Builder connectionLimit(@Nullable Integer connectionLimit) {
            this.connectionLimit = Codegen.ofNullable(connectionLimit);
            return this;
        }
        public Builder projectIdOrNum(@Nullable Output<String> projectIdOrNum) {
            this.projectIdOrNum = projectIdOrNum;
            return this;
        }
        public Builder projectIdOrNum(@Nullable String projectIdOrNum) {
            this.projectIdOrNum = Codegen.ofNullable(projectIdOrNum);
            return this;
        }        public ServiceAttachmentConsumerProjectLimitArgs build() {
            return new ServiceAttachmentConsumerProjectLimitArgs(connectionLimit, projectIdOrNum);
        }
    }
}
