// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the parameters for the origin group override action.
 * 
 */
public final class OriginGroupOverrideActionParametersArgs extends ResourceArgs {

    public static final OriginGroupOverrideActionParametersArgs Empty = new OriginGroupOverrideActionParametersArgs();

    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * defines the OriginGroup that would override the DefaultOriginGroup.
     * 
     */
    @Import(name="originGroup", required=true)
    private Output<ResourceReferenceArgs> originGroup;

    /**
     * @return defines the OriginGroup that would override the DefaultOriginGroup.
     * 
     */
    public Output<ResourceReferenceArgs> originGroup() {
        return this.originGroup;
    }

    private OriginGroupOverrideActionParametersArgs() {}

    private OriginGroupOverrideActionParametersArgs(OriginGroupOverrideActionParametersArgs $) {
        this.odataType = $.odataType;
        this.originGroup = $.originGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginGroupOverrideActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginGroupOverrideActionParametersArgs $;

        public Builder() {
            $ = new OriginGroupOverrideActionParametersArgs();
        }

        public Builder(OriginGroupOverrideActionParametersArgs defaults) {
            $ = new OriginGroupOverrideActionParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param originGroup defines the OriginGroup that would override the DefaultOriginGroup.
         * 
         * @return builder
         * 
         */
        public Builder originGroup(Output<ResourceReferenceArgs> originGroup) {
            $.originGroup = originGroup;
            return this;
        }

        /**
         * @param originGroup defines the OriginGroup that would override the DefaultOriginGroup.
         * 
         * @return builder
         * 
         */
        public Builder originGroup(ResourceReferenceArgs originGroup) {
            return originGroup(Output.of(originGroup));
        }

        public OriginGroupOverrideActionParametersArgs build() {
            $.odataType = Objects.requireNonNull($.odataType, "expected parameter 'odataType' to be non-null");
            $.originGroup = Objects.requireNonNull($.originGroup, "expected parameter 'originGroup' to be non-null");
            return $;
        }
    }

}
