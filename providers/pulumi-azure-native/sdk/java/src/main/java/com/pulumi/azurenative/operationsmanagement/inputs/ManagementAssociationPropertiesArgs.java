// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * ManagementAssociation properties supported by the OperationsManagement resource provider.
 * 
 */
public final class ManagementAssociationPropertiesArgs extends ResourceArgs {

    public static final ManagementAssociationPropertiesArgs Empty = new ManagementAssociationPropertiesArgs();

    /**
     * The applicationId of the appliance for this association.
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return The applicationId of the appliance for this association.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    private ManagementAssociationPropertiesArgs() {}

    private ManagementAssociationPropertiesArgs(ManagementAssociationPropertiesArgs $) {
        this.applicationId = $.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementAssociationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementAssociationPropertiesArgs $;

        public Builder() {
            $ = new ManagementAssociationPropertiesArgs();
        }

        public Builder(ManagementAssociationPropertiesArgs defaults) {
            $ = new ManagementAssociationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The applicationId of the appliance for this association.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The applicationId of the appliance for this association.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public ManagementAssociationPropertiesArgs build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            return $;
        }
    }

}
