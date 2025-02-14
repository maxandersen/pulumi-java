// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobArgs Empty = new GetJobArgs();

    /**
     * $expand is supported on details parameter for job, which provides details on the job stages.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return $expand is supported on details parameter for job, which provides details on the job stages.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @Import(name="jobName", required=true)
    private String jobName;

    /**
     * @return The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * The Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Resource Group Name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetJobArgs() {}

    private GetJobArgs(GetJobArgs $) {
        this.expand = $.expand;
        this.jobName = $.jobName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobArgs $;

        public Builder() {
            $ = new GetJobArgs();
        }

        public Builder(GetJobArgs defaults) {
            $ = new GetJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand $expand is supported on details parameter for job, which provides details on the job stages.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
         * 
         * @return builder
         * 
         */
        public Builder jobName(String jobName) {
            $.jobName = jobName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group Name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetJobArgs build() {
            $.jobName = Objects.requireNonNull($.jobName, "expected parameter 'jobName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
