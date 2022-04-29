// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * An access policy entry.
 * 
 */
public final class ServiceAccessPolicyEntryArgs extends ResourceArgs {

    public static final ServiceAccessPolicyEntryArgs Empty = new ServiceAccessPolicyEntryArgs();

    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    @Import(name="objectId", required=true)
    private Output<String> objectId;

    /**
     * @return An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }

    private ServiceAccessPolicyEntryArgs() {}

    private ServiceAccessPolicyEntryArgs(ServiceAccessPolicyEntryArgs $) {
        this.objectId = $.objectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccessPolicyEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccessPolicyEntryArgs $;

        public Builder() {
            $ = new ServiceAccessPolicyEntryArgs();
        }

        public Builder(ServiceAccessPolicyEntryArgs defaults) {
            $ = new ServiceAccessPolicyEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectId An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
         * 
         * @return builder
         * 
         */
        public Builder objectId(Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        public ServiceAccessPolicyEntryArgs build() {
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            return $;
        }
    }

}
