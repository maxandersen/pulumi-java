// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListJobCredentialsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListJobCredentialsArgs Empty = new ListJobCredentialsArgs();

    /**
     * The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @Import(name="jobName", required=true)
    private String jobName;

    public String jobName() {
        return this.jobName;
    }

    /**
     * The Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListJobCredentialsArgs() {}

    private ListJobCredentialsArgs(ListJobCredentialsArgs $) {
        this.jobName = $.jobName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListJobCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListJobCredentialsArgs $;

        public Builder() {
            $ = new ListJobCredentialsArgs();
        }

        public Builder(ListJobCredentialsArgs defaults) {
            $ = new ListJobCredentialsArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobName(String jobName) {
            $.jobName = jobName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListJobCredentialsArgs build() {
            $.jobName = Objects.requireNonNull($.jobName, "expected parameter 'jobName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
