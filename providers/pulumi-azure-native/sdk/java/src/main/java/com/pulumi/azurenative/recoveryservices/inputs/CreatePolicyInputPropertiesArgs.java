// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.A2APolicyCreationInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaAzurePolicyInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaBluePolicyInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaPolicyInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.InMageAzureV2PolicyInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.InMagePolicyInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.InMageRcmPolicyCreationInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.VMwareCbtPolicyCreationInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Policy creation properties.
 * 
 */
public final class CreatePolicyInputPropertiesArgs extends ResourceArgs {

    public static final CreatePolicyInputPropertiesArgs Empty = new CreatePolicyInputPropertiesArgs();

    /**
     * The ReplicationProviderSettings.
     * 
     */
    @Import(name="providerSpecificInput")
    private @Nullable Output<Object> providerSpecificInput;

    /**
     * @return The ReplicationProviderSettings.
     * 
     */
    public Optional<Output<Object>> providerSpecificInput() {
        return Optional.ofNullable(this.providerSpecificInput);
    }

    private CreatePolicyInputPropertiesArgs() {}

    private CreatePolicyInputPropertiesArgs(CreatePolicyInputPropertiesArgs $) {
        this.providerSpecificInput = $.providerSpecificInput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreatePolicyInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreatePolicyInputPropertiesArgs $;

        public Builder() {
            $ = new CreatePolicyInputPropertiesArgs();
        }

        public Builder(CreatePolicyInputPropertiesArgs defaults) {
            $ = new CreatePolicyInputPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param providerSpecificInput The ReplicationProviderSettings.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(@Nullable Output<Object> providerSpecificInput) {
            $.providerSpecificInput = providerSpecificInput;
            return this;
        }

        /**
         * @param providerSpecificInput The ReplicationProviderSettings.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(Object providerSpecificInput) {
            return providerSpecificInput(Output.of(providerSpecificInput));
        }

        public CreatePolicyInputPropertiesArgs build() {
            return $;
        }
    }

}
