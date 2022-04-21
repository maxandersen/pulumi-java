// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiPortalArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiPortalArgs Empty = new GetApiPortalArgs();

    /**
     * The name of API portal.
     * 
     */
    @Import(name="apiPortalName", required=true)
    private String apiPortalName;

    public String apiPortalName() {
        return this.apiPortalName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    private GetApiPortalArgs() {}

    private GetApiPortalArgs(GetApiPortalArgs $) {
        this.apiPortalName = $.apiPortalName;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiPortalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiPortalArgs $;

        public Builder() {
            $ = new GetApiPortalArgs();
        }

        public Builder(GetApiPortalArgs defaults) {
            $ = new GetApiPortalArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiPortalName(String apiPortalName) {
            $.apiPortalName = apiPortalName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetApiPortalArgs build() {
            $.apiPortalName = Objects.requireNonNull($.apiPortalName, "expected parameter 'apiPortalName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
