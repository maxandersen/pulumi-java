// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetJobArgs Empty = new GetJobArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The Job name.
     * 
     */
    @Import(name="jobName", required=true)
      private final String jobName;

    public String jobName() {
        return this.jobName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Transform name.
     * 
     */
    @Import(name="transformName", required=true)
      private final String transformName;

    public String transformName() {
        return this.transformName;
    }

    public GetJobArgs(
        String accountName,
        String jobName,
        String resourceGroupName,
        String transformName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.transformName = Objects.requireNonNull(transformName, "expected parameter 'transformName' to be non-null");
    }

    private GetJobArgs() {
        this.accountName = null;
        this.jobName = null;
        this.resourceGroupName = null;
        this.transformName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String jobName;
        private String resourceGroupName;
        private String transformName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.transformName = defaults.transformName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder jobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder transformName(String transformName) {
            this.transformName = Objects.requireNonNull(transformName);
            return this;
        }        public GetJobArgs build() {
            return new GetJobArgs(accountName, jobName, resourceGroupName, transformName);
        }
    }
}
