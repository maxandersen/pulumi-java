// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.enums.ServicePlacementPolicyType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the policy to be used for placement of a Service Fabric service.
 * 
 */
public final class ServicePlacementPolicyDescriptionArgs extends ResourceArgs {

    public static final ServicePlacementPolicyDescriptionArgs Empty = new ServicePlacementPolicyDescriptionArgs();

    /**
     * The type of placement policy for a service fabric service. Following are the possible values.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ServicePlacementPolicyType>> type;

    /**
     * @return The type of placement policy for a service fabric service. Following are the possible values.
     * 
     */
    public Output<Either<String,ServicePlacementPolicyType>> type() {
        return this.type;
    }

    private ServicePlacementPolicyDescriptionArgs() {}

    private ServicePlacementPolicyDescriptionArgs(ServicePlacementPolicyDescriptionArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePlacementPolicyDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePlacementPolicyDescriptionArgs $;

        public Builder() {
            $ = new ServicePlacementPolicyDescriptionArgs();
        }

        public Builder(ServicePlacementPolicyDescriptionArgs defaults) {
            $ = new ServicePlacementPolicyDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of placement policy for a service fabric service. Following are the possible values.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ServicePlacementPolicyType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of placement policy for a service fabric service. Following are the possible values.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ServicePlacementPolicyType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of placement policy for a service fabric service. Following are the possible values.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of placement policy for a service fabric service. Following are the possible values.
         * 
         * @return builder
         * 
         */
        public Builder type(ServicePlacementPolicyType type) {
            return type(Either.ofRight(type));
        }

        public ServicePlacementPolicyDescriptionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
