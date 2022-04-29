// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetFhirServiceArgs extends InvokeArgs {

    public static final GetFhirServiceArgs Empty = new GetFhirServiceArgs();

    /**
     * The name of FHIR Service resource.
     * 
     */
    @Import(name="fhirServiceName", required=true)
    private String fhirServiceName;

    /**
     * @return The name of FHIR Service resource.
     * 
     */
    public String fhirServiceName() {
        return this.fhirServiceName;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the service instance.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of workspace resource.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetFhirServiceArgs() {}

    private GetFhirServiceArgs(GetFhirServiceArgs $) {
        this.fhirServiceName = $.fhirServiceName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFhirServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFhirServiceArgs $;

        public Builder() {
            $ = new GetFhirServiceArgs();
        }

        public Builder(GetFhirServiceArgs defaults) {
            $ = new GetFhirServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fhirServiceName The name of FHIR Service resource.
         * 
         * @return builder
         * 
         */
        public Builder fhirServiceName(String fhirServiceName) {
            $.fhirServiceName = fhirServiceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of workspace resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetFhirServiceArgs build() {
            $.fhirServiceName = Objects.requireNonNull($.fhirServiceName, "expected parameter 'fhirServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
