// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceAttachmentConsumerProjectLimitResponse {
    /**
     * The value of the limit to set.
     * 
     */
    private final Integer connectionLimit;
    /**
     * The project id or number for the project to set the limit for.
     * 
     */
    private final String projectIdOrNum;

    @OutputCustomType.Constructor
    private ServiceAttachmentConsumerProjectLimitResponse(
        @OutputCustomType.Parameter("connectionLimit") Integer connectionLimit,
        @OutputCustomType.Parameter("projectIdOrNum") String projectIdOrNum) {
        this.connectionLimit = connectionLimit;
        this.projectIdOrNum = projectIdOrNum;
    }

    /**
     * The value of the limit to set.
     * 
    */
    public Integer getConnectionLimit() {
        return this.connectionLimit;
    }
    /**
     * The project id or number for the project to set the limit for.
     * 
    */
    public String getProjectIdOrNum() {
        return this.projectIdOrNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConsumerProjectLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer connectionLimit;
        private String projectIdOrNum;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConsumerProjectLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionLimit = defaults.connectionLimit;
    	      this.projectIdOrNum = defaults.projectIdOrNum;
        }

        public Builder setConnectionLimit(Integer connectionLimit) {
            this.connectionLimit = Objects.requireNonNull(connectionLimit);
            return this;
        }

        public Builder setProjectIdOrNum(String projectIdOrNum) {
            this.projectIdOrNum = Objects.requireNonNull(projectIdOrNum);
            return this;
        }
        public ServiceAttachmentConsumerProjectLimitResponse build() {
            return new ServiceAttachmentConsumerProjectLimitResponse(connectionLimit, projectIdOrNum);
        }
    }
}
