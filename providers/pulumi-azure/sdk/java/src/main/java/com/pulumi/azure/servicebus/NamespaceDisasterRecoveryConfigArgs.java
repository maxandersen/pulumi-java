// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceDisasterRecoveryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceDisasterRecoveryConfigArgs Empty = new NamespaceDisasterRecoveryConfigArgs();

    /**
     * Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Service Bus Namespace to replicate to.
     * 
     */
    @Import(name="partnerNamespaceId", required=true)
    private Output<String> partnerNamespaceId;

    /**
     * @return The ID of the Service Bus Namespace to replicate to.
     * 
     */
    public Output<String> partnerNamespaceId() {
        return this.partnerNamespaceId;
    }

    /**
     * The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="primaryNamespaceId", required=true)
    private Output<String> primaryNamespaceId;

    /**
     * @return The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> primaryNamespaceId() {
        return this.primaryNamespaceId;
    }

    private NamespaceDisasterRecoveryConfigArgs() {}

    private NamespaceDisasterRecoveryConfigArgs(NamespaceDisasterRecoveryConfigArgs $) {
        this.name = $.name;
        this.partnerNamespaceId = $.partnerNamespaceId;
        this.primaryNamespaceId = $.primaryNamespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceDisasterRecoveryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceDisasterRecoveryConfigArgs $;

        public Builder() {
            $ = new NamespaceDisasterRecoveryConfigArgs();
        }

        public Builder(NamespaceDisasterRecoveryConfigArgs defaults) {
            $ = new NamespaceDisasterRecoveryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partnerNamespaceId The ID of the Service Bus Namespace to replicate to.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceId(Output<String> partnerNamespaceId) {
            $.partnerNamespaceId = partnerNamespaceId;
            return this;
        }

        /**
         * @param partnerNamespaceId The ID of the Service Bus Namespace to replicate to.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceId(String partnerNamespaceId) {
            return partnerNamespaceId(Output.of(partnerNamespaceId));
        }

        /**
         * @param primaryNamespaceId The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder primaryNamespaceId(Output<String> primaryNamespaceId) {
            $.primaryNamespaceId = primaryNamespaceId;
            return this;
        }

        /**
         * @param primaryNamespaceId The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder primaryNamespaceId(String primaryNamespaceId) {
            return primaryNamespaceId(Output.of(primaryNamespaceId));
        }

        public NamespaceDisasterRecoveryConfigArgs build() {
            $.partnerNamespaceId = Objects.requireNonNull($.partnerNamespaceId, "expected parameter 'partnerNamespaceId' to be non-null");
            $.primaryNamespaceId = Objects.requireNonNull($.primaryNamespaceId, "expected parameter 'primaryNamespaceId' to be non-null");
            return $;
        }
    }

}
