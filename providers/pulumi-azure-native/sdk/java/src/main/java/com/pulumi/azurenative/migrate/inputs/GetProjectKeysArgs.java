// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetProjectKeysArgs extends InvokeArgs {

    public static final GetProjectKeysArgs Empty = new GetProjectKeysArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName", required=true)
    private String projectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that project is part of.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetProjectKeysArgs() {}

    private GetProjectKeysArgs(GetProjectKeysArgs $) {
        this.projectName = $.projectName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectKeysArgs $;

        public Builder() {
            $ = new GetProjectKeysArgs();
        }

        public Builder(GetProjectKeysArgs defaults) {
            $ = new GetProjectKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetProjectKeysArgs build() {
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
