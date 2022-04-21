// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RegistryPolicyState Empty = new RegistryPolicyState();

    @Import(name="policy")
    private @Nullable Output<String> policy;

    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The registry ID where the registry was created.
     * 
     */
    @Import(name="registryId")
    private @Nullable Output<String> registryId;

    public Optional<Output<String>> registryId() {
        return Optional.ofNullable(this.registryId);
    }

    private RegistryPolicyState() {}

    private RegistryPolicyState(RegistryPolicyState $) {
        this.policy = $.policy;
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryPolicyState $;

        public Builder() {
            $ = new RegistryPolicyState();
        }

        public Builder(RegistryPolicyState defaults) {
            $ = new RegistryPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public Builder registryId(@Nullable Output<String> registryId) {
            $.registryId = registryId;
            return this;
        }

        public Builder registryId(String registryId) {
            return registryId(Output.of(registryId));
        }

        public RegistryPolicyState build() {
            return $;
        }
    }

}
