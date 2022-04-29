// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListIntegrationAccountAssemblyContentCallbackUrlArgs extends InvokeArgs {

    public static final ListIntegrationAccountAssemblyContentCallbackUrlArgs Empty = new ListIntegrationAccountAssemblyContentCallbackUrlArgs();

    /**
     * The assembly artifact name.
     * 
     */
    @Import(name="assemblyArtifactName", required=true)
    private String assemblyArtifactName;

    /**
     * @return The assembly artifact name.
     * 
     */
    public String assemblyArtifactName() {
        return this.assemblyArtifactName;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private String integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public String integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListIntegrationAccountAssemblyContentCallbackUrlArgs() {}

    private ListIntegrationAccountAssemblyContentCallbackUrlArgs(ListIntegrationAccountAssemblyContentCallbackUrlArgs $) {
        this.assemblyArtifactName = $.assemblyArtifactName;
        this.integrationAccountName = $.integrationAccountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListIntegrationAccountAssemblyContentCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListIntegrationAccountAssemblyContentCallbackUrlArgs $;

        public Builder() {
            $ = new ListIntegrationAccountAssemblyContentCallbackUrlArgs();
        }

        public Builder(ListIntegrationAccountAssemblyContentCallbackUrlArgs defaults) {
            $ = new ListIntegrationAccountAssemblyContentCallbackUrlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assemblyArtifactName The assembly artifact name.
         * 
         * @return builder
         * 
         */
        public Builder assemblyArtifactName(String assemblyArtifactName) {
            $.assemblyArtifactName = assemblyArtifactName;
            return this;
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListIntegrationAccountAssemblyContentCallbackUrlArgs build() {
            $.assemblyArtifactName = Objects.requireNonNull($.assemblyArtifactName, "expected parameter 'assemblyArtifactName' to be non-null");
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
